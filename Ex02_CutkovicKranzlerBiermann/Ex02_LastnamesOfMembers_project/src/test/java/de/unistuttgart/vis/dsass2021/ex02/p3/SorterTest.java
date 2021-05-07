package de.unistuttgart.vis.dsass2021.ex02.p3;

import static org.junit.Assert.*;

import org.junit.Test;

import de.unistuttgart.vis.dsass2021.ex02.p3.ISimpleList;
import de.unistuttgart.vis.dsass2021.ex02.p3.Sorter;

public class SorterTest {

	public void testSelectionSort() {
		final SimpleList<String> = createRandomList();

	}

	private SimpleList<String> createRandomList() {
		SimpleList<String> list = new SimpleList();
		list.append("ghzrj");
		list.append("agae");
		list.append("dgs");
		list.append("");
		list.append("tui");
		list.append("ioöouo");
		list.append("cunt");
		list.append("ouzu");

		return list;
	}

	//Checks, whether the list is actually sorted.
	private boolean listIsSorted(final SimpleList<T extends Comparable<T>> list) {
		boolean listIsSorted = true;
		for (int i=0; i< (list.size()-2) ; i++) {
			if (firstIsGreaterThanSecond(list.get(i), list.get(i+1))) {
				listIsSorted=false;
			}
		}
		return listIsSorted;
	}

	//Compares two Java Generics and returns only true, if the first argument is "bigger", than the second argument
	private <T extends Comparable<T>> boolean firstIsGreaterThanSecond(T t1, T t2) {
		return t1.compareTo(t2)<0;
	}
}
