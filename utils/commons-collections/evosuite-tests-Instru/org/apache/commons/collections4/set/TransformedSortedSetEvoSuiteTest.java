/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.set.TransformedSortedSet;
import org.junit.BeforeClass;

public class TransformedSortedSetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.set.TransformedSortedSet.tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;: root-Branch
   * 2 org.apache.commons.collections4.set.TransformedSortedSet.getSortedSet()Ljava/util/SortedSet;: root-Branch
   * 3 org.apache.commons.collections4.set.TransformedSortedSet.<init>(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 4 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I11 Branch 1 IFNULL L80 - false
   * 5 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I13 Branch 2 IFNULL L80 - false
   * 6 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I16 Branch 3 IFLE L80 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1198,"org.apache.commons.collections4.set.TransformedSortedSetEvoSuiteTest.test0");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 10);
      InvokerTransformer<String, String> invokerTransformer0 = new InvokerTransformer<String, String>("7V]7=C,SyNxo*|", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedSet<String> transformedSortedSet0 = TransformedSortedSet.transformedSortedSet((SortedSet<String>) treeSet0, (Transformer<? super String, ? extends String>) invokerTransformer0);
      SortedSet<String> sortedSet0 = transformedSortedSet0.tailSet("7V]7=C,SyNxo*|");
      assertEquals(0, sortedSet0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.set.TransformedSortedSet.subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1199,"org.apache.commons.collections4.set.TransformedSortedSetEvoSuiteTest.test1");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 10);
      InvokerTransformer<String, String> invokerTransformer0 = new InvokerTransformer<String, String>("7V]7=C,SyNxo*|", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedSet<String> transformedSortedSet0 = TransformedSortedSet.transformedSortedSet((SortedSet<String>) treeSet0, (Transformer<? super String, ? extends String>) invokerTransformer0);
      SortedSet<String> sortedSet0 = transformedSortedSet0.subSet("7V]7=C,SyNxo*|", "7V]7=C,SyNxo*|");
      assertEquals(true, sortedSet0.isEmpty());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.set.TransformedSortedSet.headSet(Ljava/lang/Object;)Ljava/util/SortedSet;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1200,"org.apache.commons.collections4.set.TransformedSortedSetEvoSuiteTest.test2");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 10);
      InvokerTransformer<String, String> invokerTransformer0 = new InvokerTransformer<String, String>("7V]7=C,SyNxo*|", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedSet<String> transformedSortedSet0 = TransformedSortedSet.transformedSortedSet((SortedSet<String>) treeSet0, (Transformer<? super String, ? extends String>) invokerTransformer0);
      SortedSet<String> sortedSet0 = transformedSortedSet0.headSet("7V]7=C,SyNxo*|");
      assertEquals(true, sortedSet0.isEmpty());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.set.TransformedSortedSet.first()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1201,"org.apache.commons.collections4.set.TransformedSortedSetEvoSuiteTest.test3");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 9);
      InvokerTransformer<Object, String> invokerTransformer0 = new InvokerTransformer<Object, String>("InvokerTransformer: The method '", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedSet<String> transformedSortedSet0 = TransformedSortedSet.transformingSortedSet((SortedSet<String>) treeSet0, (Transformer<? super String, ? extends String>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedSortedSet0.first();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.set.TransformedSortedSet.comparator()Ljava/util/Comparator;: root-Branch
   * 2 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I16 Branch 3 IFLE L80 - true
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1202,"org.apache.commons.collections4.set.TransformedSortedSetEvoSuiteTest.test4");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 10);
      InvokerTransformer<String, String> invokerTransformer0 = new InvokerTransformer<String, String>("7V]7=C,SyNxo*|", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedSet<String> transformedSortedSet0 = TransformedSortedSet.transformedSortedSet((SortedSet<String>) treeSet0, (Transformer<? super String, ? extends String>) invokerTransformer0);
      Comparator<? super String> comparator0 = transformedSortedSet0.comparator();
      assertNull(comparator0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.set.TransformedSortedSet.last()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.set.TransformedSortedSet.getSortedSet()Ljava/util/SortedSet;: root-Branch
   * 3 org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1203,"org.apache.commons.collections4.set.TransformedSortedSetEvoSuiteTest.test5");
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 10);
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      InvokerTransformer<Integer, Integer> invokerTransformer0 = new InvokerTransformer<Integer, Integer>("7V]7=C,SyNxo*|", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedSet<Integer> transformedSortedSet0 = TransformedSortedSet.transformingSortedSet((SortedSet<Integer>) treeSet0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedSortedSet0.last();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I16 Branch 3 IFLE L80 - false
   * 2 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I41 Branch 4 IF_ICMPGE L84 - false
   * 3 org.apache.commons.collections4.set.TransformedSortedSet.<init>(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 4 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I11 Branch 1 IFNULL L80 - false
   * 5 org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/set/TransformedSortedSet;: I13 Branch 2 IFNULL L80 - false
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1204,"org.apache.commons.collections4.set.TransformedSortedSetEvoSuiteTest.test6");
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
      treeSet1.toString();
      treeSet0.add((Object) "[]");
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 9);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("[]", (Class<?>[]) classArray0, (Object[]) classArray0);
      // Undeclared exception!
      try {
        TransformedSortedSet.transformedSortedSet((SortedSet<Object>) treeSet0, (Transformer<? super Object, ?>) invokerTransformer0);
        fail("Expecting exception: FunctorException");
      
      } catch(FunctorException e) {
         //
         // InvokerTransformer: The method '[]' on 'class java.lang.String' does not exist
         //
      }
  }
}