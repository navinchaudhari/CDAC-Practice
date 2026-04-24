package object;

public class First {
    int a;
    Second s;
    First(int a){
        this.a = a;

    }

    AutoCloseable autoCloseable = new AutoCloseable() {
        @Override
        public void close() throws Exception {
            System.out.println("First Eligible for GC");
        }
    };
}
