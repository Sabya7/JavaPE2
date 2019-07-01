package com.stackroute.pe2;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FindAllFilesAndReadTest {

    @Test
    public void findFilteredFilesShouldListAllJavaFiles() {
        File file=new File("/home/sabya/JavaPE2/src/main/test/com/stackroute/pe2");
        File[] result=FindAllFilesAndRead.FindFilteredFiles(file);

    }

    @Test
    public void readFileShouldReturnContentAsString() {
        File file=new File("/home/sabya/JavaPE2/src/main/test/com/stackroute/pe2/EvenNumTestTest.java");
        String result=FindAllFilesAndRead.readFile(file);
        assertEquals("package com.stackroute.pe2;\n" +
                "\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "import static org.junit.Assert.*;\n" +
                "\n" +
                "public class EvenNumTestTest {\n" +
                "\n" +
                "    @Test\n" +
                "    public void isEvenShouldReturnTrue() {\n" +
                "        boolean result=EvenNumTest.isEven(12);\n" +
                "        assertEquals(true,result);\n" +
                "    }\n" +
                "    @Test\n" +
                "    public void isEvenShouldReturnTrue2() {\n" +
                "        boolean result=EvenNumTest.isEven(0);\n" +
                "        assertEquals(true,result);\n" +
                "    }\n" +
                "    @Test\n" +
                "    public void isEvenShouldReturnFalse() {\n" +
                "        boolean result=EvenNumTest.isEven(17);\n" +
                "        assertEquals(true,result);\n" +
                "    }\n" +
                "}",result);
    }
}