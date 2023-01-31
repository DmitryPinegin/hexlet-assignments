package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> bookList, Map<String, String>
            vocabulary) {
        List<Map<String, String>> listOfExistingBooks = new ArrayList<>();
        for (Map books : bookList) {
            if (books.get("author").equals(vocabulary.get("author"))
                    && books.get("year").equals(vocabulary.get("year"))
                    && books.get("title").equals(vocabulary.get("title"))) {
                listOfExistingBooks.add(books);
            } else if (!vocabulary.containsKey("title")
                    && books.get("author").equals(vocabulary.get("author"))
                    && books.get("year").equals(vocabulary.get("year"))) {
                listOfExistingBooks.add(books);
            }
        }
        return listOfExistingBooks;
    }
}
//END
