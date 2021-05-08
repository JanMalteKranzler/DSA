package de.unistuttgart.vis.dsass2021.ex02.p3;

public class Main {
    public static void main(String[] args) {
        SimpleList<Integer> list1 = new SimpleList();

        list1.append(12);
        list1.append(4);
        list1.append(5);
        list1.append(8);
        list1.append(7);
        list1.append(3);

        for (int i = 0; i< list1.size(); i++) {
            System.out.print(list1.get(i)+ ",");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        Sorter.insertionSort(list1);

        for (int i = 0; i< list1.size(); i++) {
            System.out.print(list1.get(i) + ",");
        }
    }
}
