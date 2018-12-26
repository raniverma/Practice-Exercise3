package com.stackroute.test;

import com.stackroute.pe3.DayOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfWeekTest {
    DayOfWeek obj;
    @Before
    public void setUp() throws Exception {
        obj=new DayOfWeek();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findFirstAndLastDatesOfWeekTest() {
        assertTrue( "function executed correctly",obj.findFirstAndLastDatesOfWeek());
    }
}