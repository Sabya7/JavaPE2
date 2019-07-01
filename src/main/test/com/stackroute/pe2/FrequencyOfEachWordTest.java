package com.stackroute.pe2;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FrequencyOfEachWordTest {

    @Test
    public void setMap() {
        File file=new File("/home/sabya/JavaPE2/src/main/java/com/stackroute/pe2/demo1.txt");
        FrequencyOfEachWord.setMap(file);
    }
}