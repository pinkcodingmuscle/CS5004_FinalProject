/**
 * This class contains the methods a date object performs on itself.
 * A date has a day, month and a year
 */

public class IDateImpl <T> implements IDate<T>, Comparable <IDateImpl <T>> {
  private int day;
  private int month;
  int year;

  // constructor
  public IDateImpl(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public IDateImpl() {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  // this method will return the day for a date object.
  public int getDay() {
    return this.day;
  }

  // this method will take a day of type int and set the date's day.
  public void setDay(int day) {
    if (day < 0) {
      this.day = 1;
    }
    if (day >= 31) {
      this.day = 31;
    } else {
      this.day = day;
    }
  }

  // this method will return the month for a date object.
  public int getMonth() {
    return month;
  }

  // this method will take a month of type int and set the date's month.
  public void setMonth(int month) {
    if (month < 1) {
      this.month = 1;
    } else if (month > 12) {
      this.month = 12;
    } else {
      this.month = month;
    }
  }

  // this method will return the year for a date object.
  public int getYear() {
    return year;
  }

  // this method will take a year of type int and set the date's month
  public void setYear(int year) {
    if (year < 1) {
      this.year = 1;
    } else {
      this.year = year;
    }
  }

  // this method compares two dates
  @Override
  public int compareTo(IDateImpl<T> date) {
    return this.toString().compareTo(String.valueOf(date));
  }

  // this method compares one object to another for equality

  // this method will return a formatted string.
  @Override
  public String toString() {
    return String.format("%02d/%02d/%04d", this.month, this.day, this.year);
  }

}