package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> resultMap = new LinkedHashMap<>();
        for (Map.Entry<String, Object> key : map1.entrySet()) {
            if (map2.containsKey(key.getKey())) {
                if (map2.containsValue(key.getValue())) {
                    resultMap.put(key.getKey(), "unchanged");
                } else {
                    resultMap.put(key.getKey(), "changed");
                }
            } else {
                resultMap.put(key.getKey(), "deleted");
            }
        }
        for (Map.Entry<String, Object> key2 : map2.entrySet()) {
            if (!map1.containsKey(key2.getKey())) {
                resultMap.put(key2.getKey(), "added");
            }
        }
        return resultMap;
    }
}
//END
