package FactoryMethod;

public class TextSplitter extends ISplitter {

    @Override
    public void split() {
        System.out.println("TextSplitter split...");
    }
}
