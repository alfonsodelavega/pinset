package org.eclipse.epsilon.lvl.output;

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
