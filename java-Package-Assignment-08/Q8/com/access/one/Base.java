package com.access.one;

public class Base {

    public String publicMethod() {
        return "public method – accessible everywhere";
    }

    protected String protectedMethod() {
        return "protected method – accessible within package & subclasses";
    }

    String defaultMethod() {
        return "default (package-private) method – accessible only within same package";
    }

    private String privateMethod() {
        return "private method – accessible only within this class";
    }

    // Public wrapper so we can prove private exists but can only be called here
    public String callPrivateMethod() {
        return privateMethod();
    }

    public void showAll() {
        System.out.println(publicMethod());
        System.out.println(protectedMethod());
        System.out.println(defaultMethod());
        System.out.println(callPrivateMethod());
    }
}
