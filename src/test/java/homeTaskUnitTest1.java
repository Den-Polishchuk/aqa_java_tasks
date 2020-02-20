package test.java;

import main.java.lesson1.Task1;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class homeTaskUnitTest1 {
    public Task1 task1;

    @BeforeMethod
    public void beforeTest(){
        task1 = new Task1();
    }


    @Test(dataProvider = "provider")
    public void minCheck(int expectedMinNumber, int a, int b, int c, String orderOfRun){
        assertEquals(expectedMinNumber, task1.min(a, b ,c), orderOfRun);
    }

    @DataProvider(name = "provider")
    public Object[][] provider(){
        return new Object[][]{
                {2, 2, 6, 17, "First"},
                {4, 35, 4, -6, "Second"},
                {8, 8, 9, 14, "Third"},
                {-1, 20, 6, -1, "Fourth"},
                {0, 0, -0, +0, "Fifth"},
        };
    }
}
