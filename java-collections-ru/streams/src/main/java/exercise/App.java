package exercise;

import java.util.List;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> email) {
        int x = (int) email.stream()
                .filter(str -> str.contains("@gmail.com"))
                .count();
        int y = (int) email.stream()
                .filter(str -> str.contains("@yandex.ru"))
                .count();
        int s = (int) email.stream()
                .filter(str -> str.contains("@hotmail.com"))
                .count();
        return x + y + s;
    }
}
// END
