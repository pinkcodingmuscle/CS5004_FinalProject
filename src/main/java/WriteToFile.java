import java.io.*;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class contains methods that write to a file
 *
 */

public class WriteToFile{

  private String fileName;
  private final ADTListImpl list;

  public WriteToFile(String fileName, ADTListImpl<JobPostingImpl> list) {
    this.fileName = fileName;
    this.list = list;
  }

  public static void writeToFile (String fileName, ADTListImpl<JobPostingImpl> list)throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt", true))){
      //String[] header = {"ID", "", "DESCRIPTION", "DEPARTMENT", "LOCATION", "JOB TYPE", "HOURLY RATE",
      //"APPLICATION DEADLINE", "EMPLOYMENT TYPE"};
      //writer.write(String.join(",", header));
      //writer.newLine();
      for (int i = 0; i < list.getSize(); i++) {
        JobPostingImpl jobPosting = list.getNodeContent(i);
        String [] rowData = {
                "ID: " + jobPosting.getJobId(),
                "TITLE: " + jobPosting.getJobTitle(),
                "DESCRIPTION:" + jobPosting.getJobDescription(),
                "DEPARTMENT: " + jobPosting.getDepartment(),
                "LOCATION: " + jobPosting.getLocation(),
                "JOB TYPE: " + jobPosting.getJobType(),
                "HOURLY RATE: " + jobPosting.getHourlyRate(),
                "APPLICATION DEADLINE: " + jobPosting.getApplicationDeadline(),
                "EMPLOYMENT TYPE: " + jobPosting.getEmploymentType()
        };
        writer.append(String.join(" , ", rowData));
        writer.newLine();
        writer.close();

      }
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
