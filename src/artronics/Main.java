package artronics;

import com.sun.deploy.uitoolkit.impl.awt.AWTModalityHelper;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        CommandParser commandParser = CommandParser.getInstance();
        CommandLine commandLine = commandParser.Parse(args);
        OutputStream out = System.out;
        if (args.length==0){
            commandParser.printUsage(out);
        }
        else if (commandLine.hasOption("help")){
            //PrintHelp();
            commandParser.printHelp(
                    80, "Thermosmart help", "Athour: Seyed Jalal Hosseini (jalalhosseiny@gmail.com)",
                    3, 5, true, out);
        }
        else if (commandLine.hasOption("set")){
            String value = commandLine.getOptionValue("set");
            WriteTemperature(value);
        }
        else if (commandLine.hasOption("get")){
            ReadTemperature();
        }
    }

    private static void PrintHelp()
    {
        System.out.println("A help message");
    }

    private static void ReadTemperature() throws IOException
    {
        Temperature temperature =new Temperature();
        temperature.setValue(ReadFromFile.Read("data.txt"));

        System.out.println("Temperature is set to "+temperature.toString());
    }

    private static void WriteTemperature(String value) throws IOException {
        Temperature temperature=new Temperature(value);
        try {
            WriteToFile.write(temperature.getValue());
        }
        catch (InputMismatchException e){
            System.out.println("You entered wrong value. The value for temperature must be a number.");
        }

        System.out.println("New value for temperature has been wirtten to file data.txt.");

        ReadTemperature();
    }
}
