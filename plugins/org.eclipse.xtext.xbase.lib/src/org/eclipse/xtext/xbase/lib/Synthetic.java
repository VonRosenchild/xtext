/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.lib;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Xtend Compiler annotation. The following holds only for members compiled from Xtend:
 * 
 * Annotated element is considered synthetic and will be marked as such in the byte code.
 * I.e. during debugging the annotated member will be skipped and {@link Method#isSynthetic()}
 * will return <code>true</code> for such members.
 * 
 * @author kosyakov - Initial contribution and API
 * @since 2.7
 */
@Retention(RetentionPolicy.CLASS)
@Target(value = { CONSTRUCTOR, METHOD })
public @interface Synthetic {
}