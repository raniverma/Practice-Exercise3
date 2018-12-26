package com.stackroute.test;

import com.stackroute.pe3.ConsecutiveNumbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers obj;
    @Before
    public void setUp() throws Exception {
        obj=new ConsecutiveNumbers();

    }
    @Test
    public void testFunctionCalledProperly(){
        String list="";
        assertTrue( "function executed correctly",obj.isConsecutive(list));
    }
}