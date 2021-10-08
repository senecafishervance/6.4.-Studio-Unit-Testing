package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testStringWithBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchCode]"));

    }

    @Test
    public void testNoBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testStringNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void testOppositeBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testMaxSuggestion () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Max]["));
    }

}
