/*******************************************************************************
 * Copyright (c) 2010, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <Lars.Vogel@vogella.com> - Bug 502576
 *******************************************************************************/
package org.eclipse.swt.events;


import org.eclipse.swt.internal.*;

/**
 * Classes which implement this interface provide methods
 * that deal with the events that are generated as touches
 * occur on a touch-aware input surface.
 * <p>
 * After creating an instance of a class that implements
 * this interface it can be added to a control using the
 * <code>addTouchListener</code> method and removed using
 * the <code>removeTouchListener</code> method. When a
 * touch occurs or changes state, the <code>touch</code> method
 * will be invoked.
 * </p>
 * <p>
 * <b>Warning</b>: This API is currently only implemented on Windows and Cocoa.
 * SWT doesn't send Gesture or Touch events on GTK.
 * </p>
 *
 * @see TouchEvent
 *
 * @since 3.7
 */
@FunctionalInterface
public interface TouchListener extends SWTEventListener {

/**
 * Sent when a touch sequence begins, changes state, or ends.
 *
 * @param e an event containing information about the touch
 */
public void touch(TouchEvent e);
}
