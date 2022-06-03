package DateValidationTest;

import CheckDateValidation.CheckDateValidation;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateValidationTest {

    CheckDateValidation date;

    public DateValidationTest() {
        date = new CheckDateValidation();
    }

    @Test
    public void testIsLeap() {
        boolean rs = date.isLeap(2013);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testIsLeap1() {
        boolean rs = date.isLeap(2012);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInLeapYear1() {
        boolean rs = date.valid(2000, 2, 29);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInLeapYear2() {
        boolean rs = date.valid(2001, 2, 29);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInLeapYear3() {
        boolean rs = date.valid(2001, 2, 28);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testInputNotANumber1() {
        boolean rs = date.checkValidStringDate("kdgfdlk/05/15");
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testInputNotANumber2() {
        boolean rs = date.checkValidStringDate("2000/...$./15");
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testInputNotANumber3() {
        boolean rs = date.checkValidStringDate("2000/3/-5b");
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testInputNotANumber4() {
        boolean rs = date.checkValidStringDate("$%%#$%/$%/{}Ư-");
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testOutOfDateRange1() {
        boolean rs = date.valid(2017, 03, 32);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testOutOfDateRange2() {
        boolean rs = date.valid(2017, 04, 0);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testOutOfDateRange3() {
        boolean rs = date.valid(2017, 04, -1);
        boolean expected = false;
        assertEquals(expected, rs);
    }


    @Test
    public void testOutOfMonthRange1() {
        boolean rs = date.valid(2000, 13, 1);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testOutOfMonthRange2() {
        boolean rs = date.valid(2000, -2, 1);
        boolean expected = false;
        assertEquals(expected, rs);
    }
    @Test
    public void testOutOfMonthRange3() {
        boolean rs = date.valid(2000, 0, 1);
        boolean expected = false;
        assertEquals(expected, rs);
    }
    @Test
    public void testOutOfYearRange1() {
        boolean rs = date.valid(0, 3, 1);
        boolean expected = false;
        assertEquals(expected, rs);
    }
    @Test
    public void testOutOfYearRange2() {
        boolean rs = date.valid(-555, 3, 1);
        boolean expected = false;
        assertEquals(expected, rs);
    }
    @Test
    public void testDateInMonth1() {
        boolean rs = date.valid(2000, 3, 31);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth2() {
        boolean rs = date.valid(2017, 4, 30);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth3() {
        boolean rs = date.valid(2000, 12, 31);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth4() {
        boolean rs = date.valid(2000, 11, 30);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth5() {
        boolean rs = date.valid(2000, 11, 31);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth6() {
        boolean rs = date.valid(2012, 2, 30);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth7() {
        boolean rs = date.valid(2016, 5, 31);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth8() {
        boolean rs = date.valid(2016, 6, 31);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth9() {
        boolean rs = date.valid(2016, 7, 31);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth10() {
        boolean rs = date.valid(2016, 8, 31);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth11() {
        boolean rs = date.valid(2019, 9, 31);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth12() {
        boolean rs = date.valid(2018, 10, 31);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth13() {
        boolean rs = date.valid(2021, 11, 31);
        boolean expected = false;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth14() {
        boolean rs = date.valid(2021, 12, 31);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth15() {
        boolean rs = date.valid(2021, 4, 30);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth16() {
        boolean rs = date.valid(2021, 6, 30);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth17() {
        boolean rs = date.valid(2021, 9, 30);
        boolean expected = true;
        assertEquals(expected, rs);
    }

    @Test
    public void testDateInMonth18() {
        boolean rs = date.valid(2021, 11, 30);
        boolean expected = true;
        assertEquals(expected, rs);
    }
}
