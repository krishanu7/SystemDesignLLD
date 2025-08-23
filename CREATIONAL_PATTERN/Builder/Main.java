package SystemDesignLLD.CREATIONAL_PATTERN.Builder;

public class Main {
    public static void main(String[] args) {
        Car.Carbuilder builder = new Car.Carbuilder();

        Car car1 =  builder.setEngine("V8")
                .setColor("Red")
                .setSeats(5)
                .setSunroof(true)
                .build();
        System.out.println(car1);
    }
}
