public class Cat extends Animal {
    private int tail;

    public Cat(String name, int tail) {
        super(name);
        this.tail = tail;
    }

    public void sayName() {
        System.out.println("ddd");
    }

    public int getTail() {
        System.out.println(tail);


        return tail;
    }


}
