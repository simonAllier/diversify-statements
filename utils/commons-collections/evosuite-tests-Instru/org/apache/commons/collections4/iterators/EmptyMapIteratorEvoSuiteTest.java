/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.junit.BeforeClass;

public class EmptyMapIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.EmptyMapIterator.emptyMapIterator()Lorg/apache/commons/collections4/MapIterator;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(495,"org.apache.commons.collections4.iterators.EmptyMapIteratorEvoSuiteTest.test0");
      MapIterator<Integer, String> mapIterator0 = EmptyMapIterator.emptyMapIterator();
      assertEquals(false, mapIterator0.hasNext());
  }
}
