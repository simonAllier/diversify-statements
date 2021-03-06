/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedList;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.collection.IndexedCollection;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.map.MultiValueMap;
import org.junit.BeforeClass;

public class IndexedCollectionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.values(Ljava/lang/Object;)Ljava/util/Collection;: root-Branch
   * 2 org.apache.commons.collections4.collection.IndexedCollection.nonUniqueIndexedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/IndexedCollection;: root-Branch
   * 3 org.apache.commons.collections4.collection.IndexedCollection.<init>(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/MultiMap;Z)V: root-Branch
   * 4 org.apache.commons.collections4.collection.IndexedCollection.reindex()V: I14 Branch 6 IFEQ L199 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(965,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test0");
      MultiValueMap<String, String> multiValueMap0 = new MultiValueMap<String, String>();
      Collection<Object> collection0 = multiValueMap0.values();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ConstantTransformer<Object, LinkedList<String>> constantTransformer0 = new ConstantTransformer<Object, LinkedList<String>>(linkedList0);
      IndexedCollection<LinkedList<String>, Object> indexedCollection0 = IndexedCollection.nonUniqueIndexedCollection(collection0, (Transformer<Object, LinkedList<String>>) constantTransformer0);
      Collection<Object> collection1 = indexedCollection0.values(linkedList0);
      assertNull(collection1);
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.removeFromIndex(Ljava/lang/Object;)V: root-Branch
   * 2 org.apache.commons.collections4.collection.IndexedCollection.add(Ljava/lang/Object;)Z: I9 Branch 1 IFEQ L119 - false
   * 3 org.apache.commons.collections4.collection.IndexedCollection.remove(Ljava/lang/Object;)Z: I9 Branch 7 IFEQ L208 - false
   * 4 org.apache.commons.collections4.collection.IndexedCollection.removeAll(Ljava/util/Collection;)Z: I12 Branch 8 IFEQ L217 - false
   * 5 org.apache.commons.collections4.collection.IndexedCollection.addToIndex(Ljava/lang/Object;)V: I11 Branch 10 IFEQ L243 - true
   * 6 org.apache.commons.collections4.collection.IndexedCollection.uniqueIndexedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/IndexedCollection;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(966,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test1");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList0.addAll((Collection<?>) linkedList1);
      Transformer<Object, String> transformer0 = StringValueTransformer.INSTANCE;
      IndexedCollection<String, Object> indexedCollection0 = IndexedCollection.uniqueIndexedCollection((Collection<Object>) linkedList0, transformer0);
      assertNotNull(indexedCollection0);
      
      ConstantTransformer<Object, LinkedList<Integer>> constantTransformer0 = new ConstantTransformer<Object, LinkedList<Integer>>(linkedList1);
      MultiValueMap<LinkedList<Integer>, Object> multiValueMap0 = new MultiValueMap<LinkedList<Integer>, Object>();
      IndexedCollection<LinkedList<Integer>, Object> indexedCollection1 = new IndexedCollection<LinkedList<Integer>, Object>((Collection<Object>) linkedList0, (Transformer<Object, LinkedList<Integer>>) constantTransformer0, (MultiMap<LinkedList<Integer>, Object>) multiValueMap0, false);
      indexedCollection1.add((Object) multiValueMap0);
      // Undeclared exception!
      try {
        indexedCollection0.removeAll((Collection<?>) linkedList0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.contains(Ljava/lang/Object;)Z: root-Branch
   * 2 org.apache.commons.collections4.collection.IndexedCollection.containsAll(Ljava/util/Collection;)Z: I8 Branch 3 IFEQ L158 - false
   * 3 org.apache.commons.collections4.collection.IndexedCollection.containsAll(Ljava/util/Collection;)Z: I17 Branch 4 IFNE L159 - false
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(970,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test2");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.add((Object) "E$owUEF.Y7");
      MultiValueMap<Integer, Integer> multiValueMap0 = new MultiValueMap<Integer, Integer>();
      multiValueMap0.toString();
      ConstantTransformer<String, Object> constantTransformer0 = new ConstantTransformer<String, Object>((Object) "{}");
      IndexedCollection<Object, String> indexedCollection0 = IndexedCollection.uniqueIndexedCollection((Collection<String>) linkedList1, (Transformer<String, Object>) constantTransformer0);
      assertNotNull(indexedCollection0);
      
      boolean boolean0 = indexedCollection0.containsAll((Collection<?>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.clear()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(971,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test3");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("E$owUEF.Y7");
      MultiValueMap<String, Object> multiValueMap0 = new MultiValueMap<String, Object>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.removeLastOccurrence((Object) linkedList1);
      IndexedCollection<String, Object> indexedCollection0 = new IndexedCollection<String, Object>((Collection<Object>) linkedList0, (Transformer<Object, String>) constantTransformer0, (MultiMap<String, Object>) multiValueMap0, false);
      indexedCollection0.clear();
      assertEquals(0, indexedCollection0.size());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.addAll(Ljava/util/Collection;)Z: I12 Branch 2 IFEQ L128 - true
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(972,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test4");
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      ConstantTransformer<LinkedList<Object>, String> constantTransformer0 = new ConstantTransformer<LinkedList<Object>, String>("");
      IndexedCollection<String, LinkedList<Object>> indexedCollection0 = IndexedCollection.nonUniqueIndexedCollection((Collection<LinkedList<Object>>) linkedList0, (Transformer<LinkedList<Object>, String>) constantTransformer0);
      assertNotNull(indexedCollection0);
      
      boolean boolean0 = indexedCollection0.addAll((Collection<? extends LinkedList<Object>>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.addAll(Ljava/util/Collection;)Z: I12 Branch 2 IFEQ L128 - false
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(973,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test5");
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      ConstantTransformer<LinkedList<Object>, String> constantTransformer0 = new ConstantTransformer<LinkedList<Object>, String>("");
      IndexedCollection<String, LinkedList<Object>> indexedCollection0 = IndexedCollection.nonUniqueIndexedCollection((Collection<LinkedList<Object>>) linkedList0, (Transformer<LinkedList<Object>, String>) constantTransformer0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      indexedCollection0.add(linkedList1);
      // Undeclared exception!
      try {
        indexedCollection0.addAll((Collection<? extends LinkedList<Object>>) linkedList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.containsAll(Ljava/util/Collection;)Z: I17 Branch 4 IFNE L159 - true
   * 2 org.apache.commons.collections4.collection.IndexedCollection.reindex()V: I14 Branch 6 IFEQ L199 - false
   * 3 org.apache.commons.collections4.collection.IndexedCollection.containsAll(Ljava/util/Collection;)Z: I8 Branch 3 IFEQ L158 - true
   * 4 org.apache.commons.collections4.collection.IndexedCollection.containsAll(Ljava/util/Collection;)Z: I8 Branch 3 IFEQ L158 - false
   * 5 org.apache.commons.collections4.collection.IndexedCollection.addToIndex(Ljava/lang/Object;)V: I11 Branch 10 IFEQ L243 - true
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(974,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test6");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("E$owUEF.Y7");
      MultiValueMap<String, Object> multiValueMap0 = new MultiValueMap<String, Object>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.removeLastOccurrence((Object) linkedList1);
      linkedList0.add((Object) "E$owUEF.Y7");
      IndexedCollection<String, Object> indexedCollection0 = new IndexedCollection<String, Object>((Collection<Object>) linkedList0, (Transformer<Object, String>) constantTransformer0, (MultiMap<String, Object>) multiValueMap0, false);
      boolean boolean0 = indexedCollection0.containsAll((Collection<?>) indexedCollection0);
      assertEquals(1, multiValueMap0.totalSize());
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.get(Ljava/lang/Object;)Ljava/lang/Object;: I11 Branch 5 IFNONNULL L180 - false
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(975,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test7");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("E$owUEF.Y7");
      MultiValueMap<String, Object> multiValueMap0 = new MultiValueMap<String, Object>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.removeLastOccurrence((Object) linkedList1);
      IndexedCollection<String, Object> indexedCollection0 = new IndexedCollection<String, Object>((Collection<Object>) linkedList0, (Transformer<Object, String>) constantTransformer0, (MultiMap<String, Object>) multiValueMap0, false);
      MultiValueMap<Integer, Integer> multiValueMap1 = new MultiValueMap<Integer, Integer>();
      multiValueMap1.toString();
      Object object0 = indexedCollection0.get("{}");
      assertNull(object0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.remove(Ljava/lang/Object;)Z: I9 Branch 7 IFEQ L208 - true
   * 2 org.apache.commons.collections4.collection.IndexedCollection.uniqueIndexedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/IndexedCollection;: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(976,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test8");
      LinkedList<LinkedList<Integer>> linkedList0 = new LinkedList<LinkedList<Integer>>();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 3);
      InvokerTransformer<LinkedList<Integer>, String> invokerTransformer0 = new InvokerTransformer<LinkedList<Integer>, String>("GGIU}v``Jm;p}\"/0", (Class<?>[]) classArray0, (Object[]) classArray0);
      IndexedCollection<String, LinkedList<Integer>> indexedCollection0 = IndexedCollection.uniqueIndexedCollection((Collection<LinkedList<Integer>>) linkedList0, (Transformer<LinkedList<Integer>, String>) invokerTransformer0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.toString();
      boolean boolean0 = indexedCollection0.remove((Object) "[]");
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.removeAll(Ljava/util/Collection;)Z: I12 Branch 8 IFEQ L217 - true
   */

  @Test
  public void test9()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(977,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test9");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.isEmpty();
      LinkedList<LinkedList<Integer>> linkedList0 = new LinkedList<LinkedList<Integer>>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      MultiValueMap<LinkedList<Integer>, Object> multiValueMap0 = new MultiValueMap<LinkedList<Integer>, Object>();
      IndexedCollection<LinkedList<Integer>, Object> indexedCollection0 = new IndexedCollection<LinkedList<Integer>, Object>((Collection<Object>) linkedList1, (Transformer<Object, LinkedList<Integer>>) null, (MultiMap<LinkedList<Integer>, Object>) multiValueMap0, true);
      boolean boolean0 = indexedCollection0.removeAll((Collection<?>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.retainAll(Ljava/util/Collection;)Z: I9 Branch 9 IFEQ L226 - true
   * 2 org.apache.commons.collections4.collection.IndexedCollection.nonUniqueIndexedCollection(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/collection/IndexedCollection;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(967,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test10");
      MultiValueMap<String, String> multiValueMap0 = new MultiValueMap<String, String>();
      Collection<Object> collection0 = multiValueMap0.values();
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>((Integer) null);
      IndexedCollection<Integer, Object> indexedCollection0 = IndexedCollection.nonUniqueIndexedCollection(collection0, (Transformer<Object, Integer>) constantTransformer0);
      boolean boolean0 = indexedCollection0.retainAll(collection0);
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.retainAll(Ljava/util/Collection;)Z: I9 Branch 9 IFEQ L226 - false
   * 2 org.apache.commons.collections4.collection.IndexedCollection.contains(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(968,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test11");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ConstantTransformer<String, String> constantTransformer0 = new ConstantTransformer<String, String>("Duplicate key in uniquely indexed collection.");
      MultiValueMap<String, String> multiValueMap0 = new MultiValueMap<String, String>();
      IndexedCollection<String, String> indexedCollection0 = new IndexedCollection<String, String>((Collection<String>) linkedList0, (Transformer<String, String>) constantTransformer0, (MultiMap<String, String>) multiValueMap0, false);
      linkedList0.add("Duplicate key in uniquely indexed collection.");
      boolean boolean0 = indexedCollection0.retainAll((Collection<?>) indexedCollection0);
      assertEquals(true, linkedList0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 7 covered goals:
   * 1 org.apache.commons.collections4.collection.IndexedCollection.addToIndex(Ljava/lang/Object;)V: I16 Branch 11 IFEQ L243 - false
   * 2 org.apache.commons.collections4.collection.IndexedCollection.<init>(Ljava/util/Collection;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/MultiMap;Z)V: root-Branch
   * 3 org.apache.commons.collections4.collection.IndexedCollection.reindex()V: I14 Branch 6 IFEQ L199 - true
   * 4 org.apache.commons.collections4.collection.IndexedCollection.reindex()V: I14 Branch 6 IFEQ L199 - false
   * 5 org.apache.commons.collections4.collection.IndexedCollection.addToIndex(Ljava/lang/Object;)V: I11 Branch 10 IFEQ L243 - false
   * 6 org.apache.commons.collections4.collection.IndexedCollection.addToIndex(Ljava/lang/Object;)V: I16 Branch 11 IFEQ L243 - true
   * 7 org.apache.commons.collections4.collection.IndexedCollection.add(Ljava/lang/Object;)Z: I9 Branch 1 IFEQ L119 - false
   */

  @Test
  public void test12()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(969,"org.apache.commons.collections4.collection.IndexedCollectionEvoSuiteTest.test12");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("E$owUEF.Y7");
      MultiValueMap<String, Object> multiValueMap0 = new MultiValueMap<String, Object>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.add((Object) "E$owUEF.Y7");
      IndexedCollection<String, Object> indexedCollection0 = new IndexedCollection<String, Object>((Collection<Object>) linkedList0, (Transformer<Object, String>) constantTransformer0, (MultiMap<String, Object>) multiValueMap0, true);
      linkedList1.toString();
      // Undeclared exception!
      try {
        indexedCollection0.add((Object) "[]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Duplicate key in uniquely indexed collection.
         //
      }
  }
}
