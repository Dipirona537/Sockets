import Cripto.Criptmessage;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        /*System.out.println("Server ou cliente");
        Scanner sc = new Scanner(System.in);
        String esc = sc.nextLine();
        if (esc.equals("1"))
            Server.Conector.server(1500);
        else{
            Client.Cliente.cliente("localhost", 1500);
        }
        //a*/
        System.out.print(Criptmessage.criptografar("testando", "5849"));
    }
    //https://stackoverflow.com/questions/1132567/encrypt-password-in-configuration-files
}
