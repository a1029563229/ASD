package Decorator;

public class NetworkStream extends Stream {
    @Override
    public String read(String file) {
        return "NetworkStream content is " + file;
    }

    @Override
    public String write(String content) {
        return "NetworkStream write success";
    }
}
