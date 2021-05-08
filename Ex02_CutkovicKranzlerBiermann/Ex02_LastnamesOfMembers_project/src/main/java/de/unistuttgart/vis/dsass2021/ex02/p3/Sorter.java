package de.unistuttgart.vis.dsass2021.ex02.p3;


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

		/*

		int n = list.size()-1;
		for (int i =0; i<n; i++) {

			T m = list.get(i);

			boolean leftOfMGreater = true;
			while (i>0 && leftOfMGreater) {
				if (firstIsGreaterThanSecond(list.get(i-1),m)) {
					list.swap(i-1, i);
				i--;
				} else {
					leftOfMGreater = false;
				}
			}
		}
		*/


		for (int i = 1; i < list.size(); i++) {


			int j = i;

			while (j > 0) {
				if (list.get(j - 1).compareTo(list.get(j))<0) {
					list.swap(j-1, j);
					j-=1;

				}
				else {
					j-=1;

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

	//Compares two Java Generics and returns only true, if the first argument is "bigger", than the second argument
	private static<T extends Comparable<T>> boolean firstIsGreaterThanSecond(T t1, T t2) {
		return t1.compareTo(t2)<0;
	}
}
