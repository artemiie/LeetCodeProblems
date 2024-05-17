package leetcode.problems.test1;

class Parent {
    static void staticMethod() {
        System.out.println("Parent static");
    }

    void nonStaticMethod() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child static");
    }

    void nonStaticMethod() {
        System.out.println("Child");
    }
}

class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentChild = new Child();
        Child child = new Child();

        parent.staticMethod();              // Parent static
        parentChild.staticMethod();         // Parent static
        child.staticMethod();               // Child static

        parent.nonStaticMethod();           // Parent
        parentChild.nonStaticMethod();      // Child
        child.nonStaticMethod();            // Child
    }
}

