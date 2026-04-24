package Singleton;

public class First {
    int a = 10;
    private static First fObj;

    private First(){
        //System.out.println("First Obj created");
    }

    static First getInstance(){

        //return Singleton Object
        if(fObj == null){
            fObj = new First();
        }
        return fObj;
    }

    void print(){
        System.out.println(a);
    }
}
