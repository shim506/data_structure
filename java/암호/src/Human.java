public class Human {

    public int age = 0;

    public void increaseAge(int age, Human player) {
        player.age += age;
        age = 0;
        player = new Human();
    }
}
