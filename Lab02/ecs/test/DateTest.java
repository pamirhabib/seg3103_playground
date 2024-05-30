import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void constructor_validDates() {
    Date d1 = new Date(2020, 5, 3);
    assertEquals(2020, d1.getYear());
    assertEquals(5, d1.getMonth());
    assertEquals(3, d1.getDay());

    Date d2 = new Date(2000, 2, 29);
    assertEquals(2000, d2.getYear());
    assertEquals(2, d2.getMonth());
    assertEquals(29, d2.getDay());
  }

  @Test
  void constructor_invalidDates() {
    assertThrows(IllegalArgumentException.class, () -> new Date(2020, 2, 30));
    assertThrows(IllegalArgumentException.class, () -> new Date(2020, 4, 31));
    assertThrows(IllegalArgumentException.class, () -> new Date(2019, 2, 29));
    assertThrows(IllegalArgumentException.class, () -> new Date(2020, 13, 1));
    assertThrows(IllegalArgumentException.class, () -> new Date(2020, 0, 1));
    assertThrows(IllegalArgumentException.class, () -> new Date(2020, 5, 0));
    assertThrows(IllegalArgumentException.class, () -> new Date(-1, 5, 1));
  }

  @Test
  void nextDate_endOfMonth() {
    Date d1 = new Date(2020, 1, 31);
    assertEquals(new Date(2020, 2, 1), d1.nextDate());

    Date d2 = new Date(2020, 4, 30);
    assertEquals(new Date(2020, 5, 1), d2.nextDate());

    Date d3 = new Date(2020, 2, 28);
    assertEquals(new Date(2020, 2, 29), d3.nextDate());

    Date d4 = new Date(2019, 2, 28);
    assertEquals(new Date(2019, 3, 1), d4.nextDate());

    Date d5 = new Date(2020, 12, 31);
    assertEquals(new Date(2021, 1, 1), d5.nextDate());
  }

  @Test
  void nextDate_middleOfMonth() {
    Date d1 = new Date(2020, 5, 15);
    assertEquals(new Date(2020, 5, 16), d1.nextDate());

    Date d2 = new Date(2020, 2, 14);
    assertEquals(new Date(2020, 2, 15), d2.nextDate());
  }

  @Test
  void isLeapYear() {
    assertTrue(new Date(2020, 1, 1).isLeapYear());
    assertFalse(new Date(2019, 1, 1).isLeapYear());
    assertTrue(new Date(2000, 1, 1).isLeapYear());
    assertFalse(new Date(1900, 1, 1).isLeapYear());
  }

  @Test
  void equals() {
    Date d1 = new Date(2020, 5, 3);
    Date d2 = new Date(2020, 5, 3);
    Date d3 = new Date(2021, 6, 4);

    assertTrue(d1.equals(d2));
    assertFalse(d1.equals(d3));
    assertFalse(d1.equals(null));
    assertFalse(d1.equals("not a date"));
  }

  @Test
  void toString_values() {
    assertEquals("2020/May/3", new Date(2020, 5, 3).toString());
    assertEquals("2000/February/29", new Date(2000, 2, 29).toString());
  }
  
  @Test
  void constructor_edgeCases() {
    Date d1 = new Date(2020, 2, 29);
    assertEquals(2020, d1.getYear());
    assertEquals(2, d1.getMonth());
    assertEquals(29, d1.getDay());

    Date d2 = new Date(2019, 2, 28);
    assertEquals(2019, d2.getYear());
    assertEquals(2, d2.getMonth());
    assertEquals(28, d2.getDay());
  }

  @Test
  void nextDate_edgeCases() {
    Date d1 = new Date(2020, 2, 29);
    assertEquals(new Date(2020, 3, 1), d1.nextDate());

    Date d2 = new Date(2019, 2, 28);
    assertEquals(new Date(2019, 3, 1), d2.nextDate());
  }
}