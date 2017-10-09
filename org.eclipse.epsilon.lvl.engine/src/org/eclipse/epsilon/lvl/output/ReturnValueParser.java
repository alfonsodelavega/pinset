package org.eclipse.epsilon.lvl.output;

import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.Return;
import org.eclipse.epsilon.eol.execute.context.IEolContext;

public class ReturnValueParser {

  public static String obtainAndParseValue(IEolContext context,
      IExecutableModuleElement block) {
    Object res = null;
    // Any problem during execution would result in a blank cell
    try {
      res = context.getExecutorFactory().execute(block, context);
    } catch (EolRuntimeException r) {}
    if (res != null) {
      if (res instanceof Return) {
        res = ((Return) res).getValue();
      }
    }
    return getStringOrBlank(res);
  }

  public static String getStringOrBlank(Object obj) {
    return (obj == null) ? "" : obj.toString();
  }
}
