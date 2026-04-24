package inheritance;

public class Parent {
    String name = "Bhavesh";

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor " + name);

    }

    public Parent() {
    }

    void print(){
        System.out.println("Parent Method");
    }

}
