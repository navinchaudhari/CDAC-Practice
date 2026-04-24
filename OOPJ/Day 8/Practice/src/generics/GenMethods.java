package generics;

public class GenMethods <T>{

    T obj;

    public GenMethods(T obj) {
        this.obj = obj;
    }
    T getObj(){
        return obj;
    }

    <T1, T2> void myFun(T1 t, T2 t2){
    }

    public static void main(String[] args) {
        GenMethods<Integer> mg1 = new GenMethods<>(12);
        Integer obj1 = mg1.getObj();
        System.out.println(obj1);
    }
}
