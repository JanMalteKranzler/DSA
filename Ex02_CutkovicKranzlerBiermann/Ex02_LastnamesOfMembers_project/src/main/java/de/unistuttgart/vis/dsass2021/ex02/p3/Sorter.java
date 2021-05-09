package de.unistuttgart.vis.dsass2021.ex02.p3;
/**
 *@author Vitus Biermann, Darko Cutkovic, Jan Kranzler
 */

public class Sorter {

	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {

		int indexOfLargestElement = 0;
		int n = 0;
		while(indexOfLargestElement<=list.size()-1) {
			for (int i = indexOfLargestElement + 1; i <= list.size()-1; i++) {
				if(list.get(i).compareTo(list.get(n))>0) {
					n = i;
				}
			}
			list.swap(indexOfLargestElement, n);

			indexOfLargestElement++;
			n = indexOfLargestElement;
		}
	}


	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {

		for (int i = 1; i < list.size(); i++) {
			T valueOfI = list.get(i);
			int j = i;
			while (j > 0) {
				if (list.get(j - 1).compareTo(valueOfI)<0) {
					list.swap(j-1, j);
					j-=1;
				}
				else {
					j = 0;
				}
			}
		}
	}

	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {

		int listSize = list.size();
		for(int i = 1; i<listSize; i++) {
			for (int j = 0; j<(listSize-i); j++) {
				if(list.get(j).compareTo(list.get(j+1))<0) {
					list.swap(j, j+1);
				}
			}
		}
	}


}
