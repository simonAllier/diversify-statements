/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.junit.BeforeClass;

public class PredicatedBagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.bag.PredicatedBag.decorated()Lorg/apache/commons/collections4/Bag;: root-Branch
   * 2 org.apache.commons.collections4.bag.PredicatedBag.predicatedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/bag/PredicatedBag;: root-Branch
   * 3 org.apache.commons.collections4.bag.PredicatedBag.uniqueSet()Ljava/util/Set;: root-Branch
   * 4 org.apache.commons.collections4.bag.PredicatedBag.<init>(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1087,"org.apache.commons.collections4.bag.PredicatedBagEvoSuiteTest.test0");
      Predicate<Object> predicate0 = FalsePredicate.INSTANCE;
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      PredicatedBag<Integer> predicatedBag0 = PredicatedBag.predicatedBag((Bag<Integer>) treeBag0, (Predicate<? super Integer>) predicate0);
      HashBag<SynchronizedSortedBag<Object>> hashBag0 = new HashBag<SynchronizedSortedBag<Object>>();
      boolean boolean0 = hashBag0.containsAll((Collection<?>) predicatedBag0);
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.bag.PredicatedBag.add(Ljava/lang/Object;I)Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1088,"org.apache.commons.collections4.bag.PredicatedBagEvoSuiteTest.test1");
      TreeBag<TreeBag<Object>> treeBag0 = new TreeBag<TreeBag<Object>>();
      Predicate<Object> predicate0 = ExceptionPredicate.INSTANCE;
      PredicatedBag<TreeBag<Object>> predicatedBag0 = PredicatedBag.predicatedBag((Bag<TreeBag<Object>>) treeBag0, (Predicate<? super TreeBag<Object>>) predicate0);
      TreeBag<Object> treeBag1 = new TreeBag<Object>();
      // Undeclared exception!
      try {
        predicatedBag0.add(treeBag1, 1);
        fail("Expecting exception: FunctorException");
      
      } catch(FunctorException e) {
         //
         // ExceptionPredicate invoked
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.bag.PredicatedBag.getCount(Ljava/lang/Object;)I: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1089,"org.apache.commons.collections4.bag.PredicatedBagEvoSuiteTest.test2");
      Predicate<Object> predicate0 = FalsePredicate.INSTANCE;
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      PredicatedBag<Integer> predicatedBag0 = PredicatedBag.predicatedBag((Bag<Integer>) treeBag0, (Predicate<? super Integer>) predicate0);
      int int0 = predicatedBag0.getCount((Object) "=z*ZWfu #[i@,')ey");
      assertEquals(0, int0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.bag.PredicatedBag.remove(Ljava/lang/Object;I)Z: root-Branch
   * 2 org.apache.commons.collections4.bag.PredicatedBag.decorated()Lorg/apache/commons/collections4/Bag;: root-Branch
   * 3 org.apache.commons.collections4.bag.PredicatedBag.predicatedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/bag/PredicatedBag;: root-Branch
   * 4 org.apache.commons.collections4.bag.PredicatedBag.<init>(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1090,"org.apache.commons.collections4.bag.PredicatedBagEvoSuiteTest.test3");
      Predicate<Object> predicate0 = FalsePredicate.INSTANCE;
      HashBag<TreeBag<String>> hashBag0 = new HashBag<TreeBag<String>>();
      PredicatedBag<TreeBag<String>> predicatedBag0 = PredicatedBag.predicatedBag((Bag<TreeBag<String>>) hashBag0, (Predicate<? super TreeBag<String>>) predicate0);
      boolean boolean0 = predicatedBag0.remove((Object) "=z*ZWfu #[i@,')ey", 58);
      assertEquals(false, boolean0);
  }
}
