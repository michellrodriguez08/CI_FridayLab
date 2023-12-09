package com.example.diceproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DiceProjectApplicationTests {

    @Test
    void contextLoads() {
        DiceProjectApplication.main(new String[] {});
    }

    @Test
    public void testRollInRange() {
        Dice sixSidedDie = new Dice(6, "Red");
        int result = sixSidedDie.roll();
        assertTrue(result >= 1 && result <= 6, "Roll result should be between 1 and 6");
    }



}
