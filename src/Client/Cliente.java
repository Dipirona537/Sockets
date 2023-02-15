package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void cliente(String ip, int port) throws IOException {
        Socket cn = Conexao.conn(ip, port);
        DataInputStream entrada = new DataInputStream(System.in);
        DataOutputStream saida = new DataOutputStream(cn.getOutputStream());
        String str = "";

        while (!str.equals("Sair"))
        {
            str = entrada.readLine();
            saida.writeUTF(str);
        }

        entrada.close();
        saida.close();
        cn.close();
    }
}
