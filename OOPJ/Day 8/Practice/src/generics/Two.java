package generics;

public class Two implements MyGenInterface<String >{
        String obj;

    public Two(String obj) {
        this.obj = obj;
    }

    @Override
    public String myFun() {
        return this.obj;
    }

    @Override
    public void anotherFun(String a) {
        System.out.println(a);
    }
}
