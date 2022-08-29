package edu.vt.cs5044;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

/** 
*
* CS 5044 Project 4 
* 
* @author Shannon Smith (shae1223)
* @version 2022.07.14
*
*/

@SuppressWarnings("javadoc")

public class DABGameTest {
    private DotsAndBoxes game;
    private DotsAndBoxes uninitializedGame;

    @Before
    public void setUp() throws Exception {
        game = new DABGame();
        uninitializedGame = new DABGame();  
    } 
    
///////////////////////////// test 3x3 Game ///////////////////////////////    
    
    /*  initialized game 3x3
     *  +------+------+------+
     *  | box  | box  | box  |
     *  |(0, 0)|(1, 0)|(2, 0)|    
     *  +------+------+------+
     *  | box  | box  | box  |
     *  |(0, 1)|(1, 1)|(2, 1)|  
     *  +------+------+------+
     *  | box  | box  | box  |
     *  |(0, 2)|(1, 2)|(2, 2)|  
     *  +------+------+------+ 
     *      
     */
    
    @Test
    public void testGame3x3() { 
        game.init(3); 
        System.out.println("-------------------------------------------------------");
        System.out.println("Current Score is: " + game.getScores()); 
        Coordinate coord00 = new Coordinate(0, 0);
        Collection<Direction> drawnEdges = game.getDrawnEdgesAt(coord00);
        assertTrue(game.getDrawnEdgesAt(coord00).isEmpty()); 
        assertEquals(0, drawnEdges.size()); 
        System.out.println("CURRENT BOX: (0, 0)");
        System.out.println();
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer());    
        System.out.println("Draw Edge (Player One, 0,0 LEFT): " + game.drawEdge(coord00, Direction.LEFT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 0,0 RIGHT): " + game.drawEdge(coord00, Direction.RIGHT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 0,0 TOP): " + game.drawEdge(coord00, Direction.TOP)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer());  
        System.out.println("Draw Edge (Player Two, 0,0 BOTTOM): " + game.drawEdge(coord00, Direction.BOTTOM)); 
        System.out.println();
        System.out.println("BOX OWNER (Player Two, 0,0): " + game.getOwnerAt(coord00)); 
        Collection<Direction> completedBox00 = game.getDrawnEdgesAt(coord00); 
        assertTrue(game.getDrawnEdgesAt(coord00).containsAll(drawnEdges)); 
        assertEquals(4, completedBox00.size()); 
        System.out.println();
        System.out.println("-------------------------------------------------------");
 
        System.out.println();
        System.out.println("Current Score is: " + game.getScores());         
        Coordinate coord10 = new Coordinate(1, 0); 
        System.out.println("CURRENT BOX: (1, 0)");
        System.out.println();
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer());     
        System.out.println("Draw Edge (Player Two, 1,0 LEFT): " + game.drawEdge(coord10, Direction.LEFT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 1,0 RIGHT): " + game.drawEdge(coord10, Direction.RIGHT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 1,0 TOP): " + game.drawEdge(coord10, Direction.TOP)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 1,0 BOTTOM): " + game.drawEdge(coord10, Direction.BOTTOM)); 
        System.out.println(); 
        System.out.println("BOX OWNER (Player Two, 1,0): " + game.getOwnerAt(coord10)); 
        Collection<Direction> completedBox10 = game.getDrawnEdgesAt(coord10); 
        assertTrue(game.getDrawnEdgesAt(coord10).containsAll(drawnEdges)); 
        assertEquals(4, completedBox10.size());
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println();
        System.out.println("Current Score is: " + game.getScores()); 
        Coordinate coord20 = new Coordinate(2, 0);
        System.out.println("CURRENT BOX: (2, 0)");
        System.out.println();
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer());  
        System.out.println("Draw Edge (Player Two, 2,0 LEFT): " + game.drawEdge(coord20, Direction.LEFT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 2,0 RIGHT): " + game.drawEdge(coord20, Direction.RIGHT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 2,0 TOP): " + game.drawEdge(coord20, Direction.TOP)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 2,0 BOTTOM): " + game.drawEdge(coord20, Direction.BOTTOM)); 
        System.out.println(); 
        System.out.println("BOX OWNER (Player Two, 2,0): " + game.getOwnerAt(coord20)); 
        Collection<Direction> completedBox20 = game.getDrawnEdgesAt(coord20); 
        assertTrue(game.getDrawnEdgesAt(coord20).containsAll(drawnEdges)); 
        assertEquals(4, completedBox20.size()); 
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println();
        System.out.println("Current Score is: " + game.getScores()); 
        Coordinate coord01 = new Coordinate(0, 1);
        System.out.println("CURRENT BOX: (0, 1)");
        System.out.println();
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 0,1 LEFT): " + game.drawEdge(coord01, Direction.LEFT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 0,1 RIGHT): " + game.drawEdge(coord01, Direction.RIGHT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 0,1 TOP): " + game.drawEdge(coord01, Direction.TOP)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 0,1 BOTTOM): " + game.drawEdge(coord01, Direction.BOTTOM)); 
        System.out.println(); 
        System.out.println("BOX OWNER (Player Two, 0,1): " + game.getOwnerAt(coord01)); 
        Collection<Direction> completedBox01 = game.getDrawnEdgesAt(coord01); 
        assertTrue(game.getDrawnEdgesAt(coord01).containsAll(drawnEdges)); 
        assertEquals(4, completedBox01.size()); 
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println();
        System.out.println("Current Score is: " + game.getScores());
        Coordinate coord11 = new Coordinate(1, 1);
        System.out.println("CURRENT BOX: (1, 1)");
        System.out.println();
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer());     
        System.out.println("Draw Edge (Player Two, 1,1 LEFT): " + game.drawEdge(coord11, Direction.LEFT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 1,1 RIGHT): " + game.drawEdge(coord11, Direction.RIGHT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer());  
        System.out.println("Draw Edge (Player One, 1,1 TOP): " + game.drawEdge(coord11, Direction.TOP)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 1,1 BOTTOM): " + game.drawEdge(coord11, Direction.BOTTOM)); 
        System.out.println(); 
        System.out.println("BOX OWNER (Player One, 1,1): " + game.getOwnerAt(coord11)); 
        Collection<Direction> completedBox11 = game.getDrawnEdgesAt(coord11); 
        assertTrue(game.getDrawnEdgesAt(coord11).containsAll(drawnEdges)); 
        assertEquals(4, completedBox11.size()); 
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println();
        System.out.println("Current Score is: " + game.getScores());
        Coordinate coord21 = new Coordinate(2, 1);
        System.out.println("CURRENT BOX: (2, 1)");
        System.out.println();
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer());   
        System.out.println("Draw Edge (Player One, 2,1 LEFT): " + game.drawEdge(coord21, Direction.LEFT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 2,1 RIGHT): " + game.drawEdge(coord21, Direction.RIGHT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 2,1 TOP): " + game.drawEdge(coord21, Direction.TOP)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 2,1 BOTTOM): " + game.drawEdge(coord21, Direction.BOTTOM)); 
        System.out.println(); 
        System.out.println("BOX OWNER (Player Two, 2,1): " + game.getOwnerAt(coord21)); 
        Collection<Direction> completedBox21= game.getDrawnEdgesAt(coord21); 
        assertTrue(game.getDrawnEdgesAt(coord21).containsAll(drawnEdges)); 
        assertEquals(4, completedBox21.size()); 
        System.out.println();
        System.out.println("-------------------------------------------------------");
        
        System.out.println();
        System.out.println("Current Score is: " + game.getScores());
        Coordinate coord02 = new Coordinate(0, 2);
        System.out.println("CURRENT BOX: (0, 2)");
        System.out.println();
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer());       
        System.out.println("Draw Edge (Player Two, 0,2 LEFT): " + game.drawEdge(coord02, Direction.LEFT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 0,2 RIGHT): " + game.drawEdge(coord02, Direction.RIGHT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer());
        System.out.println("Draw Edge (Player Two, 0,2 TOP): " + game.drawEdge(coord02, Direction.TOP)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 0,2 BOTTOM): " + game.drawEdge(coord02, Direction.BOTTOM)); 
        System.out.println(); 
        System.out.println("BOX OWNER (Player Two, 0,2): " + game.getOwnerAt(coord02)); 
        Collection<Direction> completedBox02= game.getDrawnEdgesAt(coord02); 
        assertTrue(game.getDrawnEdgesAt(coord02).containsAll(drawnEdges)); 
        assertEquals(4, completedBox02.size());
        System.out.println();
        System.out.println("-------------------------------------------------------");
        
        System.out.println(); 
        System.out.println("Current Score is: " + game.getScores());
        Coordinate coord12 = new Coordinate(1, 2);
        System.out.println("CURRENT BOX: (1, 2)");
        System.out.println(); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer());       
        System.out.println("Draw Edge (Player Two, 1,2 LEFT): " + game.drawEdge(coord12, Direction.LEFT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 1,2 RIGHT): " + game.drawEdge(coord12, Direction.RIGHT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 1,2 TOP): " + game.drawEdge(coord12, Direction.TOP)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 1,2 BOTTOM): " + game.drawEdge(coord12, Direction.BOTTOM)); 
        System.out.println(); 
        System.out.println("BOX OWNER (Player One, 1,2): " + game.getOwnerAt(coord12)); 
        Collection<Direction> completedBox12 = game.getDrawnEdgesAt(coord12); 
        assertTrue(game.getDrawnEdgesAt(coord12).containsAll(drawnEdges)); 
        assertEquals(4, completedBox12.size()); 
        System.out.println();
        System.out.println("-------------------------------------------------------"); 
        
        System.out.println(); 
        System.out.println("Current Score is: " + game.getScores());
        Coordinate coord22 = new Coordinate(2, 2);
        System.out.println("CURRENT BOX: (2, 2)");  
        System.out.println(); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer());      
        System.out.println("Draw Edge (Player One, 2,2 LEFT): " + game.drawEdge(coord22, Direction.LEFT)); 
        System.out.println("Current Player: (ONE) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player One, 2,2 RIGHT): " + game.drawEdge(coord22, Direction.RIGHT)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 2,2 TOP): " + game.drawEdge(coord22, Direction.TOP)); 
        System.out.println("Current Player: (TWO) " + game.getCurrentPlayer()); 
        System.out.println("Draw Edge (Player Two, 2,2 BOTTOM): " + game.drawEdge(coord22, Direction.BOTTOM));
        System.out.println(); 
        System.out.println("BOX OWNER (Player Two, 2,2): " + game.getOwnerAt(coord22)); 
        Collection<Direction> completedBox22= game.getDrawnEdgesAt(coord22); 
        assertTrue(game.getDrawnEdgesAt(coord22).containsAll(drawnEdges)); 
        assertEquals(4, completedBox22.size());  
        System.out.println();
        System.out.println("-------------------------------------------------------"); 
        
        System.out.println();
        System.out.println("WINNER IS: Player " + game.getOwnerAt(coord00));      
        System.out.println("FINAL SCORE IS: " + game.getScores()); 
        
        System.out.println();
        System.out.println("Current Player is: (null) " + game.getCurrentPlayer());
    }   

///////////////////////// testGetCompletedAdjBox ////////////////////////// 
    
    @Test
    public void testGetCompletedAdjBox() {
        game.init(4);
        Coordinate coord00 = new Coordinate(0, 0);
        Coordinate coord10 = new Coordinate(1, 0);
        assertTrue(game.getDrawnEdgesAt(coord00).isEmpty()); 
        game.drawEdge(coord00, Direction.LEFT);
        game.drawEdge(coord00, Direction.TOP);
        game.drawEdge(coord00, Direction.BOTTOM);
        game.drawEdge(coord10, Direction.LEFT);
        Collection<Direction> completedBox00= game.getDrawnEdgesAt(coord00); 
        assertEquals(4, completedBox00.size()); 
    }
    
/////////////////////////// testGetCompletedBox /////////////////////////// 
    
    @Test
    public void testGetCompletedBox() {
        game.init(4);
        Coordinate coord00 = new Coordinate(0, 0);
        Collection<Direction> drawnEdges = game.getDrawnEdgesAt(coord00);
        assertTrue(game.getDrawnEdgesAt(coord00).isEmpty()); 
        game.drawEdge(coord00, Direction.RIGHT);
        game.drawEdge(coord00, Direction.LEFT);
        game.drawEdge(coord00, Direction.TOP);
        game.drawEdge(coord00, Direction.BOTTOM);
        assertTrue(game.getDrawnEdgesAt(coord00).containsAll(drawnEdges)); 
    }

////////////////////////////// testDrawEdge /////////////////////////////// 
   
    @Test
    public void testDrawEdgeRight() {   
        game.init(4);
        game.drawEdge(new Coordinate (0, 0), Direction.RIGHT);
        assertEquals(true, 
            game.getDrawnEdgesAt(new Coordinate(0, 0)).contains(Direction.RIGHT));
    }   
   
////////////////////////// testGetCurrentPlayer /////////////////////////// 
     
    @Test
    public void testGetCurrentPlayerWithInit() { 
        game.init(4);
        game.getCurrentPlayer();
    }

    @Test(expected=GameException.class)
    public void testGetCurrentPlayerWithNoInit() { 
        uninitializedGame.getCurrentPlayer();   
    }
    
//////////////////////////// testGetDrawnEdges //////////////////////////// 

    @Test
    public void testGetDrawnEdgesCorruption() {
        game.init(2);
        Coordinate coord00 = new Coordinate(0, 0);
        Collection<Direction> drawnEdges = game.getDrawnEdgesAt(coord00);
        assertTrue(game.getDrawnEdgesAt(coord00).isEmpty());
        drawnEdges.add(Direction.RIGHT); 
        assertTrue(game.getDrawnEdgesAt(coord00).isEmpty()); 
    }

    @Test
    public void testGetDrawnEdgesNewEdge() {  
        game.init(4);
        Coordinate coord00 = new Coordinate(0, 0);
        game.drawEdge(coord00, Direction.LEFT); 
        Collection<Direction> oneDrawnEdge = game.getDrawnEdgesAt(coord00); 
        assertEquals(1, oneDrawnEdge.size()); 
        game.drawEdge(coord00, Direction.RIGHT); 
        assertEquals(1, oneDrawnEdge.size()); 
    }

    @Test
    public void testGetDrawnEdgesLeft() {
        game.init(4);
        Coordinate coord00 = new Coordinate(0, 0);
        game.drawEdge(coord00, Direction.LEFT); 
        Collection<Direction> oneDrawnEdge = game.getDrawnEdgesAt(coord00); 
        assertEquals(1, oneDrawnEdge.size()); 
    }
    
    @Test
    public void testDrawEdgeNullDirection() {
        game.init(5);
        try {
            game.drawEdge(new Coordinate(2, 2), null);
            fail("Expected a GameException");
        } catch (GameException ge) {
            // PASS!!!
        }
    }
    
    @Test
    public void testGetDrawnEdgesAtWithInit() {  
        game.init(4);
        game.getDrawnEdgesAt(new Coordinate(0, 0));
    }   
  
    @Test(expected=GameException.class)
    public void testGetDrawnEdgesAtWithInvalidLocation() { 
        uninitializedGame.getDrawnEdgesAt(new Coordinate(2, 2));
    }
    
    @Test(expected=GameException.class)
    public void testGetDrawnEdgesAtWithNoInit() { 
        uninitializedGame.getDrawnEdgesAt(new Coordinate(0, 0));
    }
 
///////////////////////////// testGetOwnerAt //////////////////////////////  
   
    @Test
    public void testGetOwnerAtWithInit() { 
        game.init(4);
        game.getOwnerAt(new Coordinate(0, 0));
    }

    @Test(expected=GameException.class)
    public void testGetOwnerAtWithNoInit() { 
        uninitializedGame.getOwnerAt(new Coordinate(2, 2)); 
    }

    @Test(expected=GameException.class) 
    public void testGetOwnerAtWithInvalidLocation() { 
        uninitializedGame.getOwnerAt(new Coordinate(0, 0)); 
    }
    
////////////////////////////// testGetScores ////////////////////////////// 

    @Test
    public void testGetScoresWithInit() { 
        game.init(4);
        game.getScores();
    }
    
    @Test(expected=GameException.class)
    public void testGetScoresWithNoInit() { 
        uninitializedGame.getScores(); 
    }
   
/////////////////////////////// testGetSize ///////////////////////////////
    
 
    @Test
    public void testGetSizeWithInit() { 
        game.init(4);
        game.getSize(); 
        System.out.println(game.getSize());
    }

    @Test(expected=GameException.class)
    public void testGetSizeWithNoInit() { 
        uninitializedGame.getSize();  
    }

/////////////////////////// testInitInvalidSize ///////////////////////////
    
    @Test
    public void testInitInvalidSize() {
        try {
            uninitializedGame.init(1);
            fail("Invalid Init size did not throw exception");
        } catch (GameException ge) { 
            // PASS!!!
        }
        }
     
    @Test
    public void testInitInvalidSizeTwice() { 
        try {
            uninitializedGame.init(1);
            fail("Invalid init size did not throw exception"); 
        } catch (GameException ge) {  
            // PASS!!!
        }
               
        try { 
            game.getSize();
            fail("getSize() did not throw exception"); 
        } catch (GameException ge) {  
            // PASS!!!
        }
    }
} 
