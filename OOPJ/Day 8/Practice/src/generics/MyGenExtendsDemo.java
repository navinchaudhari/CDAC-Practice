package generics;

public class MyGenExtendsDemo{
    public static void main(String[] args) {
        MyGenExtends<Integer> iobj =  new MyGenExtends<>(100);
        Integer obj = iobj.getObj();
//        MyGenExtends<String> sobj = new MyGenExtends<String>("Welcome");
        MyGenExtends<Double> dobj = new MyGenExtends<>(34.78);
        Double obj1 = dobj.getObj();


        System.out.println(obj);
        System.out.println(obj1);
    }
}
