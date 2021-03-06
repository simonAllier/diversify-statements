/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.set.UnmodifiableSortedSet;
import org.apache.commons.collections4.trie.UnmodifiableTrie;
import org.junit.BeforeClass;

public class UnmodifiableMapIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(Lorg/apache/commons/collections4/MapIterator;)Lorg/apache/commons/collections4/MapIterator;: I3 Branch 1 IFNONNULL L46 - true
   * 2 org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(Lorg/apache/commons/collections4/MapIterator;)Lorg/apache/commons/collections4/MapIterator;: I15 Branch 2 IFEQ L49 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(673,"org.apache.commons.collections4.iterators.UnmodifiableMapIteratorEvoSuiteTest.test0");
      HashMap<UnmodifiableTrie<String, Integer>, UnmodifiableSortedSet<String>> hashMap0 = new HashMap<UnmodifiableTrie<String, Integer>, UnmodifiableSortedSet<String>>();
      EntrySetMapIterator<UnmodifiableTrie<String, Integer>, UnmodifiableSortedSet<String>> entrySetMapIterator0 = new EntrySetMapIterator<UnmodifiableTrie<String, Integer>, UnmodifiableSortedSet<String>>((Map<UnmodifiableTrie<String, Integer>, UnmodifiableSortedSet<String>>) hashMap0);
      MapIterator<UnmodifiableTrie<String, Integer>, UnmodifiableSortedSet<String>> mapIterator0 = UnmodifiableMapIterator.unmodifiableMapIterator((MapIterator<UnmodifiableTrie<String, Integer>, UnmodifiableSortedSet<String>>) entrySetMapIterator0);
      assertEquals(false, mapIterator0.hasNext());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(Lorg/apache/commons/collections4/MapIterator;)Lorg/apache/commons/collections4/MapIterator;: I3 Branch 1 IFNONNULL L46 - false
   */

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(674,"org.apache.commons.collections4.iterators.UnmodifiableMapIteratorEvoSuiteTest.test1");
      try {
        UnmodifiableMapIterator.unmodifiableMapIterator((MapIterator<UnmodifiableListIterator<String>, Integer>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MapIterator must not be null
         //
      }
  }
}
