package com.stackroute.test;
import com.stackroute.pe3.ChessBoard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard obj;
    @Before
    public void setUp() throws Exception {
        obj=new ChessBoard();

    }
    @Test
    public void testFunctionCalledProperly(){
        assertTrue( "function executed correctly",obj.printChessBoard());
    }
}