package exercise;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> usersList) {
        return usersList.stream()
                .sorted(Comparator.comparing(map -> (map.get("birthday"))))
                .filter(male -> male.get("gender").equals("male"))
                .map(name -> name.get("name"))
                .collect(Collectors.toList());
    }
}
// END
