package Decorator;

public class BufferDStream extends StreamDecorator {
    public BufferDStream(Stream stream) {
        super(stream);
    }

    public String readBufferSteam(String file) {
        String fileContent = this.stream.read(file);
        return "Buffer: " + fileContent;
    }
}
