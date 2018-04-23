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
package org.eclipse.epsilon.lvl.columnGenerators;

import java.util.List;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

public interface ColumnGenerator {
  public List<String> getNames() throws EolRuntimeException;
  public List<Object> getValues(Object elem) throws EolRuntimeException;
}
