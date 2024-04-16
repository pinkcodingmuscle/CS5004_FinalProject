/**
 *
 */
public interface JobPosting {
  int getJobId();
  String getJobTitle();
  String getJobDescription();
  Department getDepartment();
  JobLocation getLocation();
  JobType getJobType();
  double getHourlyRate();
  IDate getApplicationDeadline();
  EmploymentType getEmploymentType();
}
