package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile{
    public int write(String content) throws IOException {
        //final String dir = System.getProperty("user.dir");
        //Path filePath = Paths.get(dir).getParent();

        File data = new File("data.txt");
        data.createNewFile();
        FileWriter writer = new FileWriter(data, false); // true to append
        // false to overwrite.
        writer.write(content);
        writer.close();
        return 0;
    }

}
