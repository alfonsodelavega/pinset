/*******************************************************************************
 * Copyright (c) 2018 University of York, University of Cantabria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dimitrios Kolovos - initial API and EDL demo implementation
 *     Alfonso de la Vega - initial API and implementation
 ******************************************************************************/
package es.unican.istr.pinset.dt;

import org.eclipse.epsilon.common.dt.AbstractEpsilonUIPlugin;

public class PinsetPlugin extends AbstractEpsilonUIPlugin {

	public static PinsetPlugin getDefault() {
		return (PinsetPlugin) plugins.get(PinsetPlugin.class);
	}

}
