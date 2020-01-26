package domain;

public class Client {
    String name;
    String mobile;

    public Client(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
