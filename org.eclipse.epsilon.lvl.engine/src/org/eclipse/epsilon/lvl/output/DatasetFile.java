package org.eclipse.epsilon.lvl.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class DatasetFile {

  protected PrintWriter pw = null;
  protected String separator = ",";

  public DatasetFile(String path) throws FileNotFoundException {
    pw = new PrintWriter(new File(path));
  }

  public void newRecord(List<String> recordValues) {
    pw.println(String.join(separator, recordValues));
  }

  public void close() {
    pw.close();
  }

  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }
}
