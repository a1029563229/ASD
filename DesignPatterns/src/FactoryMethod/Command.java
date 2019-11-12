package FactoryMethod;

public class Command {
    public static void main(String[] args) {
        MainForm text = new MainForm(new TextSplitterFactory());
        text.onClick();

        MainForm video = new MainForm(new VideoSplitterFactory());
        video.onClick();
    }
}
