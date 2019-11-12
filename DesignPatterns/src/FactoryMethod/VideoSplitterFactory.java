package FactoryMethod;

public class VideoSplitterFactory extends ISplitterFactory {
    @Override
    public ISplitter createSplitter() {
        return new VideoSplitter();
    }
}
