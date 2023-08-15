public class Main {
    public static void main(String[] args) {

        Phone Poco = new Phone("375295528575", "Poco", 213);
        Phone iPhone = new Phone("375445507983", "iPhone 14", 185);
        Phone noname = new Phone();
        Phone.manufacturerCountry = "China";

        System.out.println("Модель телефона " + Poco.model + " весом " + Poco.wheight
                + " с номером телефона " + Poco.number + " создан в " + Poco.manufacturerCountry);
        System.out.println("Модель телефона " + iPhone.model + " весом " + iPhone.wheight
                + " с номером телефона " + iPhone.number + " создан в ");
        System.out.println("У Евгения телефон " + noname.model + " а его номер телефона " +
                noname.number + " создан в " + noname.manufacturerCountry);
        System.out.println("\n");

        Poco.receiveCall("Владимир");
        iPhone.receiveCall("Владислав", "29948618");
        noname.receiveCall("Евгений");

        Phone.manufacturerCountry = "China";
    }
}
