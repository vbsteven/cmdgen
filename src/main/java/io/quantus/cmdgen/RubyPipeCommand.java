package io.quantus.cmdgen;

import picocli.CommandLine;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermissions;

@CommandLine.Command(name = "pipe", description = "Generates a ruby script for use as a unix pipe")
public class RubyPipeCommand implements Runnable {

    @CommandLine.Parameters(paramLabel = "FILENAME", index = "0")
    private Path filename;

    @Override
    public void run() {
        System.out.printf("Generating pipe script at %s\n", filename);

        outputTemplateToFile("ruby/pipe/template.rb", filename);
    }


    public void outputTemplateToFile(String template, Path path) {

        InputStream in = getClass().getClassLoader().getResourceAsStream(template);

        try {
            Files.copy(in, filename);

            // make it executable
            var posixFilePermissions = PosixFilePermissions.fromString("rwxrwxr-x");
            Files.setPosixFilePermissions(path, posixFilePermissions);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
