package sort;

public class QuickSort {

	private long timeExec;

	private int partition(int[] items, int start, int end) {

		int pivo = items[start];
		int i = start + 1, f = end;

		while (i <= f) {
			if (items[i] <= pivo)
				i++;
			else if (pivo < items[f])
				f--;
			else {
				int change = items[i];
				items[i] = items[f];
				items[f] = change;
				i++;
				f--;
			}
		}

		items[start] = items[f];
		items[f] = pivo;
		return f;

	}

	private void order(int[] items, int start, int end) {

		if (start < end) {
			int posPivo = partition(items, start, end);
			order(items, start, posPivo - 1);
			order(items, posPivo + 1, end);
		}
	}

	public void sort(int[] items) {
		long timeStart = System.nanoTime();
		order(items, 0, items.length - 1);
		long timeEnd = System.nanoTime();
		timeExec = timeEnd - timeStart;

	}

	public long getTimeExec() {
		return timeExec;
	}

}
