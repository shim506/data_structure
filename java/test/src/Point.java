public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void add(Point other){
        this.y += other.y;
        this.x += other.x;
    }

    public void addTo(Point other){
        other.y += this.y;
        other.x += this.x;
    }
}