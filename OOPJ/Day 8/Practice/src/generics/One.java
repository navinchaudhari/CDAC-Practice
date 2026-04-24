package generics;

public class One <T> implements MyGenInterface{

    T obj;
    @Override
    public Object myFun() {
        return this.obj;
    }

    @Override
    public void anotherFun(Object a) {
        System.out.println(a);
    }

    public One(T obj) {
        this.obj = obj;
    }
}
