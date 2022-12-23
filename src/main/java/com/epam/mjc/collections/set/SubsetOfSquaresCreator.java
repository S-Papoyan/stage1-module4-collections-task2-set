package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public static Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        if (!sourceList.isEmpty()) {
            for (Integer value : sourceList) {
                navigableSet.add(value * value);
            }
            return navigableSet.subSet(lowerBound, true, upperBound, true);
        }
        return navigableSet;
    }
}
