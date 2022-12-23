package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        if (!sourceList.isEmpty()) {
            for (Integer integer : sourceList) {
                if (integer % 2 == 0) {
                    int elem = integer;
                    while (elem > 0) {
                        hashSet.add(elem);
                        elem /= 2;
                    }
                }
                if (integer % 2 != 0) {
                    hashSet.add(integer);
                    hashSet.add(integer * 2);
                }
            }
        }
        return hashSet;
    }
}