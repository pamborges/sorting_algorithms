import java.text.SimpleDateFormat;
import java.util.Date;

import sort.HeapSort;
import sort.QuickSort;
import sort.ShellSort;


public class Main {

	
	
	public static void main(String[] args) {
		
		int[] numbers = {12,9, -10,22,2,35,40};
		ShellSort shellSort = new ShellSort();
		shellSort.sort(numbers);
		
		System.out.println("Ordenados \n");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Tempo de execução: ");
		System.out.println(new SimpleDateFormat("mm:ss:SSS").format(new Date(shellSort.getTimeExec())));
		
		
		int[] numbersQuickSort = {3,1,4,5,9,2,6,8,7};
		QuickSort quickSort = new QuickSort();
		quickSort.sort(numbersQuickSort);
		
		System.out.println("Ordenados QuickSort\n");
		for (int i = 0; i < numbersQuickSort.length; i++) {
			System.out.println(numbersQuickSort[i]);
		}
		
		System.out.println("Tempo de execução: ");
		System.out.println(new SimpleDateFormat("mm:ss:SSS").format(new Date(quickSort.getTimeExec())));
		
		
		
		int[] numbersHeapSort = {11,10,7,9,5,6,4,8,2,3,1};
		HeapSort heapSort = new HeapSort();
		heapSort.sort(numbersHeapSort);
		
		System.out.println("Ordenados HeapSort\n");
		for (int i = 0; i < numbersHeapSort.length; i++) {
			System.out.println(numbersHeapSort[i]);
		}
		System.out.println("Tempo de execução: ");
		System.out.println(new SimpleDateFormat("mm:ss:SSS").format(new Date(heapSort.getTimeExec())));
	
		
		
	}
}
