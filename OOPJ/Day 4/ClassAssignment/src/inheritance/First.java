package inheritance;

public class First {

    void anotherFun(){
        System.out.println("Another Fun of First");

    }

    void oneFun(){
        System.out.println("One Fun of First");
        anotherFun();
    }
}
