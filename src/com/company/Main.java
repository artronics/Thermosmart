package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Temperature temperature=new Temperature();
        System.out.println("Please enter a value for temperature in Celsius");
        Scanner in = new Scanner(System.in);
        try {
            temperature.setValue(in.nextInt());
        }
        catch (InputMismatchException e){
            System.out.println("You entered wrong value. The value for temperature must be a number.");
        }
    }
}
