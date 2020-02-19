package test.java;

import main.java.lesson1.Task1;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class homeTaskTests2 {
    Task1 task1;

    @BeforeMethod
    public void setUp(){
        task1 = new Task1();
    }


    @Test(dataProvider = "provider")
    public void minNumCheck2(int expected, int actual, String str) {
        System.out.println(str);
        actual = task1.minimal();
        assertEquals(expected, actual,
                String.format("Expected %d to be equal %d", expected, actual));
    }


    @DataProvider(name = "provider")
    public Object[][] provider(){
        return new Object[][]{
                {10, task1.minimal(), "First"},
                {14, task1.minimal(), "Second"},
                {17, task1.minimal(), "Third"},
                {11, task1.minimal(), "Fourth"},
                {9, task1.minimal(), "Fifth"},
        };
    }

}
