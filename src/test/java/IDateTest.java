import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class IDateTest {
  IDateImpl d1;
  IDateImpl d2;
  Date d3 = new Date(2024, 3, 30);
  IDateImpl d4;
  IDateImpl d5;
  IDateImpl d6;


  @BeforeEach
  void setUp() {
    d1 = new IDateImpl(4, 4, 2024);
    d2 = new IDateImpl();
    d4 = new IDateImpl(3, 12, 2025);
    d5 = new IDateImpl(11, 11, 2026);
    d6 = new IDateImpl(11, 11, 2026);


  }

  @Test
  void getMonth() {
    assertEquals(4, d1.getMonth());
    assertEquals(3, d3.getMonth());
  }

  @Test
  void getDay() {
    assertEquals(4, d1.getDay());
  }

  @Test
  void getYear() {
    assertEquals(2024, d1.getYear());
  }

  @Test
  void setMonth() {
    d2.setMonth(11);
    d4.setMonth(32);
    d5.setMonth(0);
    assertEquals(11, d2.getMonth());
    assertEquals(12, d4.getMonth());
    assertEquals(1, d5.getMonth());
  }

  @Test
  void setDay() {
    d2.setDay(11);
    d4.setDay(100);
    assertEquals(11, d2.getDay());
    assertEquals(31, d4.getDay());
  }

  @Test
  void setYear() {
    d2.setYear(2000);
    d4.setYear(-1);
    assertEquals(2000, d2.getYear());
    assertEquals(1, d4.getYear());
  }

  @Test
  void compareToTest() {
    d2.setMonth(11);
    d2.setDay(11);
    d2.setYear(2026);
    assertEquals(1, d1.compareTo(d4));
    assertEquals(3, d1.compareTo(d2));
    assertEquals(0, d5.compareTo(d6));
  }

  @Test
  void toStringTest() {
    assertEquals("04/04/2024", d1.toString());
  }
}
