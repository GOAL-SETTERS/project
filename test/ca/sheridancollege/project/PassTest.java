/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lovepreet KAur
 */
public class PassTest {

    public PassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Good Test check length regardless of Uppercase and special characters
     */
    @Test
    public void testGoodChecklength() {
        System.out.println("checklength");
        String s = "goodlength";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.checklength(s);
        assertEquals(expResult, result);

    }

    /**
     * Bad Test check length regardless of Uppercase and special characters
     */
    @Test
    public void testBadChecklength() {
        System.out.println("checklength");
        String s = "length";
        Card instance = new Card();
        boolean expResult = false;
        boolean result = instance.checklength(s);
        assertEquals(expResult, result);

    }

    /**
     * Boundary Test check length regardless of Uppercase and special characters
     */
    @Test
    public void testBoundaryChecklength() {
        System.out.println("checklength");
        String s = "boundary";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.checklength(s);
        assertEquals(expResult, result);

    }

    /**
     * Good Test check length regardless of length and special characters
     */

    @Test
    public void testGoodCheckUppercase() {
        System.out.println("checkUppercase");
        String s = "UpperCase";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.checkUppercase(s);
        assertEquals(expResult, result);

    }

    /**
     * Bad Test check length regardless of length and special characters
     */

    @Test
    public void testBadCheckUppercase() {
        System.out.println("checkUppercase");
        String s = "lowercase";
        Card instance = new Card();
        boolean expResult = false;
        boolean result = instance.checkUppercase(s);
        assertEquals(expResult, result);

    }

    /**
     * Boundary Test check length regardless of length and special characters
     */

    @Test
    public void testBoundaryCheckUppercase() {
        System.out.println("checkUppercase");
        String s = "Uppercase";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.checkUppercase(s);
        assertEquals(expResult, result);

    }

    /**
     * Good Test check length regardless of length and special characters
     */
    @Test
    public void testGoodCheckSpecialCharacter() {
        System.out.println("checkSpecialCharacter");
        String s = "$peci@l";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.checkSpecialCharacter(s);
        assertEquals(expResult, result);

    }

    /**
     * Bad Test check length regardless of length and special characters
     */
    @Test
    public void testBadCheckSpecialCharacter() {
        System.out.println("checkSpecialCharacter");
        String s = "character";
        Card instance = new Card();
        boolean expResult = false;
        boolean result = instance.checkSpecialCharacter(s);
        assertEquals(expResult, result);

    }

    /**
     * Boundary Test check length regardless of length and special characters
     */
    @Test
    public void testBoundaryCheckSpecialCharacter() {
        System.out.println("checkSpecialCharacter");
        String s = "Speci@l";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.checkSpecialCharacter(s);
        assertEquals(expResult, result);

    }
}
