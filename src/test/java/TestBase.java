import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod
    public void setup(){
        System.out.println("<<<Przed każdą metodą testową!");
    }

    @AfterMethod
    public void cleanup(){
        System.out.println(">>>Po kazdej metodzie testowej!");
    }

}
