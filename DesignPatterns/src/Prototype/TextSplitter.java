package Prototype;

public class TextSplitter extends ISplitter {

    @Override
    void split() {
        System.out.println("TextSplitter split...");
    }

    @Override
    ISplitter cloneSelf() {
        return new TextSplitter();
    }
}
