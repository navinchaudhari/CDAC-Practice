package generics;

public class MyGen <T>{
   Object ob;
    double d;

    public MyGen(Object ob) {
        this.ob = ob;
    }

    Object getOb(){
        return ob;
    }
}
