package de.unistuttgart.vis.dsass2021.ex02.p3;

import static org.junit.Assert.*;

import org.junit.Test;

import de.unistuttgart.vis.dsass2021.ex02.p3.ISimpleList;
import de.unistuttgart.vis.dsass2021.ex02.p3.Sorter;

public class SorterTest {

	@Test
	public void testSelectionSort() {
		SimpleList<Integer> list1 = new SimpleList();


		list1.append(1);
		list1.append(3);
		list1.append(2);
		list1.append(4);
		list1.append(6);
		list1.append(5);
		System.out.println(list1);
		Sorter.selectionSort(list1);
		System.out.println(list1);


		assertEquals(6, list1.size());
		assertEquals(new Integer(6),list1.get(0));
		assertEquals(new Integer(5),list1.get(1));
		assertEquals(new Integer(4),list1.get(2));
		assertEquals(new Integer(3),list1.get(3));
		assertEquals(new Integer(2),list1.get(4));
		assertEquals(new Integer(1),list1.get(5));
	}

}


