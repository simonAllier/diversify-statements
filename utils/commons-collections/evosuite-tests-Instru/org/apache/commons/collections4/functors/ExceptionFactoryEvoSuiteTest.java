/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.junit.BeforeClass;

public class ExceptionFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory()Lorg/apache/commons/collections4/Factory;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(722,"org.apache.commons.collections4.functors.ExceptionFactoryEvoSuiteTest.test0");
      Factory<String> factory0 = ExceptionFactory.exceptionFactory();
      assertNotNull(factory0);
  }
}
