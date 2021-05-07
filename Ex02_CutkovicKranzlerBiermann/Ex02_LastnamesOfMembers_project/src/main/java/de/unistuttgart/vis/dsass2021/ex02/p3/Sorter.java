package de.unistuttgart.vis.dsass2021.ex02.p3;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
		
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
		int p = list.size()-1;
		while (p>0) {
			//suche das größte Element aus dem Bereich von 0 bis p
			T m = list.get(0);
			int indexOfLargestElement = 0;
			for (int i=1; i<=p; i++) {
				if (firstIsGreaterThanSecond(list.get(i), m)) {
					m = list.get(i);
				}
			}
			//Das größte Element ganz nach rechts legen
			list.swap(indexOfLargestElement, p);
			//den Bereich 0-p verkleinern
			p--;
		}
	}
	
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
		int n = list.size()-1;
		for (int i =0; i<n; i++) {

			T m = list.get(i);			//wir wählen ein Element m
			int indexOfM=i;
			boolean leftOfMGreater = true;
			while (indexOfM>0 && leftOfMGreater) {		//solange wir nicht ganz kinks sind und das Element links von m größer m ist
				if (firstIsGreaterThanSecond(list.get(indexOfM-1),m)) {		//überprüfen ob das element links von m gößer m ist
					list.swap(indexOfM-1, indexOfM);						//wenn ja vertauschen
				indexOfM--;													//indexOfM korrigieren
				} else {
					leftOfMGreater = false;									//wenn nicht sorgen wir dafür, dass die Schleife endet
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
