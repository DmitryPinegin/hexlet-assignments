package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] separatedSentence = sentence.split(" ");
        for (String l : separatedSentence) {
            if (sentence.equals("")) {
                return wordCount;
            } else if (wordCount.containsKey(l)) {
                wordCount.put(l, wordCount.get(l) + 1);
            } else {
                wordCount.put(l, 1);
            }
        }
        return wordCount;
    }
    public static String toString(Map wordCount) {
        String[] res = new String[wordCount.size()];
        int i = 0;
        String result = "{";
        if (res.length == 0) {
            return "{}";
        }
        for (Object s : wordCount.keySet()) {
            res[i] = "\n  " + s + ": " + wordCount.get(s);
            i++;
        }
        for (String r : res) {
            result += r;
        }
        return  result + "\n}";
    }
}
//END

