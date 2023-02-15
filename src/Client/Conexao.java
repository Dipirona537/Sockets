package Client;

import java.io.IOException;
import java.net.Socket;

class Conexao {
    public static Socket conn(String ip, int port) throws IOException {
        return new Socket(ip, port);
    }
}
