/*
 * Copyright 2015 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.engine.junit5.descriptor;

import java.util.Arrays;

class TestClassTester {

	private final TestMethodTester methodTester = new TestMethodTester();

	boolean accept(Class<?> testClassCandidate) {
		return Arrays.stream(testClassCandidate.getDeclaredMethods()).anyMatch(methodTester::accept);
	}

}
