package domain;

public class NitroInstallationService extends Service implements Price {
    private int hours;
    private int workers;
    private int instalationPrice;

    public NitroInstallationService(Car car, String description, int hours, int workers, int instalationPrice) {
        super(car, description);
        this.hours = hours;
        this.workers = workers;
        this.instalationPrice = instalationPrice;
    }

    @Override
    public int price(int hours, int workers) {
        return workers * hours * 1000 + instalationPrice;
    }
}
