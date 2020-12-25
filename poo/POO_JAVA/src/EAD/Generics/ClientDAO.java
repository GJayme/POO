package EAD.Generics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClientDAO implements GenericDAO<Client, String> {

    Map<String, Client> clients= new LinkedHashMap<>();

    @Override
    public boolean insert(Client client) {
        if(clients.containsKey(client.getCpf())) {
            return false;
        }
        clients.put(client.getCpf(), client);
        return true;
    }

    @Override
    public Client findOne(String key) {
        if (!clients.containsKey(key)) {
            return null;
        }
        return clients.get(key);
    }


    @Override
    public List<Client> findAll() {
        List<Client> allClients = new ArrayList<>();
        for (Map.Entry<String, Client> entry : clients.entrySet()) {
            allClients.add(entry.getValue());
        }
        return allClients;
    }

    @Override
    public boolean remove(String key) {
        if (!clients.containsKey(key)) {
            return false;
        }

        Client clientToRemove = clients.get(key);
        clients.remove(key, clientToRemove);
        return true;
    }
}
