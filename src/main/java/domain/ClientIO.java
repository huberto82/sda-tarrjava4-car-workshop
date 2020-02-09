package domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ClientIO {
    public static void save(String path, List<Client> list) throws IOException {
        Path filePath = Paths.get(path);
        List<String> lines = new ArrayList<>();
        for(Client client: list){
            lines.add(client.name+"\t"+client.mobile);
        }
        Files.write(filePath, lines);
    }

    public static List<Client> load(String path){
        return null;
    }
}
