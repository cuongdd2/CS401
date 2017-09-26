package lab10.prob2.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;
import java.util.stream.Collectors;

import lab10.prob2.classfinder.ClassFinder;

/**
 * This class scans the package lab10.prob2.javapackage for classes with annotation @BugReport. It
 * then generates a bug report bugreport.txt, formatted like this:
 *
 * Joe Smith reportedBy: classname: description: severity:
 *
 * reportedBy: classname: description: severity:
 *
 * Tom Jones reportedBy: classname: description: severity:
 *
 * reportedBy: classname: description: severity:
 */
public class BugReportGenerator {

  private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
  private static final String PACKAGE_TO_SCAN = "lab10.prob2.javapackage";
  private static final String REPORT_NAME = "bug_report.txt";
  private static final String REPORTED_BY = "  reportedBy: ";
  private static final String CLASS_NAME = "  classname: ";
  private static final String DESCRIPTION = "  description: ";
  private static final String SEVERITY = "  severity: ";

  public void reportGenerator() {
    List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
    //implement
    List<BugReport> bugReports = classes.stream()
        .map(aClass -> aClass.getAnnotation(BugReport.class))
        .sorted(Comparator.comparing(BugReport::assignedTo)).collect(Collectors.toList());
    try (
        FileWriter writer = new FileWriter(REPORT_NAME);
    ) {
      String assignee = null;
      int size = bugReports.size();
      for (int i = 0; i < size; i++) {
        BugReport report = bugReports.get(i);
        if (report == null) {
          continue;
        }
        if (assignee == null || !assignee.equals(report.assignedTo())) {
          assignee = report.assignedTo();
          writer.write(assignee + "\n");
        }
        ;
        writer.write(REPORTED_BY + report.reportedBy() + "\n");
        writer.write(CLASS_NAME + classes.get(i).getName() + "\n");
        writer.write(DESCRIPTION + report.description() + "\n");
        writer.write(SEVERITY + report.severity() + "\n");
        writer.write("\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


}
