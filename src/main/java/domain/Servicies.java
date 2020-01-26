package domain;

public class Servicies {
    private Service[] servicies = new Service[100];
    private int last = -1;

    public void add(Service service){
        servicies[++last % 100] = service;
        last = last == 100 ? 0 : last;
    }

    public void printAll(){
        for(int i=0; i <= last; i++){
            System.out.println(servicies[i]);
        }
    }

}
