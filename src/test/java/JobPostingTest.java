import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobPostingTest {
  JobPosting j1;
  JobPosting j2;

  @BeforeEach
  void setUp() {
    j1 = new JobPostingImpl(1, "Java Developer", "Proficiency in Java, with a good understanding of its ecosystems.\n" +
                                                 "Sound knowledge of Object-Oriented Programming (OOP) Patterns and Concepts.\n" +
                                                 "Familiarity with different design and architectural patterns.\n" +
                                                 "Skill for writing reusable Java libraries.", Department.IT, JobLocation.BOSTON, JobType.NWS,
            32.50, new IDateImpl(4, 4, 2025), EmploymentType.FT);

  }

  @Test
  void getJobId() {
    assertEquals(1, j1.getJobId());
  }

  @Test
  void getJobDescription() {
    assertEquals("Proficiency in Java, with a good understanding of its ecosystems.\n" +
                 "Sound knowledge of Object-Oriented Programming (OOP) Patterns and Concepts.\n" +
                 "Familiarity with different design and architectural patterns.\n" +
                 "Skill for writing reusable Java libraries.", j1.getJobDescription());
  }

  @Test
  void getDepartment() {
    assertEquals(Department.IT, j1.getDepartment());
  }

  @Test
  void getLocation() {
    assertEquals(JobLocation.BOSTON, j1.getLocation());
  }

  @Test
  void getJobType() {
    assertEquals(JobType.NWS, j1.getJobType());
  }

  @Test
  void getHourlyRate() {
    assertEquals(32.50, j1.getHourlyRate());
  }

  @Test
  void getApplicationDeadline() {
    assertEquals("4/4/2025", j1.getApplicationDeadline().toString());
  }

  @Test
  void getEmploymentType() {
    assertEquals(EmploymentType.FT, j1.getEmploymentType());
  }

  @Test
  void toStringTest() {
    assertEquals("\nID: 1" +
                 "\nJob Title: Java Developer" +
                 "\nJob Description: Proficiency in Java, with a good understanding of its ecosystems." +
                 "\nSound knowledge of Object-Oriented Programming (OOP) Patterns and Concepts." +
                 "\nFamiliarity with different design and architectural patterns." +
                 "\nSkill for writing reusable Java libraries." +
                 "\nJob Department: IT" +
                 "\nJob Location: Boston" +
                 "\nJob Type: NonWorkStudy" +
                 "\nHourly Rate: $32.50" +
                 "\nApplication Deadline: 4/4/2025" +
                 "\nEmployment Type: FT", j1.toString());
  }

}