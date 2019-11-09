package Strategy;

abstract class SyntaxStrategy {
    abstract String convert(int input);
}

class CNSyntax extends SyntaxStrategy {
    String convert(int input) {
        return "CN Syntax " + input;
    }
}

class USSyntax extends SyntaxStrategy {
    String convert(int input) {
        return "US Syntax " + input * 100;
    }
}

public class Strategy {
    private SyntaxStrategy syntax;

    public Strategy(SyntaxStrategy syntax) {
        this.syntax = syntax;
    }

    public String convert(int input) {
        return this.syntax.convert(input);
    }

    public static void main(String[] args) {
        int input = 1;
        CNSyntax cn = new CNSyntax();
        USSyntax us = new USSyntax();
        Strategy s1 = new Strategy(cn);
        Strategy s2 = new Strategy(us);
        System.out.println(s1.convert(input));
        System.out.println(s2.convert(input));
    }
}
