package io.quantus.cmdgen;

import picocli.CommandLine;

public class Main {

    public static void main(String[] args) {

        CommandLine cmd = new CommandLine(new CmdgenApp());

        cmd.parseWithHandler(new CommandLine.RunAll(), args);

    }
}
