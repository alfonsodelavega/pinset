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
