package object;

public class Second {
    int a;
    First f;
    Second(int a){
        this.a = a;
    }

    AutoCloseable autoCloseable = new AutoCloseable() {
        @Override
        public void close() throws Exception {
            System.out.println("Second Eligible for GC");
        }
    };
}
