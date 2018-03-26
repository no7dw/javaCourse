package com.wade.core;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Ignore;

//skip the whole test class
//@Ignore
public class TestApp1{
    @Ignore("Takes too long...") //skip one test case
    @Test
    public void testHelloworld(){
        Assert.assertEquals(App.HelloWorld(), "HelloWorld");
    }
    @Test
    public void testHelloworld2(){
        Assert.assertEquals(App.HelloWorld(), "HelloWorld");
    }
}
