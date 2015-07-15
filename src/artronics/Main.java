package artronics;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a value for temperature in Celsius");
        //CommandLineParser.Parse(args);
        if (args.length==0){
            ReadTemperature();
            
        }
    }

    private static void ReadTemperature()
    {
        int temperature = ReadFromFile().Read("data.txt");
    }

    private static void WriteTemperature() throws IOException {
        Temperature temperature=new Temperature();
        Scanner in = new Scanner(System.in);
        try {
            temperature.setValue(in.nextInt());
            WriteToFile.write(temperature.getValue());
        }
        catch (InputMismatchException e){
            System.out.println("You entered wrong value. The value for temperature must be a number.");
        }
    }
}
