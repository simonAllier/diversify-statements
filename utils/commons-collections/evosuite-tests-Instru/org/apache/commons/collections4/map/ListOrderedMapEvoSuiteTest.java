/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.map.ListOrderedMap;
import org.junit.BeforeClass;

public class ListOrderedMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 18 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapEntry.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;Ljava/lang/Object;)V: root-Branch
   * 2 org.apache.commons.collections4.map.ListOrderedMap$KeySetView.iterator()Ljava/util/Iterator;: root-Branch
   * 3 org.apache.commons.collections4.map.ListOrderedMap$KeySetView.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;)V: root-Branch
   * 4 org.apache.commons.collections4.map.ListOrderedMap$KeySetView.size()I: root-Branch
   * 5 org.apache.commons.collections4.map.ListOrderedMap$EntrySetView.iterator()Ljava/util/Iterator;: root-Branch
   * 6 org.apache.commons.collections4.map.ListOrderedMap$EntrySetView.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;Ljava/util/List;)V: root-Branch
   * 7 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedIterator.next()Ljava/util/Map$Entry;: root-Branch
   * 8 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedIterator.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;Ljava/util/List;)V: root-Branch
   * 9 org.apache.commons.collections4.map.ListOrderedMap$KeySetView$1.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap$KeySetView;Ljava/util/Iterator;)V: root-Branch
   * 10 org.apache.commons.collections4.map.ListOrderedMap$KeySetView$1.next()Ljava/lang/Object;: root-Branch
   * 11 org.apache.commons.collections4.map.ListOrderedMap.<init>()V: root-Branch
   * 12 org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(Ljava/util/Map;)Lorg/apache/commons/collections4/map/ListOrderedMap;: root-Branch
   * 13 org.apache.commons.collections4.map.ListOrderedMap.entrySet()Ljava/util/Set;: root-Branch
   * 14 org.apache.commons.collections4.map.ListOrderedMap.keySet()Ljava/util/Set;: root-Branch
   * 15 org.apache.commons.collections4.map.ListOrderedMap.<init>(Ljava/util/Map;)V: root-Branch
   * 16 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I3 Branch 27 IFLT L448 - false
   * 17 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I8 Branch 28 IF_ICMPLE L448 - true
   * 18 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I39 Branch 29 IFLE L453 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(145,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test0");
      ListOrderedMap<AbstractMap.SimpleEntry<Integer, Integer>, Object> listOrderedMap0 = new ListOrderedMap<AbstractMap.SimpleEntry<Integer, Integer>, Object>();
      HashMap<AbstractMap.SimpleImmutableEntry<String, Object>, String> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      hashMap0.toString();
      listOrderedMap0.put(0, (AbstractMap.SimpleEntry<Integer, Integer>) null, (Object) "{}");
      assertEquals(false, listOrderedMap0.isEmpty());
      
      ListOrderedMap<AbstractMap.SimpleEntry<Integer, Integer>, Object> listOrderedMap1 = ListOrderedMap.listOrderedMap((Map<AbstractMap.SimpleEntry<Integer, Integer>, Object>) listOrderedMap0);
      assertEquals("{null={}}", listOrderedMap1.toString());
  }

  //Test case number: 1
  /*
   * 14 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapEntry.getValue()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.map.ListOrderedMap.put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I6 Branch 15 IFLE L219 - true
   * 3 org.apache.commons.collections4.map.ListOrderedMap.toString()Ljava/lang/String;: I4 Branch 22 IFEQ L359 - true
   * 4 org.apache.commons.collections4.map.ListOrderedMap.toString()Ljava/lang/String;: I34 Branch 23 IFEQ L365 - true
   * 5 org.apache.commons.collections4.map.ListOrderedMap.toString()Ljava/lang/String;: I34 Branch 23 IFEQ L365 - false
   * 6 org.apache.commons.collections4.map.ListOrderedMap.toString()Ljava/lang/String;: I52 Branch 24 IFEQ L368 - false
   * 7 org.apache.commons.collections4.map.ListOrderedMap.toString()Ljava/lang/String;: I69 Branch 25 IF_ACMPNE L373 - true
   * 8 org.apache.commons.collections4.map.ListOrderedMap.toString()Ljava/lang/String;: I88 Branch 26 IF_ACMPNE L375 - true
   * 9 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapEntry.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;Ljava/lang/Object;)V: root-Branch
   * 10 org.apache.commons.collections4.map.ListOrderedMap$EntrySetView.iterator()Ljava/util/Iterator;: root-Branch
   * 11 org.apache.commons.collections4.map.ListOrderedMap$EntrySetView.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;Ljava/util/List;)V: root-Branch
   * 12 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedIterator.next()Ljava/util/Map$Entry;: root-Branch
   * 13 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedIterator.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;Ljava/util/List;)V: root-Branch
   * 14 org.apache.commons.collections4.map.ListOrderedMap.entrySet()Ljava/util/Set;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(146,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test1");
      ListOrderedMap<HashMap<String, String>, String> listOrderedMap0 = new ListOrderedMap<HashMap<String, String>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      listOrderedMap0.put(hashMap0, "mtq7!!l' 5I\"d9y");
      String string0 = listOrderedMap0.toString();
      assertEquals(false, listOrderedMap0.isEmpty());
      assertEquals("{{}=mtq7!!l' 5I\"d9y}", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap$ValuesView.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;)V: root-Branch
   * 2 org.apache.commons.collections4.map.ListOrderedMap.values()Ljava/util/Collection;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(157,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test2");
      ListOrderedMap<Integer, Object> listOrderedMap0 = new ListOrderedMap<Integer, Object>();
      Collection<Object> collection0 = listOrderedMap0.values();
      assertEquals(true, collection0.isEmpty());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.keyList()Ljava/util/List;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(158,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test3");
      ListOrderedMap<Integer, HashMap<Object, String>> listOrderedMap0 = new ListOrderedMap<Integer, HashMap<Object, String>>();
      List<Integer> list0 = listOrderedMap0.keyList();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.mapIterator()Lorg/apache/commons/collections4/OrderedMapIterator;: root-Branch
   * 2 org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(159,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test4");
      ListOrderedMap<Integer, Integer> listOrderedMap0 = new ListOrderedMap<Integer, Integer>();
      OrderedMapIterator<Integer, Integer> orderedMapIterator0 = listOrderedMap0.mapIterator();
      assertEquals(false, orderedMapIterator0.hasNext());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.valueList()Ljava/util/List;: root-Branch
   * 2 org.apache.commons.collections4.map.ListOrderedMap$ValuesView.<init>(Lorg/apache/commons/collections4/map/ListOrderedMap;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(160,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test5");
      ListOrderedMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>> listOrderedMap0 = new ListOrderedMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>>();
      List<AbstractMap.SimpleImmutableEntry<Integer, Integer>> list0 = listOrderedMap0.valueList();
      assertEquals(0, list0.size());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.clear()V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(161,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test6");
      ListOrderedMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, HashMap<String, Integer>> listOrderedMap0 = new ListOrderedMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, HashMap<String, Integer>>();
      listOrderedMap0.clear();
      assertEquals("{}", listOrderedMap0.toString());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.setValue(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.map.ListOrderedMap.indexOf(Ljava/lang/Object;)I: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(162,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test7");
      ListOrderedMap<Integer, Object> listOrderedMap0 = new ListOrderedMap<Integer, Object>();
      int int0 = listOrderedMap0.indexOf((Object) ", ");
      assertEquals((-1), int0);
      
      ListOrderedMap<HashMap<Integer, String>, HashMap<Object, Integer>> listOrderedMap1 = new ListOrderedMap<HashMap<Integer, String>, HashMap<Object, Integer>>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      // Undeclared exception!
      try {
        listOrderedMap1.setValue((-1), hashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.firstKey()Ljava/lang/Object;: I4 Branch 10 IFNE L167 - false
   */

  @Test
  public void test8()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(163,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test8");
      ListOrderedMap<String, Integer> listOrderedMap0 = new ListOrderedMap<String, Integer>();
      // Undeclared exception!
      try {
        listOrderedMap0.firstKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // Map is empty
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.lastKey()Ljava/lang/Object;: I4 Branch 11 IFNE L180 - false
   */

  @Test
  public void test9()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(164,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test9");
      ListOrderedMap<Object, AbstractMap.SimpleImmutableEntry<String, Object>> listOrderedMap0 = new ListOrderedMap<Object, AbstractMap.SimpleImmutableEntry<String, Object>>();
      // Undeclared exception!
      try {
        listOrderedMap0.lastKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // Map is empty
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.nextKey(Ljava/lang/Object;)Ljava/lang/Object;: I10 Branch 12 IFLT L195 - true
   */

  @Test
  public void test10()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(147,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test10");
      ListOrderedMap<Integer, Integer> listOrderedMap0 = new ListOrderedMap<Integer, Integer>();
      listOrderedMap0.nextKey((Object) listOrderedMap0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.previousKey(Ljava/lang/Object;)Ljava/lang/Object;: I10 Branch 14 IFLE L210 - true
   * 2 org.apache.commons.collections4.map.ListOrderedMap.toString()Ljava/lang/String;: I4 Branch 22 IFEQ L359 - false
   */

  @Test
  public void test11()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(148,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test11");
      ListOrderedMap<Integer, Integer> listOrderedMap0 = new ListOrderedMap<Integer, Integer>();
      ListOrderedMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>> listOrderedMap1 = new ListOrderedMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>>();
      String string0 = listOrderedMap1.toString();
      assertEquals("{}", string0);
      
      listOrderedMap0.previousKey((Object) "{}");
      assertEquals("{}", listOrderedMap0.toString());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I6 Branch 15 IFLE L219 - false
   * 2 org.apache.commons.collections4.map.ListOrderedMap.put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I6 Branch 15 IFLE L219 - true
   */

  @Test
  public void test12()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(149,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test12");
      ListOrderedMap<HashMap<String, String>, String> listOrderedMap0 = new ListOrderedMap<HashMap<String, String>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      listOrderedMap0.put(hashMap0, "mtq7!!l' 5I\"d9y");
      listOrderedMap0.put(hashMap0, (String) null);
      assertEquals(false, listOrderedMap0.isEmpty());
      assertEquals("{{}=null}", listOrderedMap0.toString());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.putAll(Ljava/util/Map;)V: I9 Branch 16 IFEQ L232 - true
   */

  @Test
  public void test13()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(150,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test13");
      HashMap<HashMap<Integer, Object>, Object> hashMap0 = new HashMap<HashMap<Integer, Object>, Object>();
      ListOrderedMap<HashMap<Integer, Object>, Object> listOrderedMap0 = ListOrderedMap.listOrderedMap((Map<HashMap<Integer, Object>, Object>) hashMap0);
      listOrderedMap0.putAll((Map<? extends HashMap<Integer, Object>, ?>) hashMap0);
      assertEquals("{}", hashMap0.toString());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.putAll(ILjava/util/Map;)V: I3 Branch 17 IFLT L246 - true
   */

  @Test
  public void test14()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(151,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test14");
      ListOrderedMap<Integer, Integer> listOrderedMap0 = new ListOrderedMap<Integer, Integer>();
      // Undeclared exception!
      try {
        listOrderedMap0.putAll((-1886), (Map<? extends Integer, ? extends Integer>) listOrderedMap0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1886, Size: 0
         //
      }
  }

  //Test case number: 15
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.putAll(ILjava/util/Map;)V: I3 Branch 17 IFLT L246 - false
   * 2 org.apache.commons.collections4.map.ListOrderedMap.putAll(ILjava/util/Map;)V: I8 Branch 18 IF_ICMPLE L246 - true
   * 3 org.apache.commons.collections4.map.ListOrderedMap.putAll(ILjava/util/Map;)V: I38 Branch 19 IFEQ L249 - true
   * 4 org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(Ljava/util/Map;)Lorg/apache/commons/collections4/map/ListOrderedMap;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(152,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test15");
      HashMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> hashMap0 = new HashMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      ListOrderedMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> listOrderedMap0 = ListOrderedMap.listOrderedMap((Map<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>) hashMap0);
      listOrderedMap0.putAll(0, (Map<? extends Integer, ? extends AbstractMap.SimpleImmutableEntry<String, Integer>>) hashMap0);
      assertEquals(0, listOrderedMap0.size());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.remove(Ljava/lang/Object;)Ljava/lang/Object;: I10 Branch 21 IFLE L268 - true
   */

  @Test
  public void test16()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(153,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test16");
      ListOrderedMap<Object, Integer> listOrderedMap0 = new ListOrderedMap<Object, Integer>();
      listOrderedMap0.remove((Object) "w2@+`x:{e)bn`RacKM");
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.remove(Ljava/lang/Object;)Ljava/lang/Object;: I10 Branch 21 IFLE L268 - false
   * 2 org.apache.commons.collections4.map.ListOrderedMap.remove(I)Ljava/lang/Object;: root-Branch
   * 3 org.apache.commons.collections4.map.ListOrderedMap.get(I)Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(154,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test17");
      ListOrderedMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>> listOrderedMap0 = new ListOrderedMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>>();
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>((Integer) 0, (Integer) 0);
      listOrderedMap0.put(0, (Integer) 0, abstractMap_SimpleEntry0);
      assertEquals(false, listOrderedMap0.isEmpty());
      
      listOrderedMap0.remove(0);
      assertEquals(0, listOrderedMap0.size());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I3 Branch 27 IFLT L448 - true
   */

  @Test
  public void test18()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(155,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test18");
      ListOrderedMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String> listOrderedMap0 = new ListOrderedMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String>();
      HashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      hashMap0.toString();
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) 1, (Integer) 1);
      // Undeclared exception!
      try {
        listOrderedMap0.put((-189), abstractMap_SimpleImmutableEntry0, "{}");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -189, Size: 0
         //
      }
  }

  //Test case number: 19
  /*
   * 7 covered goals:
   * 1 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I39 Branch 29 IFLE L453 - false
   * 2 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I64 Branch 30 IF_ICMPGE L457 - true
   * 3 org.apache.commons.collections4.map.ListOrderedMap.<init>()V: root-Branch
   * 4 org.apache.commons.collections4.map.ListOrderedMap.<init>(Ljava/util/Map;)V: root-Branch
   * 5 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I3 Branch 27 IFLT L448 - false
   * 6 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I8 Branch 28 IF_ICMPLE L448 - true
   * 7 org.apache.commons.collections4.map.ListOrderedMap.put(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I39 Branch 29 IFLE L453 - true
   */

  @Test
  public void test19()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(156,"org.apache.commons.collections4.map.ListOrderedMapEvoSuiteTest.test19");
      ListOrderedMap<Integer, Integer> listOrderedMap0 = new ListOrderedMap<Integer, Integer>();
      listOrderedMap0.put(0, (Integer) 0, (Integer) 0);
      listOrderedMap0.put(0, (Integer) 0, (Integer) 0);
      assertEquals("{0=0}", listOrderedMap0.toString());
      assertEquals(false, listOrderedMap0.isEmpty());
  }
}
