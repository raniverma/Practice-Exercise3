package com.stackroute.test;

import com.stackroute.pe3.Matrix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    Matrix obj;

    @Before
    public void setUp() throws Exception {
        obj=new Matrix();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void matrixAdditionTest() {
        int numOfRows=2;
        int numOfCols=3;
        int [][] matrix1=new int[numOfRows][numOfCols];
        int [][] matrix2=new int[numOfRows][numOfCols];
        assertTrue( "function executed correctly",obj.MatrixAddition(numOfRows,numOfCols,matrix1,matrix2));
    }
}