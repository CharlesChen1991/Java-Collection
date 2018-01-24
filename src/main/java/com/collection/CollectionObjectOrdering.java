package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class show some collection object ordering concepts
 *
 * @author hao.e.chen
 * @date 21/01/2018
 */
public class CollectionObjectOrdering {
    public static void main(String[] args) {
        //Object ordering for String list
        List<String> strList = new ArrayList();
        strList.add("beta");
        strList.add("alpha");
        strList.add("gama");
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);
    }
}
