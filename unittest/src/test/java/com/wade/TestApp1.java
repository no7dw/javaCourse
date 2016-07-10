package com.wade.core;
import junit.framework.Assert;
import org.junit.Test;

public class TestApp1{
    @Test
    public void testHelloworld(){
        Assert.assertEquals(App.HelloWorld(), "HelloWorld");
    }
}
