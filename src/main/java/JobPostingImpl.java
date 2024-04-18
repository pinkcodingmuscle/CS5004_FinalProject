import java.util.Date;


/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class implements the JobPosting interface and contains methods for creating a job post object
 */

public class JobPostingImpl <T> implements JobPosting <T>{
  private int jobId;
  private String jobTitle;
  private String jobDescription;
  private Department jobDepartment;
  private JobLocation jobLocation;
  private JobType jobType;
  private double hourlyRate;
  private IDate <T> applicationDeadline;
  private EmploymentType employmentType;


  public JobPostingImpl(int jobId, String jobTitle, String jobDescription, Department jobDepartment,
                        JobLocation jobLocation, JobType jobType, double hourlyRate, IDate <T> applicationDeadline,
                        EmploymentType employmentType){
    this.jobId = jobId;
    this.jobTitle = jobTitle;
    this.jobDescription = jobDescription;
    this.jobDepartment = jobDepartment;
    this.jobLocation = jobLocation;
    this.jobType = jobType;
    this.hourlyRate = hourlyRate;
    this.applicationDeadline = applicationDeadline;
    this.employmentType = employmentType;
  }

  @Override
  public int getJobId() {
    return jobId;
  }

  @Override
  public void setJobId(int jobId) {
    this.jobId = jobId;
  }

  @Override
  public String getJobTitle() {
    return jobTitle;
  }

  @Override
  public void setJobTitle(String title) {
    this.jobTitle = jobTitle;
  }


  @Override
  public String getJobDescription() {
    return jobDescription;
  }

  @Override
  public void setJobDescription(String description) {
    this.jobDescription = jobDescription;
  }

  @Override
  public Department getDepartment() {
    return jobDepartment;
  }

  @Override
  public void setDepartment(Department department) {
    this.jobDepartment = department;
  }

  @Override
  public JobLocation getLocation() {
    return jobLocation;
  }

  @Override
  public void setLocation(JobLocation location) {
    this.jobLocation = location;
  }


  @Override
  public JobType getJobType() {
    return jobType;
  }

  @Override
  public void setJobType(JobType jobType) {
    this.jobType = jobType;
  }

  @Override
  public double getHourlyRate() {
    return hourlyRate;
  }

  @Override
  public void setHourlyRate(Double wage) {
    this.hourlyRate = wage;
  }

  @Override
  public IDate<T> getApplicationDeadline() {
    return applicationDeadline;
  }

  @Override
  public void setApplicationDeadline(IDate<T> date) {
    this.applicationDeadline = date;
  }

  @Override
  public EmploymentType getEmploymentType() {
    return employmentType;
  }

  @Override
  public void setEmploymentType(EmploymentType employmentType) {
    this.employmentType = employmentType;
  }

  // returns an old job posting by comparing the date of a task against another
  public Boolean isExpired(IDateImpl <T> date){
    boolean bool = false;
    if (this.applicationDeadline.getYear() > date.getYear()){
      bool = true;
    } else if (this.applicationDeadline.getYear() == date.getYear() && this.applicationDeadline.getMonth() > date.getMonth()) {
      bool = true;
    } else if (this.applicationDeadline.getYear() == date.getYear() && this.applicationDeadline.getMonth() > date.getMonth() && this.applicationDeadline.getDay() > date.getMonth() ) {
      bool = true;
    }
    return bool;
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
