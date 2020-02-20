package test.java;

import main.java.lesson1.Task1;
import main.java.lesson1.Task2;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class homeTaskTests {
    Task1 task1;
    Task2 task2;



    @Test
    public void minNumCheck1() {
        task1 = new Task1();
        int expected = 10;
        int actual = task1.minimal();
        assertEquals(expected, actual,
                String.format("Expected %d to be equal %d", expected, actual));
    }


    @Parameters({"login"})
    @Test
    public void minNumCheck2(String login) {
        task1 = new Task1();
        System.out.println(login);
        int expected = 10;
        int actual = task1.minimal();
        assertEquals(expected, actual,
                String.format("Expected %d to be equal %d", expected, actual));
    }

}
