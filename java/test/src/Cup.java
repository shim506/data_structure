public class Cup {
    int sizeMl;

    private Cup(int sizeMl) {
        this.sizeMl = sizeMl;
    }

    public static Cup createOrNull(CupSize cupSize) {
        switch (cupSize) {
            case LARGE:
                return new Cup(200);
            case SMALL:
                return new Cup(100);
            default:
                assert (false) : "unhandledCupSize";
                return null;
        }
    }
}
