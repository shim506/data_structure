package newPackage;

public class Battery implements Cloneable{
    int capacity = 100;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
