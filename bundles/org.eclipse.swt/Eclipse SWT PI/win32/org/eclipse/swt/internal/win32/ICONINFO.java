/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.win32;

public class ICONINFO {
	public boolean fIcon;
	public int xHotspot;
	public int yHotspot;
	/** @field cast=(HBITMAP) */
	public long /*int*/ hbmMask;
	/** @field cast=(HBITMAP) */
	public long /*int*/ hbmColor;
	public static final int sizeof = OS.ICONINFO_sizeof ();
}
