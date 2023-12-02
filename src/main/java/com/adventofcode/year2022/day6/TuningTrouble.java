package com.adventofcode.year2022.day6;

import java.util.HashSet;

public class TuningTrouble {

    public int getFirstMarker(String inputString, int marker) {
        int start = 0;
        while (marker < inputString.length()) {
            if (isStringHavingUniqueCharacter(inputString.substring(start, marker))) return marker;
            marker++;
            start++;
        }
        return 0;
    }

    private Boolean isStringHavingUniqueCharacter(String str) {
        HashSet<Integer> set = new HashSet<>();
        str.chars().boxed().forEach(set::add);
        return set.size() == str.length();
    }
}
