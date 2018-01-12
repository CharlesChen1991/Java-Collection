package com.collection;

import com.collection.dto.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is to show some convenient usage of Set collection
 *
 * @author hao.e.chen
 * @date 12/01/2018
 */
public class JavaSetUsage {

    public Set<String> transferArrayToSet(String[] array) {
        return Arrays.stream(array).collect(Collectors.toSet());
    }

    public Set<String> transferObjListToStringSet(List<Person> people) {
        return people.stream().map(Person::getFamilyName).collect(Collectors.toCollection(TreeSet::new));
    }

    public Set<Person> removeDuplicatedPerson(List<Person> people) {
        return new HashSet<>(people);
    }

    /**
     * Please be careful that it will change the input parameters
     *
     * @param set1
     * @param set2
     * @return
     */
    public Set<String> findDuplicateBetween2Set(Set<String> set1, Set<String> set2) {
        if (set1.retainAll(set2)) {
            return set1;
        } else {
            System.out.println("No duplicated record between set1 and set2.");
            return new HashSet<>();
        }
    }

    /**
     * Please be careful that it will change the input parameters
     *
     * @param set1
     * @param set2
     * @return
     */
    public Set<String> removeDuplicatedRecordInSet1FromSet2(Set<String> set1, Set<String> set2) {
        set2.retainAll(set1);
        set1.removeAll(set2);
        return set1;
    }
}
