import java.util.Collection;

public class SimplePricing implements academy.pocu.comp2500.lab9.IpricePolicy {
    @Override
    public int getTotalPrice(Collection<Book> cartBookList) {
        int price = 0;
        for (Book book : cartBookList) {
            price += book.getPrice();
        }
        return price;
    }
}
