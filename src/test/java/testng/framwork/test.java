package testng.framwork;


import io.cucumber.java.it.Ma;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class test {

    @Test(dataProvider = "testData")
    public void test(String q, String a){
        System.out.println("q = " + q);
        System.out.println("a= " + a);


    }
    @DataProvider(name = "testData")
    public Object [] []  testdata(){


        return new Object[][]{{"hello","hello back"},
                              {"job","yes"}};
    }

}
