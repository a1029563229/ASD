package Prototype;

public class MainForm {
    private ISplitter splitter;

    public MainForm(ISplitter splitter) {
        this.splitter = splitter;
    }

    public void ButtonClick() {
        ISplitter splitter = this.splitter.cloneSelf();
        splitter.split();
    }

    public static void main(String[] args) {
        MainForm mainForm = new MainForm(new TextSplitter());
        mainForm.ButtonClick();
    }
}
