import java.util.Comparator;

public class SortByCostDescend implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else {
            return -1;
        }

    }


}
