public class Main {
    public static void main(String[] args) {

        Animal animal = new Cat("ccc", 10);

        Cat cat = (Cat) animal;
        cat.sayName();
        cat.getTail();

        System.out.println(animal.age);

        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 10);
        Point p3 = new Point(5, 10);

        p1.add(p3);
        p1.addTo(p2);


        System.out.println(p1.getX());
        System.out.println(p1.getY());


        Bob bob = new Bob("sdsd");
        Animal animal1 = new Animal("ddd");
        Bob animal2 = (Bob)animal1;
        Boob  boob = new Boob("kkk");



        System.out.println(animal1 instanceof Bob);


    }
}
