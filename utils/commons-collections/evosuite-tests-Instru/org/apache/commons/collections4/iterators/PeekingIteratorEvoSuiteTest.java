/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.junit.BeforeClass;

public class PeekingIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.iterators.PeekingIterator.peekingIterator(Ljava/util/Iterator;)Lorg/apache/commons/collections4/iterators/PeekingIterator;: I3 Branch 1 IFNONNULL L59 - true
   * 2 org.apache.commons.collections4.iterators.PeekingIterator.peekingIterator(Ljava/util/Iterator;)Lorg/apache/commons/collections4/iterators/PeekingIterator;: I15 Branch 2 IFEQ L62 - false
   * 3 org.apache.commons.collections4.iterators.PeekingIterator.<init>(Ljava/util/Iterator;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(605,"org.apache.commons.collections4.iterators.PeekingIteratorEvoSuiteTest.test0");
      PeekingIterator<Object> peekingIterator0 = new PeekingIterator<Object>((Iterator<?>) null);
      PeekingIterator<Object> peekingIterator1 = PeekingIterator.peekingIterator((Iterator<?>) peekingIterator0);
      assertNotNull(peekingIterator1);
      assertSame(peekingIterator0, peekingIterator1);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.PeekingIterator.peekingIterator(Ljava/util/Iterator;)Lorg/apache/commons/collections4/iterators/PeekingIterator;: I3 Branch 1 IFNONNULL L59 - false
   */

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(606,"org.apache.commons.collections4.iterators.PeekingIteratorEvoSuiteTest.test1");
      try {
        PeekingIterator.peekingIterator((Iterator<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Iterator must not be null
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.PeekingIterator.fill()V: I4 Branch 3 IFNE L82 - false
   * 2 org.apache.commons.collections4.iterators.PeekingIterator.fill()V: I7 Branch 4 IFEQ L82 - true
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(607,"org.apache.commons.collections4.iterators.PeekingIteratorEvoSuiteTest.test2");
      PeekingIterator<Integer> peekingIterator0 = new PeekingIterator<Integer>((Iterator<? extends Integer>) null);
      // Undeclared exception!
      try {
        peekingIterator0.peek();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.PeekingIterator.hasNext()Z: I4 Branch 6 IFEQ L97 - true
   * 2 org.apache.commons.collections4.iterators.PeekingIterator.hasNext()Z: I13 Branch 7 IFEQ L100 - true
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(608,"org.apache.commons.collections4.iterators.PeekingIteratorEvoSuiteTest.test3");
      PeekingIterator<Integer> peekingIterator0 = new PeekingIterator<Integer>((Iterator<? extends Integer>) null);
      // Undeclared exception!
      try {
        peekingIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.PeekingIterator.remove()V: I4 Branch 12 IFEQ L153 - true
   * 2 org.apache.commons.collections4.iterators.PeekingIterator.<init>(Ljava/util/Iterator;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(609,"org.apache.commons.collections4.iterators.PeekingIteratorEvoSuiteTest.test4");
      PeekingIterator<Object> peekingIterator0 = new PeekingIterator<Object>((Iterator<?>) null);
      // Undeclared exception!
      try {
        peekingIterator0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}