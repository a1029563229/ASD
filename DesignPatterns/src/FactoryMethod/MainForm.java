package FactoryMethod;

public class MainForm {
    public ISplitter splitter;

    public MainForm(ISplitterFactory splitterFactory) {
        this.splitter = splitterFactory.createSplitter();
    }

    public void onClick() {
        this.splitter.split();
    }
}
