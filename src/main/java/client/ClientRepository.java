package client;

import client.exception.ClientNotFound;

import java.util.ArrayList;

public class ClientRepository {
    private static final ArrayList<Client> clients = importClients();

    private static ArrayList<Client> importClients() {
        ArrayList<Client> clients = null;

        return clients;
    }

    private static void exportClient(ArrayList<Client> clients) {

    }

    private Client searchClientFromName(String clientName) throws ClientNotFound {
        for (Client client : clients) {
            if (client.getLastname().equals(clientName)) {
                return client;
            }
        }

        throw new ClientNotFound();
    }

    private void DisplayClientList() {
        clients.forEach(System.out::print);
    }

    private void addClient(Client client) {
        clients.add(client);
    }




}
