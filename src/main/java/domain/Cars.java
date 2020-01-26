package domain;

public class Cars {
    private Car[] cars = new Car[100];
    private int last = -1;

    public void add(Car car){
        cars[++last % 100] = car;
        last = last == 100 ? 0 : last;
    }

    public void printAll(){
        for(int i=0; i <= last; i++){
            System.out.println(cars[i]);
        }
    }

    public Car getAt(int index){
        if (index < 0 || index > last){
            return null;
        }
        return cars[index];
    }
}
