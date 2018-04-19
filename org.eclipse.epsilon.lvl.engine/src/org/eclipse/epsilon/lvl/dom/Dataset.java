package org.eclipse.epsilon.lvl.dom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Dataset {
  private List<String> columnNames;
  private List<List<ValueWrapper>> rowsList;
  private Map<String, List<ValueWrapper>> colValuesByName;

  public Dataset() {
    columnNames = new ArrayList<String>();
    rowsList = new ArrayList<List<ValueWrapper>>();
    colValuesByName = new HashMap<String, List<ValueWrapper>>();
  }

  public List<String> getColumnNames() {
    return columnNames;
  }

  public List<List<ValueWrapper>> getRows() {
    return rowsList;
  }

  public List<ValueWrapper> getValuesByColumn(String columnName) {
    return colValuesByName.get(columnName);
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    for (String colName : columnNames) {
      colValuesByName.put(colName, new ArrayList<ValueWrapper>());
    }
  }

  /**
   * Add all column values of a row at once.
   * They MUST be given in the same order as the column names were.
   */
  public void addColumnValues(List<Object> values) {
    List<ValueWrapper> wrappers = new ArrayList<ValueWrapper>();
    for (Object value : values) {
      wrappers.add(new ValueWrapper(value));
    }
    rowsList.add(wrappers);
    Iterator<String> colIt = columnNames.iterator();
    Iterator<ValueWrapper> wrappersIt = wrappers.iterator();
    while(colIt.hasNext() && wrappersIt.hasNext()) {
      String colName = colIt.next();
      ValueWrapper wrapper = wrappersIt.next();
      colValuesByName.get(colName).add(wrapper);
    }
  }
}
