import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SkyIsTheLimit implements academy.pocu.comp2500.lab9.IpricePolicy {
    int price;

    public SkyIsTheLimit(int price) {
        this.price = price;
    }

    public int getTotalPrice(Collection<Book> bookCollection) {
        double total = 0;
        ArrayList<Book> collections = new ArrayList<>();
        for (Book book : bookCollection) {
            collections.add(book);
            total += book.getPrice();
        }
        Collections.sort(collections, new academy.pocu.comp2500.lab9.SortByCostDescend());


        if (total >= price && bookCollection.size() >= 5) {
            double highestPrice = collections.get(0).getPrice();
            double secondHighestPrice = collections.get(1).getPrice();

            total = total - highestPrice - secondHighestPrice;
            total = total + highestPrice * 0.5 + secondHighestPrice * 0.5;

        }
        return (int) total;

    }
}
