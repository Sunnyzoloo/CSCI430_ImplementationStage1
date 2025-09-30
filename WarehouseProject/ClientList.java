import java.util.ArrayList;
import java.util.List;

public class ClientList {
    private List<Client> clients;

    public ClientList() {
        clients = new ArrayList<>();
    }

    public boolean addClient(Client client) {
        // prevent duplicate IDs
        for (Client c : clients) {
            if (c.getId().equals(client.getId())) {
                return false;
            }
        }
        clients.add(client);
        return true;
    }

    public Client getClient(String id) {
        for (Client c : clients) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null; // not found
    }

    public List<Client> getAllClients() {
        return clients;
    }

    @Override
    public String toString() {
        return clients.toString();
    }
}
