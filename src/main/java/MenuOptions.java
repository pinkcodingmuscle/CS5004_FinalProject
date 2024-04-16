public class MenuOptions {
  static String welcomeMessage = "\t\t\t\t======= Welcome to the Job Board!=======\t\t\t\t";

  public static  void printUserMenuOptions(){
    System.out.println("Please choose from one of the menu options below:  ");
    System.out.println("\t\t\t\t-> 1. View job postings \t\t\t\t");
    System.out.println("\t\t\t\t-> 2. Create a job post\t\t\t\t");
    System.out.println("\t\t\t\t-> 3. Update a job post\t\t\t\t");
    System.out.println("\t\t\t\t-> 4. Delete a job post\t\t\t\t");
    System.out.println("\t\t\t\t-> 5. Quit\t\t\t\t");
  }

  public static void printAdminMenuOptions() {
    //System.out.println("======= Welcome to the Job Board! =======");
    System.out.println("Please choose from one of the menu options below:  ");
    System.out.println("\t\t\t\t-> 1. Create a job post\t\t\t\t");
    System.out.println("\t\t\t\t-> 2. Update a job post\t\t\t\t");
    System.out.println("\t\t\t\t-> 3. Delete a job post\t\t\t\t");
    System.out.println("\t\t\t\t-> 4. Display Job posts\t\t\t\t");
    System.out.println("\t\t\t\t-> 5. Quit\t\t\t\t");
  }

  public static void updateJobPosting(){
    System.out.println("Which of these fields would you like to edit:  ");
    System.out.println("\t\t\t\t-> 1. Job Id\t\t\t\t");
    System.out.println("\t\t\t\t-> 2. Job Title\t\t\t\t");
    System.out.println("\t\t\t\t-> 3. Department\t\t\t\t");
    System.out.println("\t\t\t\t-> 4. Location\t\t\t\t");
    System.out.println("\t\t\t\t-> 5. Job category\t\t\t\t");
    System.out.println("\t\t\t\t-> 2. Hourly Rate\t\t\t\t");
    System.out.println("\t\t\t\t-> 3. Application Deadline\t\t\t\t");
    System.out.println("\t\t\t\t-> 4. Employment Type\t\t\t\t");
    System.out.println("\t\t\t\t-> 5. Quit\t\t\t\t");
  }

  public static void main(String [] args){
    System.out.println(welcomeMessage);
    MenuOptions.printAdminMenuOptions();
  }




}
