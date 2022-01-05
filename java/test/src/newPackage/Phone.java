package newPackage;

public class Phone {
    Battery battery;

    public Phone(Battery battery) {
        this.battery = battery;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Phone phone = (Phone) super.clone();
        phone.battery = (Battery) this.battery.clone();
        return phone;
    }
}
