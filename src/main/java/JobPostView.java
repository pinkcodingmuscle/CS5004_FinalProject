import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class implements the IView interface and contains methods for the view for an admin user
 *
 */

public class JobPostView <T> implements IView <T>{
  private T JobPostingImpl;

  @Override
  public void getUserPrompt() {
    JobPostModel<JobPostingImpl> jobPostList = new JobPostModel<>();
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    System.out.print("Enter Job Id: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter a Job Title: ");
    String jobTitle = scanner.nextLine();

    System.out.print("Enter a job description: ");
    String jobDescription = scanner.nextLine();

    Department department = null;
    while (department == null) {
      System.out.print("Enter a department (FINANCE, IT, SALES): ");
      String dept = scanner.nextLine().toUpperCase();
      try {
        department = Department.valueOf(dept);
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    JobLocation jobLocation = null;
    while (jobLocation == null) {
      System.out.print("Enter a location from the following options (PHOENIX, BOSTON, DALLAS): ");
      String location = scanner.nextLine().toUpperCase();
      try {
        jobLocation = JobLocation.valueOf(location);
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    JobType type = null;
    while (type == null) {
      System.out.print("Enter a Job Type (NWS, WS): ");
      String jobType = scanner.nextLine().toUpperCase();
      try {
        type = JobType.valueOf(jobType);
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    System.out.print("Enter an hourly rate: ");
    double hourlyRate = scanner.nextDouble();

    IDateImpl <T> date = null;
    while (date == null){
      System.out.println("Application Deadline:- ");
      System.out.print("Enter a month: ");
      int month = scanner.nextInt();
      System.out.print("Enter a day: ");
      int day = scanner.nextInt();
      System.out.print("Enter a year (YYYY): ");
      int year = scanner.nextInt();
      date = new IDateImpl<>(month, day, year);
    }

    EmploymentType employmentType = null;
    while (employmentType == null) {
      System.out.print("Is this job full time or part time (FT, PT): ");
      String employmentJobType = scanner.next().toUpperCase().strip();
      try {
        employmentType = EmploymentType.valueOf(employmentJobType);
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    System.out.print("Would you like to save this job posting? (Y or N): ");
    String save = scanner.next().toUpperCase().strip();
    jobPostList.addNode(new JobPostingImpl <T>(id, jobTitle, jobDescription, department, jobLocation, type,
            hourlyRate, date, employmentType));
    if (save.equals("Y")) {
      System.out.println("Which file would you like to save this to?: ");
      String fileName = scanner.next();
      try {
        WriteToFile.writeToFile(fileName, jobPostList);
      } catch (IOException e) {
        System.out.println("File not found");
      }
    }
    else System.out.println("This job posting has not been saved.");
    // close scanner to release resources
    scanner.close();

  }

  public void menu(){
    MenuOptions.printAdminMenuOptions();
  }

  public void welcomeMessage(){
    System.out.println(MenuOptions.welcomeMessage);
  }

}