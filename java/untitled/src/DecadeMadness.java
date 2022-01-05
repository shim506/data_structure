import java.util.Collection;
import java.util.HashMap;

public class DecadeMadness implements academy.pocu.comp2500.lab9.IpricePolicy {

    HashMap<Integer, Integer> decadeCount = new HashMap<>();

    public int getTotalPrice(Collection<Book> bookCollection) {
        double total = 0;
        for (Book book : bookCollection) {
            double year = book.getPublishedYear();
            int decadeYear = (int) Math.floor(year / 10);
            decadeCount.put(decadeYear, decadeCount.getOrDefault(decadeYear, 0) + 1);
        }

        for (Book book : bookCollection) {
            double year = book.getPublishedYear();
            int decadeYear = (int) Math.floor(year / 10);
            if (decadeCount.get(decadeYear) != null && decadeCount.get(decadeYear) > 1) {
                total += book.getPrice() * 0.8;
            }
        }

        return (int) Math.floor(total);

    }
}
