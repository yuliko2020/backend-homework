package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskMiddleTwoTest {
    @Test
    public void evenLengthString_ReturnStringOfTwoCenterCharacter() {
        String a = "string";
        String exp = "ri";
        assertEquals(exp, TaskMiddleTwo.middleTwo(a));
    }

}