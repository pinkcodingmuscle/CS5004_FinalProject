import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class implements the ADTList interface and contains the linked list methods
 */


public class JobPostManager<T> {
  // create a jon posting
  // update job posting
  // delete job posting
  // view jobs

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

}
