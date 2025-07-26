package test;

import static org.junit.Assert.*;

import org.junit.Test;

import task.SortService;

public class TestCheckPresence {
	
   @Test
   public void testValuePresence() {
	   
	   SortService s = new SortService();
	   int[]arr = s.sortValues(new int[] {1,2,3,4,5});
	   
	   assertTrue(s.isValuePresent(arr, 3));
	   assertFalse(s.isValuePresent(arr, 8));
	   
   }
}
