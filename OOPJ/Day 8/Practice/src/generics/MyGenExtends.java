package generics;

public class MyGenExtends <T extends Number>{
    T obj;

    public MyGenExtends(T obj) {
        this.obj = obj;
    }
    T getObj(){
        return obj;
    }
}
