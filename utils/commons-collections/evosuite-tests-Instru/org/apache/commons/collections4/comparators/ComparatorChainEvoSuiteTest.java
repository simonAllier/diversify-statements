/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.BitSet;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.collections4.comparators.ComparatorChain;
import org.junit.BeforeClass;

public class ComparatorChainEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.isLocked()Z: root-Branch
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/List;)V: root-Branch
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/List;Ljava/util/BitSet;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(865,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test0");
      LinkedList<Comparator<Object>> linkedList0 = new LinkedList<Comparator<Object>>();
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>((List<Comparator<Object>>) linkedList0);
      boolean boolean0 = comparatorChain0.isLocked();
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.size()I: root-Branch
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.<init>()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(866,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test1");
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>();
      comparatorChain0.size();
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.addComparator(Ljava/util/Comparator;)V: root-Branch
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.addComparator(Ljava/util/Comparator;Z)V: I15 Branch 2 IF_ICMPNE L153 - true
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/Comparator;)V: root-Branch
   * 4 org.apache.commons.collections4.comparators.ComparatorChain.checkLocked()V: I5 Branch 4 IF_ICMPNE L239 - true
   * 5 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/Comparator;Z)V: I41 Branch 1 IF_ICMPNE L94 - true
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(876,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test2");
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>((Comparator<Object>) null);
      comparatorChain0.addComparator((Comparator<Object>) null);
      assertEquals(2, comparatorChain0.size());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.setReverseSort(I)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(877,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test3");
      ComparatorChain<Integer> comparatorChain0 = new ComparatorChain<Integer>((Comparator<Integer>) null);
      comparatorChain0.setReverseSort(0);
      assertEquals(1, comparatorChain0.size());
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.setForwardSort(I)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(878,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test4");
      ComparatorChain<String> comparatorChain0 = new ComparatorChain<String>();
      comparatorChain0.setForwardSort(1);
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.setComparator(ILjava/util/Comparator;Z)V: I16 Branch 3 IF_ICMPNE L183 - true
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.setComparator(ILjava/util/Comparator;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(879,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test5");
      LinkedList<Comparator<Integer>> linkedList0 = new LinkedList<Comparator<Integer>>();
      ComparatorChain<Integer> comparatorChain0 = new ComparatorChain<Integer>((List<Comparator<Integer>>) linkedList0);
      ComparatorChain<Integer> comparatorChain1 = new ComparatorChain<Integer>((Comparator<Integer>) comparatorChain0, false);
      comparatorChain1.setComparator(0, (Comparator<Integer>) comparatorChain0);
      assertEquals(false, comparatorChain1.isLocked());
      assertEquals(1, comparatorChain1.size());
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.setComparator(ILjava/util/Comparator;Z)V: I16 Branch 3 IF_ICMPNE L183 - false
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/Comparator;Z)V: I41 Branch 1 IF_ICMPNE L94 - false
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(880,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test6");
      ComparatorChain<ComparatorChain<Object>> comparatorChain0 = new ComparatorChain<ComparatorChain<Object>>((Comparator<ComparatorChain<Object>>) null, true);
      comparatorChain0.setComparator(0, (Comparator<ComparatorChain<Object>>) null, true);
      assertEquals(1, comparatorChain0.size());
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.checkChainIntegrity()V: I5 Branch 5 IFNE L251 - true
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I4 Branch 6 IFNE L267 - false
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I27 Branch 7 IFEQ L274 - false
   * 4 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/Comparator;)V: root-Branch
   * 5 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/Comparator;Z)V: I41 Branch 1 IF_ICMPNE L94 - true
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(881,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test7");
      LinkedList<Comparator<Integer>> linkedList0 = new LinkedList<Comparator<Integer>>();
      ComparatorChain<String> comparatorChain0 = new ComparatorChain<String>();
      ComparatorChain<Integer> comparatorChain1 = new ComparatorChain<Integer>((List<Comparator<Integer>>) linkedList0);
      ComparatorChain<Object> comparatorChain2 = new ComparatorChain<Object>((Comparator<Object>) null);
      // Undeclared exception!
      try {
        comparatorChain2.compare((Object) comparatorChain0, (Object) comparatorChain1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.checkChainIntegrity()V: I5 Branch 5 IFNE L251 - false
   */

  @Test
  public void test8()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(882,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test8");
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>();
      try {
        comparatorChain0.compare((Object) comparatorChain0, (Object) comparatorChain0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // ComparatorChains must contain at least one Comparator
         //
      }
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I4 Branch 6 IFNE L267 - true
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.checkLocked()V: I5 Branch 4 IF_ICMPNE L239 - true
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.addComparator(Ljava/util/Comparator;Z)V: I15 Branch 2 IF_ICMPNE L153 - false
   * 4 org.apache.commons.collections4.comparators.ComparatorChain.checkChainIntegrity()V: I5 Branch 5 IFNE L251 - true
   * 5 org.apache.commons.collections4.comparators.ComparatorChain.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I4 Branch 6 IFNE L267 - false
   * 6 org.apache.commons.collections4.comparators.ComparatorChain.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I27 Branch 7 IFEQ L274 - false
   */

  @Test
  public void test9()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(883,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test9");
      LinkedList<Comparator<String>> linkedList0 = new LinkedList<Comparator<String>>();
      ComparatorChain<String> comparatorChain0 = new ComparatorChain<String>((List<Comparator<String>>) linkedList0);
      comparatorChain0.addComparator((Comparator<String>) comparatorChain0, true);
      assertEquals(false, linkedList0.isEmpty());
      
      // Undeclared exception!
      try {
        comparatorChain0.compare("", "");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.hashCode()I: I9 Branch 11 IF_ACMPEQ L306 - false
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.hashCode()I: I23 Branch 12 IF_ACMPEQ L309 - false
   */

  @Test
  public void test10()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(867,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test10");
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>();
      int int0 = comparatorChain0.hashCode();
      assertEquals(false, comparatorChain0.isLocked());
      assertEquals(1235, int0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.hashCode()I: I23 Branch 12 IF_ACMPEQ L309 - true
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.hashCode()I: I9 Branch 11 IF_ACMPEQ L306 - true
   */

  @Test
  public void test11()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(868,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test11");
      ComparatorChain<Integer> comparatorChain0 = new ComparatorChain<Integer>((List<Comparator<Integer>>) null, (BitSet) null);
      int int0 = comparatorChain0.hashCode();
      assertEquals(0, int0);
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 12
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I4 Branch 13 IF_ACMPNE L333 - true
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I13 Branch 14 IF_ACMPNE L336 - true
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I25 Branch 15 IFEQ L339 - false
   * 4 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I36 Branch 16 IF_ACMPNE L341 - true
   * 5 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I48 Branch 18 IFEQ L341 - true
   * 6 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/Comparator;Z)V: I41 Branch 1 IF_ICMPNE L94 - false
   */

  @Test
  public void test12()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(869,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test12");
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>();
      ComparatorChain<Object> comparatorChain1 = new ComparatorChain<Object>((Comparator<Object>) comparatorChain0, true);
      boolean boolean0 = comparatorChain1.equals((Object) comparatorChain0);
      assertEquals(false, comparatorChain0.isLocked());
      assertEquals(1, comparatorChain1.size());
      assertEquals(false, boolean0);
  }

  //Test case number: 13
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I4 Branch 13 IF_ACMPNE L333 - false
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I48 Branch 18 IFEQ L341 - false
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I53 Branch 19 IF_ACMPNE L341 - true
   * 4 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I65 Branch 21 IFEQ L341 - false
   */

  @Test
  public void test13()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(870,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test13");
      LinkedList<Comparator<Integer>> linkedList0 = new LinkedList<Comparator<Integer>>();
      ComparatorChain<String> comparatorChain0 = new ComparatorChain<String>();
      ComparatorChain<Integer> comparatorChain1 = new ComparatorChain<Integer>((List<Comparator<Integer>>) linkedList0);
      boolean boolean0 = comparatorChain1.equals((Object) comparatorChain0);
      assertEquals(true, boolean0);
      assertEquals(false, comparatorChain1.isLocked());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I13 Branch 14 IF_ACMPNE L336 - false
   */

  @Test
  public void test14()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(871,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test14");
      byte[] byteArray0 = new byte[1];
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      LinkedList<Comparator<String>> linkedList0 = new LinkedList<Comparator<String>>();
      ComparatorChain<String> comparatorChain0 = new ComparatorChain<String>((List<Comparator<String>>) linkedList0, bitSet0);
      boolean boolean0 = comparatorChain0.equals((Object) null);
      assertEquals(false, boolean0);
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I25 Branch 15 IFEQ L339 - true
   */

  @Test
  public void test15()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(872,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test15");
      ComparatorChain<ComparatorChain<Object>> comparatorChain0 = new ComparatorChain<ComparatorChain<Object>>();
      Object object0 = new Object();
      boolean boolean0 = comparatorChain0.equals(object0);
      assertEquals(false, boolean0);
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I36 Branch 16 IF_ACMPNE L341 - false
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I40 Branch 17 IF_ACMPNE L341 - true
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.<init>()V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(873,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test16");
      LinkedList<Comparator<Object>> linkedList0 = new LinkedList<Comparator<Object>>();
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>((List<Comparator<Object>>) linkedList0, (BitSet) null);
      ComparatorChain<ComparatorChain<Object>> comparatorChain1 = new ComparatorChain<ComparatorChain<Object>>();
      boolean boolean0 = comparatorChain0.equals((Object) comparatorChain1);
      assertEquals(false, comparatorChain0.isLocked());
      assertEquals(false, boolean0);
  }

  //Test case number: 17
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I40 Branch 17 IF_ACMPNE L341 - false
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I65 Branch 21 IFEQ L341 - true
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I36 Branch 16 IF_ACMPNE L341 - false
   * 4 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I53 Branch 19 IF_ACMPNE L341 - true
   */

  @Test
  public void test17()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(874,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test17");
      LinkedList<Comparator<Object>> linkedList0 = new LinkedList<Comparator<Object>>();
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>((List<Comparator<Object>>) linkedList0, (BitSet) null);
      ComparatorChain<Integer> comparatorChain1 = new ComparatorChain<Integer>((List<Comparator<Integer>>) null, (BitSet) null);
      boolean boolean0 = comparatorChain0.equals((Object) comparatorChain1);
      assertEquals(false, boolean0);
      assertEquals(false, comparatorChain0.isLocked());
  }

  //Test case number: 18
  /*
   * 9 covered goals:
   * 1 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I53 Branch 19 IF_ACMPNE L341 - false
   * 2 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I57 Branch 20 IF_ACMPNE L341 - true
   * 3 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/List;)V: root-Branch
   * 4 org.apache.commons.collections4.comparators.ComparatorChain.<init>(Ljava/util/List;Ljava/util/BitSet;)V: root-Branch
   * 5 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I4 Branch 13 IF_ACMPNE L333 - true
   * 6 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I13 Branch 14 IF_ACMPNE L336 - true
   * 7 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I25 Branch 15 IFEQ L339 - false
   * 8 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I36 Branch 16 IF_ACMPNE L341 - true
   * 9 org.apache.commons.collections4.comparators.ComparatorChain.equals(Ljava/lang/Object;)Z: I48 Branch 18 IFEQ L341 - false
   */

  @Test
  public void test18()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(875,"org.apache.commons.collections4.comparators.ComparatorChainEvoSuiteTest.test18");
      BitSet bitSet0 = new BitSet();
      ComparatorChain<Object> comparatorChain0 = new ComparatorChain<Object>((List<Comparator<Object>>) null, bitSet0);
      LinkedList<Comparator<Object>> linkedList0 = new LinkedList<Comparator<Object>>();
      ComparatorChain<Object> comparatorChain1 = new ComparatorChain<Object>((List<Comparator<Object>>) linkedList0);
      boolean boolean0 = comparatorChain0.equals((Object) comparatorChain1);
      assertFalse(comparatorChain1.equals(comparatorChain0));
      assertEquals(false, boolean0);
      assertEquals(false, comparatorChain0.isLocked());
  }
}
