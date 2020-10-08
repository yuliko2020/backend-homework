package lesson20200925HwTasksBeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TaskSleepInTest {
    @Test
    public void testWeekDayWorkingNotVacation() {
        boolean weekday = true;
        boolean vacation = false;

        boolean expected = TaskSleepIn.sleepIn(weekday, vacation);

        assertFalse(expected);
    }

    @Test
    public void testWeekDayWeekendVacation() {
        boolean weekday = false;
        boolean vacation = true;

        boolean expected = TaskSleepIn.sleepIn(weekday, vacation);

        assertTrue(expected);
    }

    @Test
    public void testWeekDayWorkingVacation() {
        boolean weekday = true;
        boolean vacation = true;

        boolean expected = TaskSleepIn.sleepIn(weekday, vacation);

        assertTrue(expected);

    }

    @Test
    public void testWeekDayWeekendNotVacation() {
        boolean weekday = false;
        boolean vacation = false;
        boolean expected = TaskSleepIn.sleepIn(weekday, vacation);
        assertTrue(expected);
    }


}