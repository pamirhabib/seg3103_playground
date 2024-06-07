import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc0() {
    Date today = new Date(2000, 6, 20);
    Date expectedTomorrow = new Date(2000, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc032() {
    Date today = new Date(2000, 2, 26);
    Date expectedTomorrow = new Date(2000, 2, 27);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc00() {
    Date today = new Date(2000, 1, 31);
    Date expectedTomorrow = new Date(2000, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void toString_tc1() {
    Date today = new Date(2000, 2, 1);
    assertEquals("2000/February/1", today.toString());
  }
  @Test
  void nextDate_tc002() {
    Date today = new Date(2000, 6, 30);
    Date expectedTomorrow = new Date(2000, 7,1);
    assertEquals(expectedTomorrow, today.nextDate());
  }
  @Test
  void nextDate_tc001() {
    Date today = new Date(2001, 1, 31);
    Date expectedTomorrow = new Date(2001, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }


  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc123() {
    Date today = new Date(2000, 2, 29);
    Date expectedTomorrow = new Date(2000, 3, 1);
    System.out.println("30");
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc124() {
    Date today = new Date(2001, 2, 28);
    Date expectedTomorrow = new Date(2001, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }
  

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  void nextDate_invalid_tc123() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2000, -1, -1)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  @Test
  void nextDate_invalid_tc21() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 1, 34)
    );
  }

  @Test
  void nextDate_invalid_tc22() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 4, 31)
    );
  }

  @Test
  void nextDate_invalid_tc23() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 2, 30)
    );
  }
  @Test
  void nextDate_invalid_tc24() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 32, 1)
    );
  }

  void nextDate_invalid_tc26() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 4, 30)
    );
  }
  void nextDate_invalid_tc27() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 6, 30)
    );
  }  void nextDate_invalid_tc28() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 9, 30)
    );
  }
  void nextDate_invalid_tc29() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 11, 30)
    );
  }

    void nextDate_invalid_tc30() {
      assertThrows(
        IllegalArgumentException.class,
        () -> new Date(2024, 0, 1)
      );
  }
  void nextDate_invalid_tc31() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 12, 1)
    );
}
void nextDate_invalid_tc32() {
  assertThrows(
    IllegalArgumentException.class,
    () -> new Date(2024, -4234, 1)
  );
}

  @Test
  void isThirtyDayMonth_tc1() {
      Date date = new Date(2024, 4, 1);
      assertTrue(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc2() {
      Date date = new Date(2024, 6, 1);
      assertTrue(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc3() {
      Date date = new Date(2024, 9, 1);
      assertTrue(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc4() {
      Date date = new Date(2024, 11, 1);
      assertTrue(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc5() {
      Date date = new Date(2024, 1, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc6() {
      Date date = new Date(2024, 3, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc7() {
      Date date = new Date(2024, 5, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc8() {
      Date date = new Date(2024, 7, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc9() {
      Date date = new Date(2024, 8, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc10() {
      Date date = new Date(2024, 10, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc11() {
      Date date = new Date(2024, 12, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void isThirtyDayMonth_tc12() {
      Date date = new Date(2024, 2, 1);
      assertFalse(date.isThirtyDayMonth());
  }

  @Test
  void setMonth_valid_tc1() {
      Date date = new Date(2024, 1, 1);
      assertEquals(1, date.getMonth());
  }

  @Test
  void setMonth_valid_tc2() {
      Date date = new Date(2024, 12, 1);
      assertEquals(12, date.getMonth());
  }

  @Test
  void setMonth_invalid_tc1() {
      assertThrows(IllegalArgumentException.class, () -> {
          new Date(2024, 0, 1);
      });
  }

  @Test
  void setMonth_invalid_tc2() {
      assertThrows(IllegalArgumentException.class, () -> {
          new Date(2024, 13, 1);
      });
  }

  @Test
  void isEndOfMonth_valid_tc1() {
      Date date = new Date(2024, 1, 31); // January 31, 2024
      Date expectedNextDate = new Date(2024, 2, 1); // February 1, 2024
      assertEquals(expectedNextDate, date.nextDate());
  }

  @Test
  void isEndOfMonth_valid_tc2() {
      Date date = new Date(2024, 4, 30); // April 30, 2024
      Date expectedNextDate = new Date(2024, 5, 1); // May 1, 2024
      assertEquals(expectedNextDate, date.nextDate());
  }

  @Test
  void isEndOfMonth_valid_tc3() {
      Date date = new Date(2024, 2, 29); // February 29, 2024 (Leap Year)
      Date expectedNextDate = new Date(2024, 3, 1); // March 1, 2024
      assertEquals(expectedNextDate, date.nextDate());
  }

  @Test
  void isEndOfMonth_valid_tc4() {
      Date date = new Date(2023, 2, 28); // February 28, 2023 (Non-Leap Year)
      Date expectedNextDate = new Date(2023, 3, 1); // March 1, 2023
      assertEquals(expectedNextDate, date.nextDate());
  }

  @Test
  void isEndOfMonth_valid_tc5() {
      Date date = new Date(2024, 1, 15); // January 15, 2024
      Date expectedNextDate = new Date(2024, 1, 16); // January 16, 2024
      assertEquals(expectedNextDate, date.nextDate());
  }
  @Test
  void isEndOfMonth_valid_tc6() {
      Date date = new Date(2024, 12, 31); // December 31, 2024
      Date expectedNextDate = new Date(2025, 1, 1); // January 1, 2025
      assertEquals(expectedNextDate, date.nextDate());
  }
  @Test
  void isEndOfMonth_valid_tc7() {
      Date date = new Date(2024, 12, 0); // December 31, 2024
      Date expectedNextDate = new Date(2025, 1, 1); // January 1, 2025
      assertEquals(expectedNextDate, date.nextDate());
  }

  @Test
  void isEndOfMonth_valid_tc9() {
      Date date = new Date(2024, 1, -1); // January -1, 2024
      assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

  @Test
  void isEndOfMonth_valid_tc8() {
      Date date = new Date(2024, 1, 0); // January 0, 2024
      assertThrows(IllegalArgumentException.class, () -> date.nextDate());
  }

  @Test
    void isEndOfMonth_day31InMonthWith31Days_shouldReturnTrue() {
        Date date = new Date(2024, 1, 31); // January 31, 2024
        assertTrue(date.isEndOfMonth());
    }
    @Test
    void isEndOfMonth_day31JanInMonthWith31Days_shouldReturnTrue() {
        Date date = new Date(2024, 12, 31); // December 31, 2024
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_day30InMonthWith30Days_shouldReturnTrue() {
        Date date = new Date(2024, 4, 30); // April 30, 2024
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_day29InFebruaryOfLeapYear_shouldReturnTrue() {
        Date date = new Date(2024, 2, 29); // February 29, 2024 (Leap Year)
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_day28InFebruaryOfNonLeapYear_shouldReturnTrue() {
        Date date = new Date(2023, 2, 28); // February 28, 2023 (Non-Leap Year)
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_dayNotEndOfMonth_shouldReturnFalse() {
        Date date = new Date(2024, 1, 15); // January 15, 2024
        assertFalse(date.isEndOfMonth());
    }

    @Test
    void equals_twoEqualDates_shouldReturnTrue() {
        Date date1 = new Date(2023, 1, 15);
        Date date2 = new Date(2023, 1, 15);
        assertTrue(date1.equals(date2));
    }

    @Test
    void equals_datesWithDifferentYears_shouldReturnFalse() {
        Date date1 = new Date(2023, 1, 15);
        Date date2 = new Date(2024, 1, 15);
        assertFalse(date1.equals(date2));
    }

    @Test
    void equals_datesWithDifferentMonths_shouldReturnFalse() {
        Date date1 = new Date(2023, 1, 15);
        Date date2 = new Date(2023, 2, 15);
        assertFalse(date1.equals(date2));
    }

    @Test
    void equals_datesWithDifferentDays_shouldReturnFalse() {
        Date date1 = new Date(2023, 1, 15);
        Date date2 = new Date(2023, 1, 16);
        assertFalse(date1.equals(date2));
    }

    @Test
    void equals_compareWithNonDateObject_shouldReturnFalse() {
        Date date = new Date(2023, 1, 15);
        Object obj = new Object();
        assertFalse(date.equals(obj));
    }

    @Test
    void isEndOfMonth_leapYear_January() {
        Date date = new Date(2024, 1, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_February() {
        Date date = new Date(2024, 2, 29);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_March() {
        Date date = new Date(2024, 3, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_April() {
        Date date = new Date(2024, 4, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_May() {
        Date date = new Date(2024, 5, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_June() {
        Date date = new Date(2024, 6, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_July() {
        Date date = new Date(2024, 7, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_August() {
        Date date = new Date(2024, 8, 31);
        assertTrue(date.isEndOfMonth());
    }

    // Non-Leap Year Tests
    @Test
    void isEndOfMonth_nonLeapYear_January() {
        Date date = new Date(2023, 1, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_February() {
        Date date = new Date(2023, 2, 28);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_March() {
        Date date = new Date(2023, 3, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_April() {
        Date date = new Date(2023, 4, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_May() {
        Date date = new Date(2023, 5, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_June() {
        Date date = new Date(2023, 6, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_July() {
        Date date = new Date(2023, 7, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_January3() {
        Date date = new Date(2024, 1, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_February2() {
        Date date = new Date(2024, 2, 29);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_March1() {
        Date date = new Date(2024, 3, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_April2() {
        Date date = new Date(2024, 4, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_May3() {
        Date date = new Date(2024, 5, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_June4() {
        Date date = new Date(2024, 6, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_July5() {
        Date date = new Date(2024, 7, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_August6() {
        Date date = new Date(2024, 8, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_September() {
        Date date = new Date(2024, 9, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_October() {
        Date date = new Date(2024, 10, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_November() {
        Date date = new Date(2024, 11, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_leapYear_December() {
        Date date = new Date(2024, 12, 31);
        assertTrue(date.isEndOfMonth());
    }

    // Non-Leap Year Tests
    @Test
    void isEndOfMonth_nonLeapYear_January4() {
        Date date = new Date(2023, 1, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_Februar3y() {
        Date date = new Date(2023, 2, 28);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_March2() {
        Date date = new Date(2023, 3, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_April2() {
        Date date = new Date(2023, 4, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_May1() {
        Date date = new Date(2023, 5, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_June1() {
        Date date = new Date(2023, 6, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_July1() {
        Date date = new Date(2023, 7, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_August() {
        Date date = new Date(2023, 8, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_September() {
        Date date = new Date(2023, 9, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_October() {
        Date date = new Date(2023, 10, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_November() {
        Date date = new Date(2023, 11, 30);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_December() {
        Date date = new Date(2023, 12, 31);
        assertTrue(date.isEndOfMonth());
    }

    @Test
    void isEndOfMonth_nonLeapYear_August1() {
        Date date = new Date(2023, 8, 31);
        assertTrue(date.isEndOfMonth());
    }
}