/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher's Laptop
 */
public class GameTest {
    
    public GameTest() {
    }

    /**
     * Test of createBoard method, of class Game.
     */
    @Test
    public void testCreateBoard() {
        System.out.println("createBoard");
        Game instance = new Game();
        instance.createBoard();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(9, instance.gameBoard[0].length * instance.gameBoard[1].length);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of currentPlayer method, of class Game.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("currentPlayer");
        Game instance = new Game();
        instance.createBoard();
        String expResult = "";
        String result = instance.currentPlayer();
        assertEquals("X", result);
        instance.changePlayer();
        result = instance.currentPlayer();
        assertEquals("O", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayer method, of class Game.
     */
//    @Test
//    public void testChangePlayer() {
//        System.out.println("changePlayer");
//        Game instance = new Game();
//        instance.changePlayer();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of makeMove method, of class Game.
     */
    @Test
    public void testMakeMove() {
        System.out.println("makeMove");
        int x = 0;
        int y = 0;
        Game instance = new Game();
        instance.createBoard();
        instance.makeMove(x, y);
        assertEquals("X", instance.gameBoard[x][y]);
        x = 1;
        y = 1;
        instance.changePlayer();
        instance.makeMove(x, y);
        assertEquals("O", instance.gameBoard[x][y]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of spaceInUse method, of class Game.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("spaceInUse");
        int x = 0;
        int y = 0;
        Game instance = new Game();
        instance.createBoard();
        boolean expResult = false;
        boolean result = instance.spaceInUse(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
