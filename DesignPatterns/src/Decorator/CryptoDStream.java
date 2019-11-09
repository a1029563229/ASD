package Decorator;

public class CryptoDStream extends StreamDecorator {
    public CryptoDStream(Stream stream) {
        super(stream);
    }

    public String readCryptoStream(String file) {
        String fileContent = this.stream.read(file);
        return "Crypted File Content " + fileContent;
    }

    public String writeCryptoStream(String file) {
        String fileContent = this.stream.write(file);
        return "Write Crypted File Content " + fileContent;
    }
}
