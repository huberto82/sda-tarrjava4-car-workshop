package domain;

public class Car {
    String model;
    String registrationNumber;
    Client user;

    public Car(String model, String registrationNumber, Client user) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", user=" + user +
                '}';
    }
}
