/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.set.ListOrderedSet;
import org.junit.BeforeClass;

public class ListOrderedSetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.set.ListOrderedSet.remove(I)Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.set.ListOrderedSet.listOrderedSet(Ljava/util/List;)Lorg/apache/commons/collections4/set/ListOrderedSet;: I3 Branch 5 IFNONNULL L121 - true
   * 3 org.apache.commons.collections4.set.ListOrderedSet.<init>(Ljava/util/Set;Ljava/util/List;)V: I8 Branch 6 IFNONNULL L165 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1186,"org.apache.commons.collections4.set.ListOrderedSetEvoSuiteTest.test0");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      // Undeclared exception!
      try {
        listOrderedSet0.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.set.ListOrderedSet.listOrderedSet(Ljava/util/Set;)Lorg/apache/commons/collections4/set/ListOrderedSet;: root-Branch
   * 2 org.apache.commons.collections4.set.ListOrderedSet.<init>(Ljava/util/Set;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1187,"org.apache.commons.collections4.set.ListOrderedSetEvoSuiteTest.test1");
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((Set<Object>) linkedHashSet0);
      assertEquals(true, listOrderedSet0.isEmpty());
  }
}
