package SystemDesignLLD.CREATIONAL_PATTERN.Builder;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;

    private Car(Carbuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }
    public String getEngine() {
        return engine;
    }
    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats
                + ", color=" + color + ", sunroof=" + sunroof
                + ", navigationSystem=" + navigationSystem + "]";
    }

    public static class Carbuilder {
        private String engine;
        private int wheels = 4; // Default value
        private int seats = 5; // Default value
        private String color = "Black"; // Default value
        private boolean sunroof = false; // Default value
        private boolean navigationSystem = false; // Default value

        public Carbuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Carbuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Carbuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        public Carbuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Carbuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Carbuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
