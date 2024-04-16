import java.io.IOException;
import java.util.Scanner;

public class JobPostController <T> {
  private final JobPostView <T>  v;
  private final JobPostModel<T> m;
  private static Scanner scanner;
  private T JobPostingImpl;

  public JobPostController(JobPostModel <T> m, JobPostView <T> v) {
    this.m = m;
    this.v = v;
  }

  public void run(){
    JobPostModel<JobPostingImpl> jobPostList = new JobPostModel<>();
    scanner = new Scanner(System.in);
    MenuOptions.printUserMenuOptions();
    int choice = getUserChoice();
    switch (choice) {
      case 1:
        m.toString();
        break;
      case 2:
        System.out.print("Enter Job Id: ");
        int id = scanner.nextInt();

        System.out.print("Enter a Job Title: ");
        String jobTitle = scanner.next();

        System.out.println("Enter a job description: ");
        String jobDescription = scanner.nextLine();

        Department department = null;
        while (department == null) {
          System.out.println("Enter a department (FINANCE, IT, SALES): ");
          String dept = scanner.next().toUpperCase().strip();
          try {
            department = Department.valueOf(dept);
          } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please try again.");
          }
        }

        JobLocation jobLocation = null;
        while (jobLocation == null) {
          System.out.println("Enter a location from the following options (PHOENIX, BOSTON, DALLAS): ");
          String location = scanner.next().toUpperCase().strip();
          try {
            jobLocation = JobLocation.valueOf(location);
          } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please try again.");
          }
        }

        JobType type = null;
        while (type == null) {
          System.out.println("Enter a Job Type (NWS, WS): ");
          String jobType = scanner.next().toUpperCase().strip();
          try {
            type = JobType.valueOf(jobType);
          } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please try again.");
          }
        }

        System.out.println("Enter an hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        IDateImpl date = null;
        while (date == null){
          System.out.println("Application Deadline:- ");
          System.out.println("Enter a month: ");
          int month = scanner.nextInt();
          System.out.println("Enter a day: ");
          int day = scanner.nextInt();
          System.out.println("Enter a year (YYYY): ");
          int year = scanner.nextInt();
          date = new IDateImpl<>(month, day, year);
        }

        EmploymentType employmentType = null;
        while (employmentType == null) {
          System.out.println("Is this job full time or part time (FT, PT): ");
          String employmentJobType = scanner.next().toUpperCase().strip();
          try {
            employmentType = EmploymentType.valueOf(employmentJobType);
          } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please try again.");
          }
        }

        //JobPostModel <JobPostingImpl> list = new JobPostModel<>();
        System.out.println("Would you like to save this job posting? (Y or N): ");
        String save = scanner.next().toUpperCase().strip();
        System.out.println("Which file would you like to save this to?: ");
        String fileName = scanner.next();
        jobPostList.addNode(new JobPostingImpl(id, jobTitle, jobDescription, department, jobLocation, type,
                hourlyRate, date, employmentType));
        if (save.equals("Y")) {
          try {
            WriteToFile.writeToFile(fileName, jobPostList);
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        else System.out.println("This job posting has not been saved.");
        break;

      case 3:
        MenuOptions.updateJobPosting();
        break;
      case 4:
        m.remove(JobPostingImpl);
        break;
      case 5:
        System.exit(choice);
        break;
      default:
        System.out.println("Invalid choice!");
        MenuOptions.printUserMenuOptions();
    }
  }


  public static int getUserChoice(){
    return scanner.nextInt();
  }

}


