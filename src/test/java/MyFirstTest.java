import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {
    @AfterMethod
    public void cleanup(){
        System.out.println(">>>Po kazdej metodzie testowej!");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("<<<Przed każdą metodą testową!");
    }

    @Test
    public void shouldAddTwoZeros(){
        System.out.println("start testu 0+0");
        int result = add(0,0);
        Assert.assertEquals(result,0);
        System.out.println("koniec testu 0+0");
    }
    public int add(int a, int b){
        return a+a;
    }
    @Test
    public void shouldAddTwoPositiveNumbers(){
        System.out.println("start testu 1+3");
        Assert.assertEquals(add(1,3),4);
        System.out.println("koniec testu 1+3");
    }
}