package FactoryMethod;

public class TextSplitterFactory extends ISplitterFactory {
    @Override
    public ISplitter createSplitter() {
        return new TextSplitter();
    }
}
