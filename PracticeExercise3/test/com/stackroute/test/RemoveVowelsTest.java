package com.stackroute.test;

import com.stackroute.pe3.RemoveVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels obj;
    @Before
    public void setUp() throws Exception {
        obj=new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeVowelsTest() {
        int numOfPlaces=2;
        String places[]={"india","usa"};
        assertTrue("",obj.removeVowels(numOfPlaces,places));
    }
}