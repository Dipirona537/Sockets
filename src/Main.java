import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Server ou cliente");
        Scanner sc = new Scanner(System.in);
        String esc = sc.nextLine();
        if (esc.equals("1"))
            Server.Conector.server(1500);
        else{
            Client.Cliente.cliente("localhost", 1500);
        }
    }
}
