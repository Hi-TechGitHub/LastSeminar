package org.example;

import java.util.*;
import java.util.concurrent.ForkJoinWorkerThread;

public class Main {
    public static void main(String[] args) {
        List<Class> computers = instancesOfClasses();
        sortRamInMin(computers);
        sortRamInMax(computers);
    }

    public static List<Class> instancesOfClasses() {
        Class one = new Class();
        one.name = "PC_1";
        one.price = 25000;
        one.id = 0001;
        one.RAM = 4;
        Class two = new Class();
        two.name = "PC_2";
        two.price = 80000;
        two.id = 0002;
        two.RAM = 12;
        Class three = new Class();
        three.name = "PC_3";
        three.price = 125000;
        three.id = 0003;
        three.RAM = 16;
        Class four = new Class();
        four.name = "PC_4";
        four.price = 15000;
        four.id = 0004;
        four.RAM = 2;
        List<Class> computers = new ArrayList<Class>(Arrays.asList(one, two, three, four));
        return computers;

    }

    public static void sortRamInMin(List<Class> comps) {
        int temp = 16;
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < comps.size(); i++) {
            var g = comps.get(i);

            if(g.RAM < temp) {
                indexs.add(g.id);
                temp = g.RAM;
            }
        }
        Collections.reverse(indexs);
        System.out.println("Ноутбуки с минимальным кол-вом озу: ");
        for (Integer index : indexs) {
            System.out.println(comps.get(index - 1));
        }
}
    public static void sortRamInMax(List<Class> comps) {
        int temp = 0;
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < comps.size(); i++) {
            var g = comps.get(i);

            if(g.RAM > temp) {
                indexs.add(g.id);
                temp = g.RAM;
            }
        }
        Collections.reverse(indexs);
        System.out.println("Ноутбуки с максимальным кол-вом озу: ");
        for (Integer index : indexs) {
            System.out.println(comps.get(index - 1));
        }

    }
}
