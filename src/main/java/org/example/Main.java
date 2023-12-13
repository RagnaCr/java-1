package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int listSize = 100000;
        int elementsToInsert = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заповнюємо випдаковими елементами
        fill(arrayList, listSize, "ArrayList");
        fill(linkedList, listSize, "LinkedList");

        // Гетаем по випадковому індексу
        randomAccess(arrayList, "ArrayList");
        randomAccess(linkedList, "LinkedList");

        // Проходим по всьому листу в циклі
        sequentialAccess(arrayList, "ArrayList");
        sequentialAccess(linkedList, "LinkedList");

        // Insert at the beginning
        insertAtBeginning(arrayList, elementsToInsert, "ArrayList");
        insertAtBeginning(linkedList, elementsToInsert, "LinkedList");

        // Insert at the end
        insertAtEnd(arrayList, elementsToInsert, "ArrayList");
        insertAtEnd(linkedList, elementsToInsert, "LinkedList");

        // Insert in the middle
        insertInMiddle(arrayList, elementsToInsert, "ArrayList");
        insertInMiddle(linkedList, elementsToInsert, "LinkedList");
    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt());
        }
        System.out.printf("Fill %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void randomAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        int size = list.size();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int index = random.nextInt(size);
            list.get(index);
        }

        System.out.printf("Random access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void sequentialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();

        for (Integer integer : list) {
            // Проходить по всім елементам
        }

        System.out.printf("Sequential access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtBeginning(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(0, i);
        }

        System.out.printf("Insert at the beginning of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtEnd(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(i);
        }

        System.out.printf("Insert at the end of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }
    private static void insertInMiddle(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            list.add(list.size() / 2,  i);
        }
        System.out.printf("Insert in the middle of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }
}
