/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.junit.BeforeClass;

public class PredicatedSortedBagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.bag.PredicatedSortedBag.decorated()Lorg/apache/commons/collections4/SortedBag;: root-Branch
   * 2 org.apache.commons.collections4.bag.PredicatedSortedBag.last()Ljava/lang/Object;: root-Branch
   * 3 org.apache.commons.collections4.bag.PredicatedSortedBag.<init>(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   * 4 org.apache.commons.collections4.bag.PredicatedSortedBag.predicatedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/bag/PredicatedSortedBag;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1091,"org.apache.commons.collections4.bag.PredicatedSortedBagEvoSuiteTest.test0");
      LinkedList<SynchronizedSortedBag<Object>> linkedList0 = new LinkedList<SynchronizedSortedBag<Object>>();
      TreeBag<Object> treeBag0 = new TreeBag<Object>((Collection<?>) linkedList0);
      IdentityPredicate<Object> identityPredicate0 = new IdentityPredicate<Object>((Object) treeBag0);
      PredicatedSortedBag<Object> predicatedSortedBag0 = PredicatedSortedBag.predicatedSortedBag((SortedBag<Object>) treeBag0, (Predicate<? super Object>) identityPredicate0);
      // Undeclared exception!
      try {
        predicatedSortedBag0.last();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.bag.PredicatedSortedBag.first()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1092,"org.apache.commons.collections4.bag.PredicatedSortedBagEvoSuiteTest.test1");
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      PredicatedSortedBag<Integer> predicatedSortedBag0 = PredicatedSortedBag.predicatedSortedBag((SortedBag<Integer>) treeBag0, (Predicate<? super Integer>) instanceofPredicate0);
      // Undeclared exception!
      try {
        predicatedSortedBag0.first();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.bag.PredicatedSortedBag.comparator()Ljava/util/Comparator;: root-Branch
   * 2 org.apache.commons.collections4.bag.PredicatedSortedBag.decorated()Lorg/apache/commons/collections4/SortedBag;: root-Branch
   * 3 org.apache.commons.collections4.bag.PredicatedSortedBag.<init>(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   * 4 org.apache.commons.collections4.bag.PredicatedSortedBag.predicatedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/bag/PredicatedSortedBag;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1093,"org.apache.commons.collections4.bag.PredicatedSortedBagEvoSuiteTest.test2");
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      PredicatedSortedBag<Integer> predicatedSortedBag0 = PredicatedSortedBag.predicatedSortedBag((SortedBag<Integer>) treeBag0, (Predicate<? super Integer>) instanceofPredicate0);
      Comparator<? super Integer> comparator0 = predicatedSortedBag0.comparator();
      assertNull(comparator0);
  }
}
