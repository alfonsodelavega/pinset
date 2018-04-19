package org.eclipse.epsilon.lvl.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.lvl.dom.ValueWrapper;

public class DatasetFile {
  protected PrintWriter pw = null;
  protected String separator = ",";

  public DatasetFile(String path) throws FileNotFoundException {
    pw = new PrintWriter(new File(path));
  }

  public void headerRecord(List<String> columnNames) {
    addRecord(columnNames);
  }

  public void rowRecord(List<ValueWrapper> wrappers) {
    List<String> records = new ArrayList<String>();
    for (ValueWrapper wrapper : wrappers) {
      records.add(wrapper.toString());
    }
    addRecord(records);
  }

  private void addRecord(List<String> records) {
    pw.println(String.join(separator, records));
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
