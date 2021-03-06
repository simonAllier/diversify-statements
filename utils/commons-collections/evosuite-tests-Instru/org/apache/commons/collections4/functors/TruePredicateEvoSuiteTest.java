/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.BeforeClass;

public class TruePredicateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.TruePredicate.truePredicate()Lorg/apache/commons/collections4/Predicate;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(842,"org.apache.commons.collections4.functors.TruePredicateEvoSuiteTest.test0");
      Predicate<String> predicate0 = TruePredicate.truePredicate();
      assertNotNull(predicate0);
  }
}
