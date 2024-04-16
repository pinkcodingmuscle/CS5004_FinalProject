/**
 *
 */

public class JobPostingImpl implements JobPosting{
  private final int jobId;
  private final String jobTitle;
  private final String jobDescription;
  private final Department jobDepartment;
  private final JobLocation jobLocation;
  private final JobType jobType;
  private final double hourlyRate;
  private final IDate applicationDeadline;
  private final EmploymentType employmentType;
  private static int idGenerator = 1;


  public JobPostingImpl(int jobId, String jobTitle, String jobDescription, Department jobDepartment,
                        JobLocation jobLocation, JobType jobType, double hourlyRate, IDate applicationDeadline,
                        EmploymentType employmentType){
    this.jobId = idGenerator++;
    this.jobTitle = jobTitle;
    this.jobDescription = jobDescription;
    this.jobDepartment = jobDepartment;
    this.jobLocation = jobLocation;
    this.jobType = jobType;
    this.hourlyRate = hourlyRate;
    this.applicationDeadline = applicationDeadline;
    this.employmentType = employmentType;


  }

  /**
   * @return jobId
   */
  @Override
  public int getJobId() {
    return jobId;
  }

  /**
   * @return jobId
   */
  @Override
  public String getJobTitle() {
    return jobTitle;
  }


  /**
   * @return jobDescription
   */
  @Override
  public String getJobDescription() {
    return jobDescription;
  }

  /**
   * @return department
   */
  @Override
  public Department getDepartment() {
    return jobDepartment;
  }

  /**
   * @return job location
   */
  @Override
  public JobLocation getLocation() {
    return jobLocation;
  }

  /**
   * @return job type
   */
  @Override
  public JobType getJobType() {
    return jobType;
  }

  /**
   * @return hourly rate
   */
  @Override
  public double getHourlyRate() {
    return hourlyRate;
  }

  /**
   * @return application deadline
   */
  @Override
  public IDate getApplicationDeadline() {
    return applicationDeadline;
  }

  /**
   * @return employment type
   */
  @Override
  public EmploymentType getEmploymentType() {
    return employmentType;
  }

  @Override
  public String toString(){
    return "\nID: " + jobId +
           "\nJob Title: " + jobTitle +
           "\nJob Description: " + jobDescription +
           "\nJob Department: " + jobDepartment +
           "\nJob Location: " + jobLocation +
           "\nJob Type: " + jobType +
           "\nHourly Rate: " + "$" + (String.format("%.2f", hourlyRate)) +
           "\nApplication Deadline: " + applicationDeadline +
           "\nEmployment Type: " + employmentType;
  }
}
