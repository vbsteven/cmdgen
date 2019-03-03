package io.quantus.cmdgen;

import picocli.CommandLine;

@CommandLine.Command(name = "ruby", description = "Generates a ruby script", subcommands = {CommandLine.HelpCommand.class, RubyPipeCommand.class})
public class RubyCommand implements Runnable {
    @Override
    public void run() {
        System.out.printf("Outputting ruby pipe script\n");

    }
}
