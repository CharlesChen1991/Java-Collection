package com.collection;

import com.collection.dto.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hao.e.chen on 12/01/2018.
 */

public class JavaSetUsageTest {

    private static JavaSetUsage util;

    @BeforeClass
    public static void prepareUtil() {
        JavaSetUsageTest.util = new JavaSetUsage();
    }

    @Test
    public void transferArrayToSet() throws Exception {
        String[] testArray = new String[]{"test1", "test2", "test3", "test1"};
        Set<String> result = util.transferArrayToSet(testArray);
        Assert.assertEquals(result.size(), testArray.length - 1);
        for (String data : testArray) {
            Assert.assertTrue(result.contains(data));
        }
    }

    @Test
    public void transferObjListToStringSet() throws Exception {
        List<Person> people = new ArrayList<>(4);
        people.add(new Person("a", "b"));
        people.add(new Person("c", "d"));
        people.add(new Person("e", "f"));
        people.add(new Person("a", "b"));
        Set<String> result = util.transferObjListToStringSet(people);
        Assert.assertTrue(people.stream().allMatch(person -> result.contains(person.getFamilyName())));
        Assert.assertEquals(people.size() - 1, result.size());
    }

    @Test
    public void removeDuplicatedPerson() throws Exception {

    }

    @Test
    public void findDuplicateBetween2Set() throws Exception {
        Set<String> set1 = new HashSet<>(4);
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        Set<String> set2 = new HashSet<>(3);
        set2.add("e");
        set2.add("c");
        set2.add("d");
        Set<String> duplicatedRecords = util.findDuplicateBetween2Set(set1, set2);
        Assert.assertEquals(2, duplicatedRecords.size());
        Assert.assertTrue(duplicatedRecords.contains("c"));
        Assert.assertTrue(duplicatedRecords.contains("d"));
    }

    @Test
    public void removeDuplicatedRecordInSet1FromSet2() throws Exception {
        Set<String> set1 = new HashSet<>(4);
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        Set<String> set2 = new HashSet<>(3);
        set2.add("e");
        set2.add("c");
        set2.add("d");
        Set<String> result = util.removeDuplicatedRecordInSet1FromSet2(set1, set2);
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains("a"));
        Assert.assertTrue(result.contains("b"));
    }

}