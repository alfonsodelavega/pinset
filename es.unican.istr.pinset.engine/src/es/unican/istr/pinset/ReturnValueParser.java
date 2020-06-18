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
package es.unican.istr.pinset;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.execute.Return;

public class ReturnValueParser {

  public static Object obtainValue(Object obj) {
    if (obj instanceof Return) {
        return ((Return) obj).getValue();
    }
    return obj;
  }

  public static List<Object> getValues(List<Object> elements) {
    List<Object> res = new ArrayList<Object>();
    for (Object elem : elements) {
      res.add(obtainValue(elem));
    }
    return res;
  }
}
