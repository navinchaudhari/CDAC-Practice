package generics;

public class MyGen1 <T>{
   T ob;
    double d;

    public MyGen1(T ob) {
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
}
