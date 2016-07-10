package com.wade.core;
import junit.framework.Assert;
import org.junit.Test;

public class TestApp2{
    @Test
    public void testHelloworld(){
        Assert.assertEquals(App.HelloWorld2(), "HelloWorld2");
    }
}
