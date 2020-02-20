package test.java;

import main.java.lesson1.Task5;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class homeTaskUnitTest3 {
    Task5 task5;

    @BeforeMethod
    public void beforeTest() {
        task5 = new Task5();
    }

    @Test
    public void Test1() {
        String st = "Hello world!!!";
        assertEquals("!!!dlrow olleH", task5.revertString(st));
    }

    @Test
    public void Test2() {
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 1);
        assertEquals("H", task5.revertString(lastChar));
    }

    @Test
    public void Test3() {
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 5);
        assertEquals("Hello", task5.revertString(lastChar));
    }

    @Test
    public void Test4() {
        String s = "!!!dlrow olleH";
        int len = s.length();
        assertEquals(len, task5.revertString("Hello world!!!").length());
    }

}
