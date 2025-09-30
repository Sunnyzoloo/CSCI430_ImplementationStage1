import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientList clientList = new ClientList();

        while (true) {
            System.out.print("Enter Client ID (or type 'exit' to finish): ");
            String id = scanner.nextLine();
            if (id.equalsIgnoreCase("exit")) {
                break; // stop when user types exit
            }

            System.out.print("Enter Client Name: ");
            String name = scanner.nextLine();

            Client client = new Client(id, name);
            boolean added = clientList.addClient(client);

            if (added) {
                System.out.println("Client created: " + client);
            } else {
                System.out.println("Client with ID " + id + " already exists!");
            }
        }

        System.out.println("\nAll Clients:");
        System.out.println(clientList.getAllClients());
        scanner.close();
    }
}
