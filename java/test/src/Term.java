public class Term {
    int ex;
    int coefficient;

    public Term(int ex, int coefficient) {
        this.ex = ex;
        this.coefficient = coefficient;
    }


    @Override
    public String toString() {
        return "Term{" +
                "ex=" + ex +
                ", coefficient=" + coefficient +
                '}';
    }
}
