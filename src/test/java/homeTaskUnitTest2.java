package test.java;

import main.java.lesson1.Task2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class homeTaskUnitTest2 {
    Task2 task2;

    @BeforeMethod
    public void beforeTest() {
        task2 = new Task2();
    }


    @Test
    public void Test1() {
        String name = "Den";
        String str = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                str += name + " ";
            }
            str += "\n";
        }
        assertEquals(str, task2.namePrint());
    }


    @Parameters({"login"})
    @Test
    public void Test2(String login) {
        System.out.println(login);
        String name = "Den";
        String str = "";
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 10; j++) {
                str += name + " ";
            }
            str += "\n";
        }
        assertNotEquals(str, task2.namePrint());
    }


    @Test
    public void Test3() {
        assertEquals(206, task2.namePrint().length());
    }
}
