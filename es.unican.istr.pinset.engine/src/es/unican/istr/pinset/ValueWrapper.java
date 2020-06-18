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
