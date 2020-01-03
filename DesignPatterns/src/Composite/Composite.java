package Composite;

import java.util.ArrayList;
import java.util.List;

abstract class Node {
    public String name;
    abstract void process();
}

class ParentNode extends Node {
    private List<Node> list;

    public ParentNode(String name) {
        this.name = name;
        this.list = new ArrayList<Node>();
    }

    public void add(Node node) {
        this.list.add(node);
    }

    @Override
    void process() {
        System.out.println(this.name + " parentNode process");

        for (Node node: this.list) {
            node.process();
        }
    }
}

class ChildNode extends Node {
    public ChildNode(String name) {
        this.name = name;
    }

    @Override
    void process() {
        System.out.println(this.name + " childNode process");
    }
}

public class Composite {
    public static void main(String[] args) {
        ParentNode root = new ParentNode("root");
        ParentNode p1 = new ParentNode("p1");
        ParentNode p2 = new ParentNode("p2");
        ParentNode p3 = new ParentNode("p3");
        ChildNode c1 = new ChildNode("c1");
        ChildNode c2 = new ChildNode("c2");
        p3.add(c1);
        p3.add(c2);
        p2.add(p3);
        p1.add(p2);
        root.add(p1);
        root.process();
    }
}
