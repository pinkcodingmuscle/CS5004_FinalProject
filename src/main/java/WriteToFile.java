import java.io.*;

public class WriteToFile{

  private final String fileName;
  private final JobPostModel list;

  public WriteToFile(String fileName, JobPostModel<JobPostingImpl> list) {
    this.fileName = fileName;
    this.list = list;
  }

  public static void writeToFile(String fileName, JobPostModel<JobPostingImpl> list)throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"))){
      //String[] header = {"ID", "", "DESCRIPTION", "DEPARTMENT", "LOCATION", "JOB TYPE", "HOURLY RATE",
      //"APPLICATION DEADLINE", "EMPLOYMENT TYPE"};
      //writer.write(String.join(",", header));
      writer.newLine();
      for (int i = 0; i < list.getSize(); i++) {
        JobPostingImpl jobPosting = list.getNodeContent(i);
        String [] rowData = {
                "ID: " + jobPosting.getJobId(),
                "TITLE: " + jobPosting.getJobTitle(),
                "DESCRIPTION:\n" + jobPosting.getJobDescription(),
                "DEPARTMENT: " + jobPosting.getDepartment(),
                "LOCATION: " + jobPosting.getLocation(),
                "JOB TYPE: " + jobPosting.getJobType(),
                "HOURLY RATE: " + jobPosting.getHourlyRate(),
                "APPLICATION DEADLINE: " + jobPosting.getApplicationDeadline(),
                "EMPLOYMENT TYPE: " + jobPosting.getEmploymentType() + "\n"
        };
        writer.write(String.join("\n", rowData));
        writer.newLine();
      }
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
