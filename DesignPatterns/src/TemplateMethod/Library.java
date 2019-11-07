package TemplateMethod;

public abstract class Library {
    protected abstract void componentDidMount();
    protected abstract void componentWillDestroy();

    public void run() throws InterruptedException {
        this.mounted();
        this.componentDidMount();

        Thread.sleep(1500);
        this.componentWillDestroy();
        this.destroy();
    }

    private void mounted() throws InterruptedException {
        System.out.println("ready to mount");
        Thread.sleep(1500);
    }

    private void destroy() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("destroy");
    }
}
