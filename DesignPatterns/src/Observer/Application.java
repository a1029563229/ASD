package Observer;

class ProgressBar extends Progress {

    @Override
    public void onProgress(float schedule) {
        System.out.println("ProgressBar is in " + schedule * 100 + "%");
    }
}

class ProgressEclipse extends Progress {

    @Override
    public void onProgress(float schedule) {
        System.out.println("Loading...");
    }
}

public class Application {
    public static void main(String[] args) {
        FileSplitter splitter = new FileSplitter(10);
        splitter.addProgress(new ProgressBar());
        splitter.addProgress(new ProgressEclipse());
        splitter.split();
    }
}
