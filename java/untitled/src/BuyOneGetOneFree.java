import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class BuyOneGetOneFree implements academy.pocu.comp2500.lab9.IpricePolicy {
    // 기획 대상이되는 skuList
    HashSet<UUID> skuList;

    public BuyOneGetOneFree(HashSet<UUID> skuList) {
        this.skuList = skuList;
    }

    public int getTotalPrice(Collection<Book> cartBookList) {
        int total = 0;
        HashMap<Book, Integer> targetCount = new HashMap<>();

        for (Book book : cartBookList) {
            if (skuList.contains(book.getSku())) {
                targetCount.put(book, targetCount.getOrDefault(book, 0) + 1);
            } else {
                total += book.getPrice();
            }
        }

        for (Book book : targetCount.keySet()) {
            double count = targetCount.get(book) / 2.0;

            total += Math.ceil(count) * book.getPrice();
            System.out.println(book.getTitle());
        }
        System.out.println(total);
        return total;
    }
}
