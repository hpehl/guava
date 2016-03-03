/*
 * Copyright (C) 2008 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.common.base;
public class AbstractIteratorTest_gwt extends com.google.gwt.junit.client.GWTTestCase {
@Override public String getModuleName() {
  return "com.google.common.base.testModule";
}
public void testCantRemove() throws Exception {
  AbstractBaseIteratorTest testCase = new AbstractBaseIteratorTest();
  testCase.testCantRemove();
}

public void testDefaultBehaviorOfNextAndHasNext() throws Exception {
  AbstractBaseIteratorTest testCase = new AbstractBaseIteratorTest();
  testCase.testDefaultBehaviorOfNextAndHasNext();
}

public void testException() throws Exception {
  AbstractBaseIteratorTest testCase = new AbstractBaseIteratorTest();
  testCase.testException();
}

public void testExceptionAfterEndOfData() throws Exception {
  AbstractBaseIteratorTest testCase = new AbstractBaseIteratorTest();
  testCase.testExceptionAfterEndOfData();
}

public void testReentrantHasNext() throws Exception {
  AbstractBaseIteratorTest testCase = new AbstractBaseIteratorTest();
  testCase.testReentrantHasNext();
}

public void testSneakyThrow() throws Exception {
  AbstractBaseIteratorTest testCase = new AbstractBaseIteratorTest();
  testCase.testSneakyThrow();
}
}
