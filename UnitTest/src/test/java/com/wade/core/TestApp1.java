package com.wade.core;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class TestApp1 extends TestCase{
    @Test
    public void testHelloworld(){
        Assert.assertEquals(App.HelloWorld(), "HelloWorld");
    }
}
