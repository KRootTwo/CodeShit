interface Drivable {
    void drive();
}
interface Chargable {
    void charge();
}
class EV implements Drivable, Chargable{
    private String model;

    EV(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void charge() {
        System.out.println("Car is charging");
    }

    void displayInfo() {
        System.out.println("Model: " + this.model);
    }
}
public class A02qr {
    public static void main(String[] args) {
        EV ev[] = new EV[2];

        ev[0] = new EV("Comet");
        ev[1] = new EV("Meteor");

        for (int i = 0; i < 2; i++) {
            ev[i].charge();
            ev[i].drive();
            ev[i].displayInfo();
            System.out.println();
        }
    }
}