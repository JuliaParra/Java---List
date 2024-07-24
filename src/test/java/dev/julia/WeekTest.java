package dev.julia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeekTest {

    private Week week;

    @BeforeEach
    public void setUp() {
        week = new Week();
    }

    @Test
    public void testCreateWeekDays() {
        week.createWeekDays();
        assertEquals(7, week.getSize());
    }

    @Test
    public void testGetDays() {
        week.createWeekDays();
        assertNotNull(week.getDays());
        assertEquals(7, week.getDays().size());
    }

    @Test
    public void testGetSize() {
        week.createWeekDays();
        assertEquals(7, week.getSize());
    }

    @Test
    public void testRemoveDay() {
        week.createWeekDays();
        assertTrue(week.removeDay("Tuesday"));
        assertFalse(week.removeDay("Tuesday")); // already removed
    }

    @Test
    public void testGetDay() {
        week.createWeekDays();
        assertEquals("Monday", week.getDay(0));
        assertNull(week.getDay(10)); // index out of range
    }

    @Test
    public void testExistsDay() {
        week.createWeekDays();
        assertTrue(week.existsDay("Wednesday"));
        assertFalse(week.existsDay("Funday")); // non-existent day
    }

    @Test
    public void testSortDays() {
        week.createWeekDays();
        week.sortDays();
        assertEquals("Friday", week.getDay(0));
    }

    @Test
    public void testClearDays() {
        week.createWeekDays();
        week.clearDays();
        assertEquals(0, week.getSize());
    }
}

