package com.stackroute.pe2;

import java.io.*;
//a program to find all files of a folder and select only given extension fileName and
//read content of this file using byte array
public class FindAllFilesAndRead {

    public static File[] FindFilteredFiles(File dir)
    {
        FilenameFilter filter = new FilenameFilter() {

            public boolean accept(File file, String name)
            {
                return name.endsWith("java");
            }
        };
        File[] files = dir.listFiles(filter);
        for(File f:files) System.out.println(f.getName());
        return files;
    }

    static String readFile(File file)
    {

        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream(file);

            byte fileContent[] = new byte[(int)file.length()];
            try {
                 fileInputStream.read(fileContent);
            }
            catch (IOException e){
                e.printStackTrace();
            }

            return new String(fileContent);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
