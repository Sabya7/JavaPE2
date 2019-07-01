package com.stackroute.pe2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileAndConvertToUpperCase {

    public static long fileRead(String filename) throws FileNotFoundException
    {    Scanner scanner=null;
        File file=new File(filename);
        try {
             scanner = new Scanner(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        while(scanner.hasNextLine())
            System.out.println(scanner.nextLine().toUpperCase());

        return file.length();

    }
}
