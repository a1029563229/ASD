package Decorator;

public class FileStream extends Stream {
    @Override
    public String read(String file) {
        return "FileStream content is " + file;
    }

    @Override
    public String write(String content) {
        return "FileStream write success";
    }
}
