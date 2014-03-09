package sorting2014;

public class ShellSort implements Sorter {

	@Override
	public void sort(Comparable[] items, int cutoff) {
		shellSort(items);

	}

	private void shellSort(Comparable[] items) {

		int gap;
		for (gap = items.length / 2; gap > 0; gap = gap == 2 ? 1
				: (int) (gap / 2.2)) {

			for (int i = gap; i < items.length; i++) {
				Comparable temp = items[i];

				int o;
				for (o = i; o >= gap; o -= gap) {

					if (temp.compareTo(items[o - gap]) >= 0) {
						break;
					}
					items[o] = items[o - gap];
				}

				items[o] = temp;

			}
		}
	}

}
