package Decorator;

public class Command {
    public static void main(String[] args) {
        CryptoDStream c1 = new CryptoDStream(new FileStream());
        System.out.println(c1.readCryptoStream("c1 file"));
        System.out.println(c1.writeCryptoStream("c1 write file"));
        CryptoDStream c2 = new CryptoDStream(new NetworkStream());
        System.out.println(c2.readCryptoStream("c2 network"));
        System.out.println(c2.writeCryptoStream("c2 write network file"));
        BufferDStream b1 = new BufferDStream(new NetworkStream());
        System.out.println(b1.readBufferSteam("Buffer file"));
    }
}
