import domain.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarWorkshopApp {
    static Scanner scanner = new Scanner(System.in);
    static List<Car> cars = new ArrayList<>();
    static List<Client> clients = new ArrayList<>();
    static List<Service> servicies = new ArrayList<>();

    static void printMenu(){
        for(Menu item:Menu.values()){
            System.out.println(item.getKey()+". "+ item.getMessage());
        }
    }

    static void addCar(){
        System.out.println("Wpisz dane auta:");
        System.out.println("Model:");
        String model = scanner.nextLine();
        System.out.println("Numer rejestracyjny:");
        String regNum = scanner.nextLine();
        System.out.println("Podaj numer właściciela");
        int clientNumber = scanner.nextInt();
        Car car = new Car(model, regNum, clients.get(clientNumber));
        cars.add(car);
    }

    static void addClient(){
        System.out.println("Wpisz dane klienta:");
        System.out.println("Imię i nazwisko:");
        String name = scanner.nextLine();
        System.out.println("Numer telefonu:");
        String mobile = scanner.nextLine();
        Client client = new Client(name,mobile);
        clients.add(client);
    }

    static void addService(){
        System.out.println("Wpisz dane usługi:");
        System.out.println("Podaj numer samochodu");
        int carNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wpisz opis usługi");
        String desc = scanner.nextLine();
        servicies.add(new ChangeOilService(cars.get(carNumber), desc));
    }

    static <T> void  printAll(List<T> list){
        for(T item: list){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello from workshop");
        Menu menuOption = Menu.ADD_CAR;
        while(true){
            printMenu();
            if (!scanner.hasNextInt()){
                scanner.nextLine();
                continue;
            }
            int item = scanner.nextInt();
            scanner.nextLine();
            menuOption = Menu.keyOf(item);
            if (menuOption == null){
                continue;
            }
            switch (menuOption){
                case ADD_CAR:
                    addCar();
                    break;
                case ADD_CLIENT:
                    addClient();
                    break;
                case ADD_SERVICE:
                    addService();
                    break;
                case PRINT_INVOCE:
                    break;
                case PRINT_CARS:
                    printAll(cars);
                    break;
                case PRINT_CLIENTS:
                    printAll(clients);
                    break;
                case PRINT_SERVICIES:
                    printAll(servicies);
                    break;
                case EXIT:
                    try {
                        ClientIO.save("C:\\temp\\clients.txt", clients);
                    } catch (IOException e) {
                        System.out.println("Zapis nie powiódł się!!!");
                    }
                    return;
            }
        }
    }
}
