package artronics;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jalal on 15/07/15.
 */
public final class ReadFromFile
{

    private String Content;

    private ReadFromFile()
    {
    }

    public static int Read(String path) throws IOException
    {
        int value=20;
        try {
            Scanner in = new Scanner(new File(path));
            value = in.nextInt();
            in.close();
        } catch (IOException e) {
            System.out.println("An Error ocured during reading file.\n" +
                    "If you are runnig this program for the" +
                    " first time, first you have to set temperature.\n" +
                    "Use this command for setting temperature:\n" +
                    "java -jar Thermosmart --set <value-of-temperature>");
            //e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Data in file \"data.tx\" is not valid.");
        }

        return value;
    }
}
