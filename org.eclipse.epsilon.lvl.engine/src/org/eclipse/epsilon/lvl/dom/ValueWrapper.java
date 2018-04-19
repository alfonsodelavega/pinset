package org.eclipse.epsilon.lvl.dom;

/**
 * Allows referencing a value from several structures to change, even in type
 */
public class ValueWrapper {
  private Object value;

  public ValueWrapper(Object value) {
    super();
    this.value = value;
  }

  public Object get() {
    return value;
  }

  public void set(Object value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return (value == null) ? "" : value.toString();
  }
}
