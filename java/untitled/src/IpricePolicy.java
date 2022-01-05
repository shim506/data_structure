import java.util.Collection;

public interface IpricePolicy {
    public int getTotalPrice(Collection<Book> cartBookList);
}
