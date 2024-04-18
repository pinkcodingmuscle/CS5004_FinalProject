import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class acts as the controller and relays information between the view and the model
 */

public class JobPostController <T> {
  private final JobPostView <T>  v;
  private final JobPostModel<T> m;
  private T JobPostingImpl;

  public JobPostController(JobPostModel <T> m, JobPostView <T> v) {
    this.m = m;
    this.v = v;
  }

  public void run(){
    Scanner scanner = new Scanner(System.in);
    // while loop to control the flow of the application
    v.welcomeMessage();
    MenuOptions.validateUser();
    int option = scanner.nextInt();
    switch (option) {
      case 1:
        adminUser();
        break;
      case 2:
        viewJobs();
        System.out.println();
        System.out.println();
        break;
      case 3:
        System.out.println(MenuOptions.goodbyeMessage);
        System.exit(3);
        break;
      default:
        System.out.println("Invalid choice!");
    }
    scanner.close();
  }

  public static void viewJobs(){
    // display the tasks saved in file
    try{
      System.out.println("\t\t\t\t\tJOB POSTINGS\t\t\t\t\t");
      File fileName = new File("jobListings.txt");
      Scanner fileScanner = new Scanner(fileName);
      while (fileScanner.hasNextLine()){
        System.out.println(fileScanner.nextLine());
      }
      fileScanner.close();
    } catch (IOException e) {
      System.out.println("File not found.");
    }
  }

  public static int userChoice(){
    try(Scanner scanner = new Scanner(System.in)){
      return scanner.nextInt();
    }
  }

  public void adminUser(){
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    // while loop to control the flow of the application
    //while (!quit){
    MenuOptions.printAdminMenuOptions();
    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        viewJobs();
        System.out.println();
        System.out.println();
        break;
      case 2:
        v.getUserPrompt();
        break;
      case 3:
        quit = true;
        break;
      default:
        System.out.println("Invalid choice!");
      //}
    }
    // close scanner to release resources
    scanner.close();
    System.out.println(MenuOptions.goodbyeMessage);
    System.out.println();
  }

}


