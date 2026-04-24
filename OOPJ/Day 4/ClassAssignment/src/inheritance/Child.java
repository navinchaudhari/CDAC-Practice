package inheritance;

public class Child extends Parent {
    String name = "Navin";

    public Child(String name) {
        super(name);
        this.name = name;
        System.out.println("Child Constructor " + name);

    }

    public Child() {
    }
    void print(){
        System.out.println("Child Method");
    }


}
