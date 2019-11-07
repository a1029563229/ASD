package TemplateMethod;

public class Application extends Library {
    protected void componentDidMount() {
        System.out.println("componentDidMount");
    }

    protected void componentWillDestroy() {
        System.out.println("componentWillDestroy");
    }

    public static void main(String[] args) throws InterruptedException {
        Application application = new Application();
        application.run();
    }
}
