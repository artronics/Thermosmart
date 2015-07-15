package artronics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        try {
            Scanner in = new Scanner(new File(path));
            int value = in.nextInt();
            in.close();
            return value;
        } catch (IOException e) {
            System.out.println("An Error ocured during reading file.");
            e.printStackTrace();
        }
    }
}
