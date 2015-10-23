package sort;

import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
	
	
	@Test
	public void sortTest(){
		int[] number = {4,5,67,8,90,2,3,4,9};
		int[] numberSorting = Arrays.copyOf(number, number.length);
		QuickSort quickSort = new QuickSort();
		quickSort.sort(number);
		Arrays.sort(numberSorting);
		assertArrayEquals(number,numberSorting);
	}

}
