package Cripto;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Criptografia {

    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String CHARSET = "UTF-8";
    private static final int KEY_SIZE = 256;

    public static String criptografar(String texto, String chave) throws Exception {
        byte[] iv = new byte[16];
        SecretKeySpec key = new SecretKeySpec(chave.getBytes(StandardCharsets.UTF_8), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);
        byte[] textoCriptografado = cipher.doFinal(texto.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(textoCriptografado);
    }

    public static String descriptografar(String textoCriptografado, String chave) throws Exception {
        byte[] iv = new byte[16];
        SecretKeySpec key = new SecretKeySpec(chave.getBytes(StandardCharsets.UTF_8), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
        byte[] textoBytes = Base64.getDecoder().decode(textoCriptografado);
        byte[] textoDescriptografado = cipher.doFinal(textoBytes);
        return new String(textoDescriptografado, StandardCharsets.UTF_8);
    }
}
