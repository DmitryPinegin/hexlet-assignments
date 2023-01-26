package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] separatedSentence = sentence.split(" ");
        var i = 1;
        for (String l : separatedSentence) {
            list.add(l);
            for (String s : list) {
                if(list.contains(s)) {
                    i++;
                    wordCount.put(s,i);

                } else {
                    wordCount.put(s,i);
                }
            }
        }
        return wordCount;
    }
    public static String toString(Map<String, Integer> words) {
        String s = null;
        for(Map.Entry<String, Integer> word : words.entrySet()) {
            s = "{\n" + "  " + word.getKey() + ":  " + word.getValue() + "\n";

        } System.out.println(s);
        return s;
    }
}
//END
