public class TestDriver {


  public static void main(String[] args) {

    ADTListImpl <JobPostingImpl> jobPostList = new ADTListImpl<>();

    jobPostList.addNode(new JobPostingImpl <>(1, "Java Developer", """
            Proficiency in Java, \
            with a good understanding of its ecosystems.
            Sound knowledge of Object-Oriented Programming (OOP) Patterns and Concepts.
            Familiarity with different design and architectural patterns.
            Skill for writing reusable Java libraries.""", Department.IT, JobLocation.BOSTON, JobType.NWS, 32.50 , new IDateImpl <>(4,4,2025),
            EmploymentType.PT));
    jobPostList.addNode(new JobPostingImpl <>(2, "Finance Associate", """
            Manage the process \
            of allocating capital market deals related costs and transaction fees to ensure compliance with prescribed\
             methodologies, accuracy of all allocation calculations, effectiveness of the capital markets allocation \
            system, administration of treatment intricacies and the completion of all supporting tasks and schedules.
            Allocate dead deal costs and transaction fees between Advisor, capital markets funds, business units, and \
            outside parties using various data sourcesSend and properly record wires for invoice payments to vendors.
            Perform detailed and analytical reviews for accuracy of allocations and costs using the expense allocation \
            system and payment tracker; research, resolve and document any discrepancies.
            Work closely with IT to \
            resolve system related issues and to implement enhancements and new functionality.""", Department.FINANCE,
            JobLocation.DALLAS, JobType.NWS, 26.00, new IDateImpl<>(7,14,2024),
            EmploymentType.FT));


    // this uses lambda expression to return a list of job postings that are past a given date
    //IDateImpl d1 = new IDateImpl(4,4,2024);
    //Date d1 = new Date(2024,4,4);
    // ADTList <JobPostingImpl> list = jobPostList.filter(m -> !! m.isExpired(d1));
    //System.out.println(list);

    //fold function to return the number of items in the list
    //System.out.println("Number of items in list: " + jobPostList.getSize());

    // this uses a lambda function to return a list with the job title capitalized
    // ADTList <JobPostingImpl> list3 = jobPostList.map(p -> p.setJobTitle(p.getJobTitle().toUpperCase()));


   JobPostController c  = new JobPostController<>(new JobPostManager<>(), new JobPostView<>());
    c.run();


  }
}
