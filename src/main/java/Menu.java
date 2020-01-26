public enum Menu {
    ADD_CLIENT( 1, "Wpisz klienta"),
    ADD_CAR(2, "Wpisz auto"),
    ADD_SERVICE(3, "Wpisz wykonaną usługę"),
    PRINT_INVOCE(4,"Drukuj fakturę"),
    PRINT_CARS(5,"Wyświetl samochody"),
    PRINT_CLIENTS(6,"Wyświetl klientów"),
    PRINT_SERVICIES(7,"Wyświetl wykonane usługi"),
    EXIT(0,"Wyjście");

    private String message;
    private int key;

    Menu(int key, String message) {
        this.message = message;
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "message='" + message + '\'' +
                ", key=" + key +
                '}';
    }

    static public Menu intOf(int key){
        for(Menu item: Menu.values()) {
            if (item.key == key) {
                return item;
            }
        }
        return null;
    }
}

