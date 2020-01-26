package domain;
import java.time.LocalDate;

public class ChangeOilService extends Service implements Price {
    private LocalDate date;

    public ChangeOilService(Car car, String description) {
        super(car, description);
        date = LocalDate.now();
    }

    @Override
    public int price(int hours, int workers) {
        return 10_000;
    }

    @Override
    public String toString() {
        return "ChangeOilService{" +
                "date=" + date +
                '}';
    }
}
