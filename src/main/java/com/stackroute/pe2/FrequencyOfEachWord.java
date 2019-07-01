package com.stackroute.pe2;

import java.io.File;
import java.util.*;

public class FrequencyOfEachWord {

    public static void setMap(File file)
    {

        String fileString=FindAllFilesAndRead.readFile(file);
        fileString=fileString.replace(","," ");
        fileString=fileString.replace("."," ");
        String WordsList[]=fileString.trim().toLowerCase().split("\\s+");
        Arrays.sort(WordsList);
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : WordsList) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }


        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Word " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }










    }
}
