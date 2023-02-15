package Server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conector {
    public static void server(int porta) throws IOException {
        ServerSocket server = new ServerSocket(porta);
        Socket conn = new Socket();
        conn = server.accept();
        DataInputStream entrada = new DataInputStream(new BufferedInputStream(conn.getInputStream()));
        String str = "";
        while (!str.equals("sair"))
        {
            str = entrada.readUTF();
            System.out.println(str);
        }
        conn.close();
        entrada.close();
    }
}
