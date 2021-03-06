/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.map.TransformedMap;
import org.junit.BeforeClass;

public class TransformedMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.map.TransformedMap.putAll(Ljava/util/Map;)V: root-Branch
   * 2 org.apache.commons.collections4.map.TransformedMap.transformingMap(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/map/TransformedMap;: root-Branch
   * 3 org.apache.commons.collections4.map.TransformedMap.<init>(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 4 org.apache.commons.collections4.map.TransformedMap.transformMap(Ljava/util/Map;)Ljava/util/Map;: I4 Branch 4 IFLE L198 - false
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(258,"org.apache.commons.collections4.map.TransformedMapEvoSuiteTest.test0");
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      InvokerTransformer<Integer, Integer> invokerTransformer0 = new InvokerTransformer<Integer, Integer>("Closure must not be null", (Class<?>[]) classArray0, (Object[]) classArray0);
      ConstantTransformer<String, String> constantTransformer0 = new ConstantTransformer<String, String>("Closure must not be null");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      TransformedMap<String, Integer> transformedMap0 = TransformedMap.transformingMap((Map<String, Integer>) hashMap0, (Transformer<? super String, ? extends String>) constantTransformer0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      transformedMap0.putAll((Map<? extends String, ? extends Integer>) hashMap0);
      assertEquals("{}", hashMap0.toString());
  }

  //Test case number: 1
  /*
   * 10 covered goals:
   * 1 org.apache.commons.collections4.map.TransformedMap.transformValue(Ljava/lang/Object;)Ljava/lang/Object;: I4 Branch 3 IFNONNULL L182 - false
   * 2 org.apache.commons.collections4.map.TransformedMap.put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 3 org.apache.commons.collections4.map.TransformedMap.transformValue(Ljava/lang/Object;)Ljava/lang/Object;: I4 Branch 3 IFNONNULL L182 - true
   * 4 org.apache.commons.collections4.map.TransformedMap.transformKey(Ljava/lang/Object;)Ljava/lang/Object;: I4 Branch 2 IFNONNULL L167 - true
   * 5 org.apache.commons.collections4.map.TransformedMap.transformKey(Ljava/lang/Object;)Ljava/lang/Object;: I4 Branch 2 IFNONNULL L167 - false
   * 6 org.apache.commons.collections4.map.TransformedMap.transformMap(Ljava/util/Map;)Ljava/util/Map;: I4 Branch 4 IFLE L198 - true
   * 7 org.apache.commons.collections4.map.TransformedMap.transformMap(Ljava/util/Map;)Ljava/util/Map;: I26 Branch 5 IFEQ L203 - true
   * 8 org.apache.commons.collections4.map.TransformedMap.transformMap(Ljava/util/Map;)Ljava/util/Map;: I26 Branch 5 IFEQ L203 - false
   * 9 org.apache.commons.collections4.map.TransformedMap.transformedMap(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/map/TransformedMap;: I13 Branch 1 IFLE L103 - false
   * 10 org.apache.commons.collections4.map.TransformedMap.transformedMap(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/map/TransformedMap;: I13 Branch 1 IFLE L103 - true
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(259,"org.apache.commons.collections4.map.TransformedMapEvoSuiteTest.test1");
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      InvokerTransformer<Integer, Integer> invokerTransformer0 = new InvokerTransformer<Integer, Integer>("Closure must not be null", (Class<?>[]) classArray0, (Object[]) classArray0);
      ConstantTransformer<String, String> constantTransformer0 = new ConstantTransformer<String, String>("Closure must not be null");
      TransformedMap<Integer, String> transformedMap0 = TransformedMap.transformedMap((Map<Integer, String>) hashMap0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0, (Transformer<? super String, ? extends String>) constantTransformer0);
      transformedMap0.put((Integer) null, "Closure must not be null");
      assertEquals("{null=Closure must not be null}", transformedMap0.toString());
      
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      hashMap1.put((Object) "Closure must not be null", (String) null);
      TransformedMap.transformedMap((Map<Object, String>) hashMap1, (Transformer<? super Object, ?>) null, (Transformer<? super String, ? extends String>) null);
      assertEquals(1, hashMap1.size());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.TransformedMap.isSetValueChecking()Z: I4 Branch 6 IFNULL L229 - true
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(260,"org.apache.commons.collections4.map.TransformedMapEvoSuiteTest.test2");
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      InvokerTransformer<Integer, Integer> invokerTransformer0 = new InvokerTransformer<Integer, Integer>("Closure must not be null", (Class<?>[]) classArray0, (Object[]) classArray0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TransformedMap<Integer, Object> transformedMap0 = TransformedMap.transformedMap((Map<Integer, Object>) hashMap0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0, (Transformer<? super Object, ?>) null);
      MapIterator<Integer, Object> mapIterator0 = transformedMap0.mapIterator();
      assertEquals(false, mapIterator0.hasNext());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.map.TransformedMap.isSetValueChecking()Z: I4 Branch 6 IFNULL L229 - false
   * 2 org.apache.commons.collections4.map.TransformedMap.<init>(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 3 org.apache.commons.collections4.map.TransformedMap.transformedMap(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/map/TransformedMap;: I13 Branch 1 IFLE L103 - true
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(261,"org.apache.commons.collections4.map.TransformedMapEvoSuiteTest.test3");
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      InvokerTransformer<Integer, Integer> invokerTransformer0 = new InvokerTransformer<Integer, Integer>("Closure must not be null", (Class<?>[]) classArray0, (Object[]) classArray0);
      ConstantTransformer<String, String> constantTransformer0 = new ConstantTransformer<String, String>("Closure must not be null");
      TransformedMap<Integer, String> transformedMap0 = TransformedMap.transformedMap((Map<Integer, String>) hashMap0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0, (Transformer<? super String, ? extends String>) constantTransformer0);
      MapIterator<Integer, String> mapIterator0 = transformedMap0.mapIterator();
      assertEquals(false, mapIterator0.hasNext());
  }
}
