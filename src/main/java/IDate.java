/**
 * Name: Esther Mukuye
 * Date: 4/15/24
 *
 * Date interface to establish polymorphic use of a date
 *
 */
public interface IDate <T> {
  int getDay();
  void setDay(int day);
  int getMonth();
  void setMonth(int month);
  int getYear();
  void setYear(int year);
}
