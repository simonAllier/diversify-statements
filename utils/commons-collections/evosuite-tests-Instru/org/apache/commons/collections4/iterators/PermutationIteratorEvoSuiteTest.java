/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.iterators.PermutationIterator;
import org.junit.BeforeClass;

public class PermutationIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.iterators.PermutationIterator.remove()V: root-Branch
   * 2 org.apache.commons.collections4.iterators.PermutationIterator.<init>(Ljava/util/Collection;)V: I7 Branch 1 IFNONNULL L77 - true
   * 3 org.apache.commons.collections4.iterators.PermutationIterator.<init>(Ljava/util/Collection;)V: I54 Branch 2 IFEQ L86 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(610,"org.apache.commons.collections4.iterators.PermutationIteratorEvoSuiteTest.test0");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      PermutationIterator<Integer> permutationIterator0 = new PermutationIterator<Integer>((Collection<Integer>) linkedList0);
      // Undeclared exception!
      try {
        permutationIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // remove() is not supported
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.PermutationIterator.<init>(Ljava/util/Collection;)V: I7 Branch 1 IFNONNULL L77 - false
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(611,"org.apache.commons.collections4.iterators.PermutationIteratorEvoSuiteTest.test1");
      PermutationIterator<Integer> permutationIterator0 = null;
      try {
        permutationIterator0 = new PermutationIterator<Integer>((Collection<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The collection must not be null
         //
      }
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.iterators.PermutationIterator.hasNext()Z: I4 Branch 3 IFNULL L99 - true
   * 2 org.apache.commons.collections4.iterators.PermutationIterator.hasNext()Z: I4 Branch 3 IFNULL L99 - false
   * 3 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I4 Branch 4 IFNE L108 - true
   * 4 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I4 Branch 4 IFNE L108 - false
   * 5 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I28 Branch 5 IF_ICMPGE L115 - true
   * 6 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I100 Branch 13 IF_ICMPNE L124 - false
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(612,"org.apache.commons.collections4.iterators.PermutationIteratorEvoSuiteTest.test2");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      PermutationIterator<String> permutationIterator0 = new PermutationIterator<String>((Collection<String>) linkedList0);
      List<String> list0 = permutationIterator0.next();
      assertNotNull(list0);
      
      // Undeclared exception!
      try {
        permutationIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 23 covered goals:
   * 1 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I42 Branch 7 IF_ICMPGE L116 - true
   * 2 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I59 Branch 9 IFNE L116 - true
   * 3 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I35 Branch 6 IFEQ L116 - false
   * 4 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I42 Branch 7 IF_ICMPGE L116 - false
   * 5 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I53 Branch 8 IF_ICMPGT L116 - true
   * 6 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I100 Branch 13 IF_ICMPNE L124 - false
   * 7 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I121 Branch 14 IFEQ L131 - false
   * 8 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I207 Branch 16 IF_ICMPLE L142 - false
   * 9 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I217 Branch 17 IFNE L143 - false
   * 10 org.apache.commons.collections4.iterators.PermutationIterator.<init>(Ljava/util/Collection;)V: I54 Branch 2 IFEQ L86 - false
   * 11 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I28 Branch 5 IF_ICMPGE L115 - false
   * 12 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I35 Branch 6 IFEQ L116 - true
   * 13 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I59 Branch 9 IFNE L116 - false
   * 14 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I61 Branch 10 IFLE L116 - true
   * 15 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I61 Branch 10 IFLE L116 - false
   * 16 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I72 Branch 11 IF_ICMPLE L116 - true
   * 17 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I72 Branch 11 IF_ICMPLE L116 - false
   * 18 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I80 Branch 12 IF_ICMPLE L118 - false
   * 19 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I100 Branch 13 IF_ICMPNE L124 - true
   * 20 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I121 Branch 14 IFEQ L131 - true
   * 21 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I199 Branch 15 IF_ICMPGE L141 - true
   * 22 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I199 Branch 15 IF_ICMPGE L141 - false
   * 23 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I207 Branch 16 IF_ICMPLE L142 - true
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(613,"org.apache.commons.collections4.iterators.PermutationIteratorEvoSuiteTest.test3");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      LinkedList<LinkedList<String>> linkedList2 = new LinkedList<LinkedList<String>>();
      linkedList0.add((Object) linkedList2);
      linkedList1.toString();
      linkedList0.add((Object) "[]");
      Object object0 = new Object();
      linkedList0.add(object0);
      PermutationIterator<Object> permutationIterator0 = new PermutationIterator<Object>((Collection<Object>) linkedList0);
      permutationIterator0.next();
      permutationIterator0.next();
      List<Object> list0 = permutationIterator0.next();
      permutationIterator0.next();
      permutationIterator0.next();
      List<Object> list1 = permutationIterator0.next();
      assertEquals(false, permutationIterator0.hasNext());
      assertFalse(list1.equals(list0));
  }

  //Test case number: 4
  /*
   * 20 covered goals:
   * 1 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I80 Branch 12 IF_ICMPLE L118 - true
   * 2 org.apache.commons.collections4.iterators.PermutationIterator.<init>(Ljava/util/Collection;)V: I7 Branch 1 IFNONNULL L77 - true
   * 3 org.apache.commons.collections4.iterators.PermutationIterator.<init>(Ljava/util/Collection;)V: I54 Branch 2 IFEQ L86 - true
   * 4 org.apache.commons.collections4.iterators.PermutationIterator.<init>(Ljava/util/Collection;)V: I54 Branch 2 IFEQ L86 - false
   * 5 org.apache.commons.collections4.iterators.PermutationIterator.hasNext()Z: I4 Branch 3 IFNULL L99 - false
   * 6 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I4 Branch 4 IFNE L108 - true
   * 7 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I28 Branch 5 IF_ICMPGE L115 - true
   * 8 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I28 Branch 5 IF_ICMPGE L115 - false
   * 9 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I35 Branch 6 IFEQ L116 - true
   * 10 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I59 Branch 9 IFNE L116 - false
   * 11 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I61 Branch 10 IFLE L116 - true
   * 12 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I61 Branch 10 IFLE L116 - false
   * 13 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I72 Branch 11 IF_ICMPLE L116 - true
   * 14 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I72 Branch 11 IF_ICMPLE L116 - false
   * 15 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I80 Branch 12 IF_ICMPLE L118 - false
   * 16 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I100 Branch 13 IF_ICMPNE L124 - true
   * 17 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I121 Branch 14 IFEQ L131 - true
   * 18 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I199 Branch 15 IF_ICMPGE L141 - true
   * 19 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I199 Branch 15 IF_ICMPGE L141 - false
   * 20 org.apache.commons.collections4.iterators.PermutationIterator.next()Ljava/util/List;: I207 Branch 16 IF_ICMPLE L142 - true
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(614,"org.apache.commons.collections4.iterators.PermutationIteratorEvoSuiteTest.test4");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList0.add((Object) linkedList1);
      LinkedList<LinkedList<String>> linkedList2 = new LinkedList<LinkedList<String>>();
      linkedList0.add((Object) linkedList2);
      linkedList1.toString();
      linkedList0.add((Object) "[]");
      Object object0 = new Object();
      linkedList0.add(object0);
      PermutationIterator<Object> permutationIterator0 = new PermutationIterator<Object>((Collection<Object>) linkedList0);
      List<Object> list0 = permutationIterator0.next();
      assertNotNull(list0);
      
      List<Object> list1 = permutationIterator0.next();
      assertFalse(list1.equals(list0));
      assertNotNull(list1);
      
      List<Object> list2 = permutationIterator0.next();
      assertFalse(list2.equals(list1));
  }
}
