package com.JUtils.base;

import junit.framework.Assert;
import org.junit.Test;

public class ConvertUtilsTest{
    @Test
    public void strToInt(){
        Assert.assertEquals(ConvertUtils.strToInt("1", 1), 1);
    }
}

