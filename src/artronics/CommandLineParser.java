package artronics;

//import org.apache.commons.cli.Option;


import java.lang.reflect.Array;

/**
 * This class will parse the command line options
 * It is a singleton pattern
 */
public class CommandLineParser {
    private static CommandLineParser instance;
    public CommandLineParser() {
    }

    public static CommandLineParser getInstance(){
        if (instance == null){
            return new CommandLineParser();
        }
        return instance;
    }

    //private org.apache.commons.cli.Options options;

    private void CreateOptions(){

        //org.apache.commons.cli.Option help = new org.apache.commons.cli.Option("help", "Print this message");
        //this.options.

    }
    public static void Parse(String[] args){
        if (args.length==0){

        }
        //org.apache.commons.cli.Option;
    }
}
