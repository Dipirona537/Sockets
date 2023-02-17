
import Cripto.Criptografia;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static String obterTempoAtual() {
        LocalDateTime tempoAtual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd:MM:yyyy-HH:mm:ss");
        String tempoFormatado = tempoAtual.format(formato);
        return tempoFormatado;
    }
    public static void main(String[] args) throws Exception {
        /*System.out.println("Server ou cliente");
        Scanner sc = new Scanner(System.in);
        String esc = sc.nextLine();
        if (esc.equals("1"))
            Server.Conector.server(1500);
        else{
            Client.Cliente.cliente("localhost", 1500);
        }
        //a*/
        while (true)
        {
            System.out.println(obterTempoAtual());
            String senha = "5849232454345"+obterTempoAtual();
            String cript = Criptografia.criptografar("testando2", senha);
            System.out.println("Criptografado: "+cript);
            System.out.println("Descriptografado: "+Criptografia.descriptografar(cript, senha));
            System.out.print("\n");
            Thread.sleep(10000);
        }

    }
    //https://stackoverflow.com/questions/1132567/encrypt-password-in-configuration-files
}
