package com.collection;

import java.util.*;

/**
 * This is to show some usage of list
 *
 * @author hao.e.chen
 * @date 18/01/2018
 */
public class JavaListUsage {

    /**
     * Collection's shuffle function will shuffle the list with equal likelihood
     * it will change the parameter directly
     *
     * @param list
     */
    public List shuffleList(List<Integer> list) {
        List tempList = new ArrayList<Integer>();
        tempList.addAll(list);
        Collections.shuffle(tempList);
        return tempList;
    }

    public static void main(String[] args) {
        List<Integer> iteratorTestList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            iteratorTestList.add(i);
        }
        System.out.println("List prepared : " + iteratorTestList);
        ListIterator iterator = iteratorTestList.listIterator();
        while (iterator.hasNext()) {
            System.out.println("previous index [" + iterator.previousIndex() + "] next index [" + iterator.nextIndex() + "]");
            System.out.println("next value is [" + iterator.next() + "]");
        }
        System.out.println("End =========== ");
        System.out.println("previous index [" + iterator.previousIndex() + "] next index [" + iterator.nextIndex() + "]");
        try {
            iterator.next();
        } catch (NoSuchElementException e) {
            System.out.println("Call next again will throw NoSuchElementException.");
        }
        JavaListUsage usage = new JavaListUsage();
        List shuffleList = usage.shuffleList(iteratorTestList);
        System.out.println("Original List : " + iteratorTestList);
        System.out.println("Shuffled List : " + shuffleList);
    }
}
