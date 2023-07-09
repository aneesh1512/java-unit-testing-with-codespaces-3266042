import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = { "Monday", "Tuesday" };

        String actual[] = hairSalon.getOpeningDays();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        // String expected = true;
        // assertTrue(hairSalon.isOpen("monday"));

    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        // assertFalse(hairSalon.isOpen("wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        assertThrows(Exception.class, () -> hairSalon.isOpen("lasmcfoasn"));
    }

}