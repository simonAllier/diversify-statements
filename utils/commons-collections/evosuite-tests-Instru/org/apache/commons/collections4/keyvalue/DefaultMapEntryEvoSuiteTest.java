/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.junit.BeforeClass;

public class DefaultMapEntryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.keyvalue.DefaultMapEntry.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(442,"org.apache.commons.collections4.keyvalue.DefaultMapEntryEvoSuiteTest.test0");
      DefaultMapEntry<String, String> defaultMapEntry0 = new DefaultMapEntry<String, String>("", "");
  }
}
