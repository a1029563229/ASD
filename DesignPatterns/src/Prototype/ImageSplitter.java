package Prototype;

public class ImageSplitter extends ISplitter {
    @Override
    void split() {
        System.out.println("ImageSplitter split...");
    }

    @Override
    ISplitter cloneSelf() {
        return new ImageSplitter();
    }
}
