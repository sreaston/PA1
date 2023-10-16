public class Sorting {

	public static void selectionSort(int[] array, int arrayLen) { // complete this method
		for (int i = 0; i < arrayLen - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arrayLen; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

	public static void insertionSort(int[] array, int arrayLen) { // complete this method
		for (int i = 1; i < arrayLen; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
}
