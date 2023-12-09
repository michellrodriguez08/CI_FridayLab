package com.example.diceproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

//    @Test
//    void contextLoads() {
//        Dice.main(new String[] {});
//    }
    @Test
    public void testRollInRange() {
        Dice sixSidedDie = new Dice(6, "Red");
        int result = sixSidedDie.roll();
        assertTrue(result >= 1 && result <= 6, "Roll result should be between 1 and 6");
    }
}