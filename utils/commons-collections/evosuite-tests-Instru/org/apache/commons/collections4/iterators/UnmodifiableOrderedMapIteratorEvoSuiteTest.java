/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.junit.BeforeClass;

public class UnmodifiableOrderedMapIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(Lorg/apache/commons/collections4/OrderedMapIterator;)Lorg/apache/commons/collections4/OrderedMapIterator;: I3 Branch 1 IFNONNULL L49 - false
   */

  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(675,"org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIteratorEvoSuiteTest.test0");
      try {
        UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator((OrderedMapIterator<Object, UnmodifiableMapEntry<String, String>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // OrderedMapIterator must not be null
         //
      }
  }
}
