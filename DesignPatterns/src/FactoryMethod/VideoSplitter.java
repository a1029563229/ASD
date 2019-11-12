package FactoryMethod;

public class VideoSplitter extends ISplitter {
    @Override
    public void split() {
        System.out.println("VideoSplitter split ....");
    }
}
