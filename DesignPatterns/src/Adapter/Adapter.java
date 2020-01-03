package Adapter;

// 目标接口（新接口）
abstract class ITarget {
    abstract void process();
}

// 遗留接口（老接口）
abstract class IAdaptee {
    abstract void foo();
    abstract void bar();
}

// 遗留类型
class OldClass extends IAdaptee {

    @Override
    void foo() {
        System.out.println("foo");
    }

    @Override
    void bar() {
        System.out.println("bar");
    }
}

public class Adapter extends ITarget {
    private IAdaptee iAdaptee;

    public Adapter(IAdaptee iAdaptee) {
        this.iAdaptee = iAdaptee;
    }

    @Override
    void process() {
        this.iAdaptee.foo();
        this.iAdaptee.bar();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new OldClass());
        adapter.process();
    }
}
