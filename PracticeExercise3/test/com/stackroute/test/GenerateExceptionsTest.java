package com.stackroute.test;

import com.stackroute.pe3.GenerateExceptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionsTest {
    GenerateExceptions genExcepObj;
    @Before
    public void setUp() throws Exception {
        genExcepObj=new GenerateExceptions();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGenerateNegativeArraySizeExceptions(){
        genExcepObj.generateNegativeArraySizeExceptions();
    }
    @Test
    public void testGenerateIndexOutOfBoundsExceptions(){
        genExcepObj.generateIndexOutOfBoundsExceptions();
    }
    @Test
    public void testGenerateNullPointerException() {
        genExcepObj.generateNullPointerException();
    }


}