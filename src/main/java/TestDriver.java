public class TestDriver {


  public static void main(String[] args) {

    JobPostModel<JobPostingImpl> jobPostList = new JobPostModel<>();

    jobPostList.addNode(new JobPostingImpl(1, "Java Developer", "Proficiency in Java, " +
                                                                "with a good understanding of its ecosystems.\n" +
                                                                "Sound knowledge of Object-Oriented Programming (OOP) Patterns and Concepts.\n" +
                                                                "Familiarity with different design and architectural patterns.\n" +
                                                                "Skill for writing reusable Java libraries.", Department.IT, JobLocation.BOSTON, JobType.NWS, 32.50 , new IDateImpl(4,4,2025),
            EmploymentType.PT));
    jobPostList.addNode(new JobPostingImpl(2, "Finance Associate", "Manage the process " +
                                                                   "of allocating capital market deals related costs and transaction fees to ensure compliance with prescribed" +
                                                                   " methodologies, accuracy of all allocation calculations, effectiveness of the capital markets allocation " +
                                                                   "system, administration of treatment intricacies and the completion of all supporting tasks and schedules.\n" +
                                                                   "Allocate dead deal costs and transaction fees between Advisor, capital markets funds, business units, and " +
                                                                   "outside parties using various data sourcesSend and properly record wires for invoice payments to vendors.\n" +
                                                                   "Perform detailed and analytical reviews for accuracy of allocations and costs using the expense allocation " +
                                                                   "system and payment tracker; research, resolve and document any discrepancies.\n" + "Work closely with IT to " +
                                                                   "resolve system related issues and to implement enhancements and new functionality." , Department.FINANCE,
            JobLocation.DALLAS, JobType.NWS, 26.00, new IDateImpl(7,14,2024),
            EmploymentType.FT));

    // Print Job Posting List
    System.out.println("Job Posting List: " );
    for (int i = 0; i < jobPostList.getSize(); i++){
      JobPostingImpl jobPosting = jobPostList.getNodeContent(i);
      System.out.println("\nID:" + jobPosting.getJobId() +
                         "\nJob Title: " + jobPosting.getJobTitle() +
                         "\nJob Description: " + jobPosting.getJobDescription() +
                         "\nJob Department: " + jobPosting.getDepartment() +
                         "\nJob Location: " + jobPosting.getLocation() +
                         "\nJob Type: " + jobPosting.getJobType() +
                         "\nHourly Rate: " + jobPosting.getHourlyRate() +
                         "\nApplication Deadline: " + jobPosting.getApplicationDeadline() +
                         "\nEmployment Type: " + jobPosting.getEmploymentType());
    }

    /*
    //Write to CSV File
    try {
      WriteToFile.writeToFile("JobPostings", jobPostList);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }; ;

     */

    JobPostController c  = new JobPostController<>(new JobPostModel<>(), new JobPostView<>());
    c.run();
  }
}
