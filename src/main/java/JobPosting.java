import java.util.Date;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * JobPosting interface to establish polymorphic use of a job positing
 */
public interface JobPosting <T> {
  int getJobId();
  void setJobId(int jobId);
  String getJobTitle();
  void setJobTitle(String title);
  String getJobDescription();
  void setJobDescription(String description);
  Department getDepartment();
  void setDepartment(Department department);
  JobLocation getLocation();
  void setLocation(JobLocation location);
  JobType getJobType();
  void setJobType(JobType jobType);
  double getHourlyRate();
  void setHourlyRate(Double wage);
  IDate <T>  getApplicationDeadline();
  void setApplicationDeadline(IDate<T> date);
  EmploymentType getEmploymentType();
  void setEmploymentType(EmploymentType employmentType);
}
