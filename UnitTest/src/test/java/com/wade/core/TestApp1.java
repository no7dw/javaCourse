package com.wade.core;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Ignore;

@Ignore
public class TestApp1{
    @Test
    public void testHelloworld(){
        Assert.assertEquals(App.HelloWorld(), "HelloWorld");
    }
}
