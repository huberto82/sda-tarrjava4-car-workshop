package domain;

public class Clients {
    private Client[] clients = new Client[100];
    private int last = -1;

    public Clients(){
        add(new Client("Kazimierz Dolny","7348928794"));
        add(new Client("Karol Motyl","345345345"));
        add(new Client("Anna Ogniskowa","34345345"));
    }

    public void add(Client client){
        clients[++last % 100] = client;
        last = last == 100 ? 0 : last;
    }

    public void printAll(){
        for(int i=0; i <= last; i++){
            System.out.println(clients[i]);
        }
    }

    public Client getAt(int index){
        if (index < 0 || index > last){
            return null;
        }
        return clients[index];
    }
}
