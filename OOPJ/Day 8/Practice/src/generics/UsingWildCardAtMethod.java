package generics;

public class UsingWildCardAtMethod<T> {
    T obj;

    public UsingWildCardAtMethod(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return obj;
    }

    <T1> void myFun(T1 t1) {
        System.out.println(t1);
    }

    void myFirstFun(T obj) {

    }

    void mySecondFun(MyGen<T> obj) {

    }

    void myThirdFun(MyGen<?> obj) {

    }

    void myFourthFun(MyGen<? extends Number> obj) {

    }

    public static void main(String[] args) {
        UsingWildCardAtMethod<String> obj = new UsingWildCardAtMethod<>("Navin");
        String obj1 = obj.getObj();
        System.out.println(obj1);

        obj.myFun("Welcome");


    }
}
