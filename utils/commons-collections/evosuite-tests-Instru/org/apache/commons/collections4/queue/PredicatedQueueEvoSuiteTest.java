/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.queue;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.queue.PredicatedQueue;
import org.junit.BeforeClass;

public class PredicatedQueueEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.queue.PredicatedQueue.poll()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.queue.PredicatedQueue.decorated()Ljava/util/Queue;: root-Branch
   * 3 org.apache.commons.collections4.queue.PredicatedQueue.predicatedQueue(Ljava/util/Queue;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/queue/PredicatedQueue;: root-Branch
   * 4 org.apache.commons.collections4.queue.PredicatedQueue.<init>(Ljava/util/Queue;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1135,"org.apache.commons.collections4.queue.PredicatedQueueEvoSuiteTest.test0");
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      Predicate<Object> predicate0 = FalsePredicate.INSTANCE;
      PredicatedQueue<LinkedList<Object>> predicatedQueue0 = PredicatedQueue.predicatedQueue((Queue<LinkedList<Object>>) linkedList0, (Predicate<? super LinkedList<Object>>) predicate0);
      LinkedList<Object> linkedList1 = predicatedQueue0.poll();
      assertNull(linkedList1);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.queue.PredicatedQueue.remove()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1136,"org.apache.commons.collections4.queue.PredicatedQueueEvoSuiteTest.test1");
      ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>();
      Predicate<Object> predicate0 = NotNullPredicate.INSTANCE;
      PredicatedQueue<Integer> predicatedQueue0 = PredicatedQueue.predicatedQueue((Queue<Integer>) arrayDeque0, (Predicate<? super Integer>) predicate0);
      // Undeclared exception!
      try {
        predicatedQueue0.remove();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.queue.PredicatedQueue.offer(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1137,"org.apache.commons.collections4.queue.PredicatedQueueEvoSuiteTest.test2");
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      PredicatedQueue<Object> predicatedQueue0 = PredicatedQueue.predicatedQueue((Queue<Object>) priorityQueue0, (Predicate<? super Object>) instanceofPredicate0);
      boolean boolean0 = predicatedQueue0.offer((Object) priorityQueue0);
      assertEquals(1, predicatedQueue0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.queue.PredicatedQueue.element()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1138,"org.apache.commons.collections4.queue.PredicatedQueueEvoSuiteTest.test3");
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PredicatedQueue<Object> predicatedQueue0 = PredicatedQueue.predicatedQueue((Queue<Object>) linkedList0, (Predicate<? super Object>) instanceofPredicate0);
      // Undeclared exception!
      try {
        predicatedQueue0.element();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.queue.PredicatedQueue.peek()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.queue.PredicatedQueue.decorated()Ljava/util/Queue;: root-Branch
   * 3 org.apache.commons.collections4.queue.PredicatedQueue.predicatedQueue(Ljava/util/Queue;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/queue/PredicatedQueue;: root-Branch
   * 4 org.apache.commons.collections4.queue.PredicatedQueue.<init>(Ljava/util/Queue;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1139,"org.apache.commons.collections4.queue.PredicatedQueueEvoSuiteTest.test4");
      Predicate<Object> predicate0 = FalsePredicate.INSTANCE;
      ArrayDeque<LinkedList<Integer>> arrayDeque0 = new ArrayDeque<LinkedList<Integer>>();
      PredicatedQueue<LinkedList<Integer>> predicatedQueue0 = PredicatedQueue.predicatedQueue((Queue<LinkedList<Integer>>) arrayDeque0, (Predicate<? super LinkedList<Integer>>) predicate0);
      LinkedList<Integer> linkedList0 = predicatedQueue0.peek();
      assertNull(linkedList0);
  }
}
