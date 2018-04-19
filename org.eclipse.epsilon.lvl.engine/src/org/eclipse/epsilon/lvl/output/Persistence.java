package org.eclipse.epsilon.lvl.output;

import java.io.FileNotFoundException;
import java.util.List;

import org.eclipse.epsilon.lvl.dom.Dataset;
import org.eclipse.epsilon.lvl.dom.ValueWrapper;

public class Persistence {

  public static void persist(Dataset dataset, String filePath, String separator) {
    DatasetFile df = null;
    try {
      df = new DatasetFile(filePath);
      df.setSeparator(separator);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        return;
    }
    df.headerRecord(dataset.getColumnNames());
    for (List<ValueWrapper> wrappers : dataset.getRows()) {
      df.rowRecord(wrappers);
    }
    df.close();
  }
}
