package org.eclipse.epsilon.lvl.dom;

import java.util.List;

public class PostProcessing {

  public enum FillType {MEAN, MODE, VALUE};

  public static void normalize(List<ValueWrapper> values)
      throws RuntimeException {
    System.out.println("Normalized");
  }

  public static void fillNullValues(List<ValueWrapper> values,
      FillType fillType, String option) throws RuntimeException {
    System.out.println("Filled Nulls");
  }
}
