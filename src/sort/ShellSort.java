package sort;

public class ShellSort {

	private long timeExec;

	public void sort(int[] items) {
		long timeStart = System.nanoTime();
		int h = 1;
		int n = items.length;

		do {
			h = h * 3 + 1;
		} while (h < n);

		h /= 3;
		int c, j;
		while (h > 0) {
			for (int i = h; i < n; i++) {
				c = items[i];
				j = i;
				while (j >= h && items[j - h] > c) {
					items[j] = items[j - h];
					j = j - h;
				}
				items[j] = c;
			}
			h /= 2;
		}
		long timeEnd = System.nanoTime();
		timeExec = timeEnd - timeStart;
	}

	public long getTimeExec() {
		return timeExec;
	}

}
