/*******************************************************************************
 * Copyright (c) 2018 University of York, University of Cantabria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alfonso de la Vega - initial API and implementation
 ******************************************************************************/
package es.unican.istr.pinset.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import es.unican.istr.pinset.ValueWrapper;

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
