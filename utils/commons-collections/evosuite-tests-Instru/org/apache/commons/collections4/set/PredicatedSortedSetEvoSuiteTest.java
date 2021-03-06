/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.set.PredicatedSortedSet;
import org.junit.BeforeClass;

public class PredicatedSortedSetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.set.PredicatedSortedSet.comparator()Ljava/util/Comparator;: root-Branch
   * 2 org.apache.commons.collections4.set.PredicatedSortedSet.predicatedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/set/PredicatedSortedSet;: root-Branch
   * 3 org.apache.commons.collections4.set.PredicatedSortedSet.decorated()Ljava/util/SortedSet;: root-Branch
   * 4 org.apache.commons.collections4.set.PredicatedSortedSet.<init>(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1189,"org.apache.commons.collections4.set.PredicatedSortedSetEvoSuiteTest.test0");
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Class<Integer> class0 = Integer.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      PredicatedSortedSet<Integer> predicatedSortedSet0 = PredicatedSortedSet.predicatedSortedSet((SortedSet<Integer>) treeSet0, (Predicate<? super Integer>) predicate0);
      Comparator<? super Integer> comparator0 = predicatedSortedSet0.comparator();
      assertNull(comparator0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.set.PredicatedSortedSet.headSet(Ljava/lang/Object;)Ljava/util/SortedSet;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1190,"org.apache.commons.collections4.set.PredicatedSortedSetEvoSuiteTest.test1");
      Predicate<Object> predicate0 = FalsePredicate.INSTANCE;
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      PredicatedSortedSet<Object> predicatedSortedSet0 = PredicatedSortedSet.predicatedSortedSet((SortedSet<Object>) treeSet0, (Predicate<? super Object>) predicate0);
      // Undeclared exception!
      try {
        predicatedSortedSet0.headSet((Object) predicatedSortedSet0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.set.PredicatedSortedSet cannot be cast to java.lang.Comparable
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.set.PredicatedSortedSet.subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1191,"org.apache.commons.collections4.set.PredicatedSortedSetEvoSuiteTest.test2");
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      Class<String> class0 = String.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      PredicatedSortedSet<Object> predicatedSortedSet0 = PredicatedSortedSet.predicatedSortedSet((SortedSet<Object>) treeSet0, (Predicate<? super Object>) predicate0);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      linkedHashSet0.toString();
      // Undeclared exception!
      try {
        predicatedSortedSet0.subSet((Object) "[]", (Object) predicate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.set.PredicatedSortedSet.first()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1192,"org.apache.commons.collections4.set.PredicatedSortedSetEvoSuiteTest.test3");
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 7);
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) nonePredicate0;
      TreeSet<TreeSet<Object>> treeSet0 = new TreeSet<TreeSet<Object>>();
      PredicatedSortedSet<TreeSet<Object>> predicatedSortedSet0 = PredicatedSortedSet.predicatedSortedSet((SortedSet<TreeSet<Object>>) treeSet0, (Predicate<? super TreeSet<Object>>) predicateArray0[0]);
      // Undeclared exception!
      try {
        predicatedSortedSet0.first();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.set.PredicatedSortedSet.tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1193,"org.apache.commons.collections4.set.PredicatedSortedSetEvoSuiteTest.test4");
      Class<Integer> class0 = Integer.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      PredicatedSortedSet<Object> predicatedSortedSet0 = PredicatedSortedSet.predicatedSortedSet((SortedSet<Object>) treeSet0, (Predicate<? super Object>) predicate0);
      // Undeclared exception!
      try {
        predicatedSortedSet0.tailSet((Object) predicate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.functors.InstanceofPredicate cannot be cast to java.lang.Comparable
         //
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.set.PredicatedSortedSet.last()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.set.PredicatedSortedSet.predicatedSortedSet(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/set/PredicatedSortedSet;: root-Branch
   * 3 org.apache.commons.collections4.set.PredicatedSortedSet.decorated()Ljava/util/SortedSet;: root-Branch
   * 4 org.apache.commons.collections4.set.PredicatedSortedSet.<init>(Ljava/util/SortedSet;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1194,"org.apache.commons.collections4.set.PredicatedSortedSetEvoSuiteTest.test5");
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Predicate<Object> predicate0 = NotNullPredicate.INSTANCE;
      PredicatedSortedSet<Integer> predicatedSortedSet0 = PredicatedSortedSet.predicatedSortedSet((SortedSet<Integer>) treeSet0, (Predicate<? super Integer>) predicate0);
      // Undeclared exception!
      try {
        predicatedSortedSet0.last();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
