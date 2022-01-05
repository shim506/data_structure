import java.util.Objects;
import java.util.UUID;

public final class Book {
    private final UUID sku;
    private final String title;
    private final int price;
    private final int publishedYear;

    public Book(final UUID sku, final String title, final int price, final int publishedYear) {
        this.sku = sku;
        this.title = title;
        this.price = price;
        this.publishedYear = publishedYear;
    }

    public int getPrice() {
        return this.price;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public String getTitle() {
        return this.title;
    }

    public UUID getSku() {
        return this.sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(sku, book.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, title, price, publishedYear);
    }
}