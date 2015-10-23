package sort;

public class HeapSort {

	private long timeExec;

	public void sort(int[] v) {
		long timeStart = System.nanoTime();
		buildMaxHeap(v);
		int n = v.length;
		for (int i = v.length - 1; i > 0; i--) {
			swap(v, i, 0);
			maxHeapify(v, 0, --n);

		}
		long timeEnd = System.nanoTime();
		timeExec = timeEnd - timeStart;
	}

	private void buildMaxHeap(int[] v) {
		for (int i = v.length / 2; i >= 0; i--) {
			maxHeapify(v, i, v.length);

		}
	}

	private void maxHeapify(int[] v, int pos, int n) {
		int maxi;
		int l = 2 * pos;
		int right = 2 * pos + 1;
		if ((l < n) && (v[l] > v[pos])) {
			maxi = l;
		} else {
			maxi = pos;
		}

		if (right < n && v[right] > v[maxi]) {
			maxi = right;
		}

		if (maxi != pos) {
			swap(v, pos, maxi);
			maxHeapify(v, maxi, n);
		}

	}

	private void swap(int[] v, int j, int aposJ) {
		int aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;

	}

	public long getTimeExec() {
		return timeExec;
	}

}
