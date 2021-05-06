package de.unistuttgart.vis.dsass2021.ex02.p3;

public class Sorter {
		
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {

	}
	
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {

	}
	
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		final int n = list.getSize() -2;
		for (int i=0; i< n) {
			if (list.get(i) >list.get(i+1)) {
				list.swap
			}
		}
	}

}
