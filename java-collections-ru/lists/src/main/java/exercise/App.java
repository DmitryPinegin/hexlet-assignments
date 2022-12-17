package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        List<String> symbol = new ArrayList<>();
        for (int i = 0; i < symbols.length(); i++) {
            symbol.add(String.valueOf(symbols.charAt(i)));
        }
        List<String> arrword = new ArrayList<>();
        for (int y = 0; y < word.length(); y++) {
            var cha = String.valueOf(word.charAt(y));
            arrword.add(cha.toLowerCase());
        }

        for (String d : arrword) {
            if (!symbol.contains(d)) {
                return false;
            } else if (symbol.contains(d)) {
                symbol.remove(d);
            }
        } return true;
    }
}

//END

