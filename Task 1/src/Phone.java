public class Phone {

    static String manufacturerCountry;
    String number;
    String model;
    double wheight;

    public Phone() {
    }

    public Phone(String nomber, String model, double wheight) {
        this.number = nomber;
        this.model = model;
        this.wheight = wheight;

    }

    public void receiveCall(String callerName) {
        receiveCall(callerName, "");
    }

    public void receiveCall(String callerName, String number) {
        System.out.println("Звонит абонент по имени " + callerName + (number == "" ? "" : "номер " + number));
    }

    public void Phone() {
        System.out.println("Модель телефона " + model + " произведена в стране " + manufacturerCountry);
    }
}
