/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * The class contains the menus used in the controller and view
 *
 */
public class MenuOptions {
  static String welcomeMessage = "\t\t\t\t========Welcome to the Job Board!========\t\t\t\t";
  static String goodbyeMessage = "\t\t\t\t================Goodbye!=================\t\t\t\t";

  public static  void printAdminMenuOptions(){
    System.out.println("Choose an action from the following options below:");
    System.out.println("\t\t\t\t-> 1. View job postings\t\t\t\t");
    System.out.println("\t\t\t\t-> 2. Create a job post\t\t\t\t");
    System.out.println("\t\t\t\t-> 3. Quit\t\t\t\t");
  }

  public static void validateUser(){
    System.out.println("Choose an action from the following options below:");
    System.out.println("\t\t\t\t-> 1. Source for talent\t\t\t\t");
    System.out.println("\t\t\t\t-> 2. Look for jobs\t\t\t\t");
    System.out.println("\t\t\t\t-> 3. Exit\t\t\t\t");
  }
}
