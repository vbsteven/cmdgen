package io.quantus.cmdgen;

import picocli.CommandLine;

@CommandLine.Command(name = "cmdgen", subcommands = {
        CommandLine.HelpCommand.class,
        RubyCommand.class
})
public class CmdgenApp implements Runnable {


    @Override
    public void run() {
    }

}
