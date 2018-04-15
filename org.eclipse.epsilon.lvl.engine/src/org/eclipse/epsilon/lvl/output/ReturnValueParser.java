package org.eclipse.epsilon.lvl.output;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.execute.Return;

public class ReturnValueParser {

  public static Object obtainValue(Object obj) {
    if (obj != null && obj instanceof Return) {
        return ((Return) obj).getValue();
    }
    return obj;
  }

  public static String obtainAndParseValue(Object obj) {
    return getStringOrBlank(obtainValue(obj));
  }

  public static String getStringOrBlank(Object obj) {
    return (obj == null) ? "" : obj.toString();
  }

  public static List<String> getStringValues(List<Object> elements) {
    List<String> res = new ArrayList<String>();
    for (Object elem : elements) {
      res.add(getStringOrBlank(elem));
    }
    return res;
  }
}
