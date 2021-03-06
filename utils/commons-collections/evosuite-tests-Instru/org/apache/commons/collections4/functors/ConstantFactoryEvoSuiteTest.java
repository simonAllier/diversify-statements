/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.BeforeClass;

public class ConstantFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.functors.ConstantFactory.getConstant()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.functors.ConstantFactory.<init>(Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(707,"org.apache.commons.collections4.functors.ConstantFactoryEvoSuiteTest.test0");
      ConstantFactory<Object> constantFactory0 = new ConstantFactory<Object>((Object) null);
      Object object0 = constantFactory0.getConstant();
      assertNull(object0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.ConstantFactory.create()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(708,"org.apache.commons.collections4.functors.ConstantFactoryEvoSuiteTest.test1");
      ConstantFactory<Object> constantFactory0 = new ConstantFactory<Object>((Object) null);
      Object object0 = constantFactory0.create();
      assertNull(object0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.functors.ConstantFactory.constantFactory(Ljava/lang/Object;)Lorg/apache/commons/collections4/Factory;: I3 Branch 1 IFNONNULL L53 - true
   * 2 org.apache.commons.collections4.functors.ConstantFactory.<init>(Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(709,"org.apache.commons.collections4.functors.ConstantFactoryEvoSuiteTest.test2");
      Factory<String> factory0 = ConstantFactory.constantFactory("");
      assertNotNull(factory0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.ConstantFactory.constantFactory(Ljava/lang/Object;)Lorg/apache/commons/collections4/Factory;: I3 Branch 1 IFNONNULL L53 - false
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(710,"org.apache.commons.collections4.functors.ConstantFactoryEvoSuiteTest.test3");
      Factory<Object> factory0 = ConstantFactory.constantFactory((Object) null);
      assertNotNull(factory0);
  }
}
