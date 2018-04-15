package org.eclipse.epsilon.lvl.columnGenerators;

import java.util.List;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

public interface ColumnGenerator {
  public List<String> getNames() throws EolRuntimeException;
  public List<String> getValues(Object elem) throws EolRuntimeException;
}
