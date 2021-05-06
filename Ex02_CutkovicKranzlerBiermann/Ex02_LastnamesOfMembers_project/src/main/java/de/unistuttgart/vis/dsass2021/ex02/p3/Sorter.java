package de.unistuttgart.vis.dsass2021.ex02.p3;

public class Sorter {
		
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {

	}
	
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
		int n = list.size()-1;
		for (int i; i<n; i++) {
			T m = list.get(i);
			int indexOfM=i;
			leftOfMGreater = true;
			while (j<0 && leftOfMGreater) {
				if (firstIsGreaterThanSecond(list.get(j-1),m)) {
					list.swap(j-1, j);
					j--;
				} else {
					leftOfMGreater = false;
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		int n = list.size() -2;
		while (n>1) {
			for (int i = 0; i < n; i++) {
				if (firstIsGreaterThanSecond(list.get(i), list.get(i + 1))) {
					list.swap(i, i + 1);
				}
			}
			n--;
		}
	}

	private satic boolean firstIsGreaterThanSecond(T t1, T t2) {
		t1.compareTo(t2);
	}
}
