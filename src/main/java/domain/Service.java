package domain;

abstract public class Service{
    private Car car;
    private String description;

    public Service(Car car, String description) {
        this.car = car;
        this.description = description;
    }
}
