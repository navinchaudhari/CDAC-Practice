package object;

public class GC {
    int roll;

    public GC(int roll) {
        System.out.println("GC object created");
        this.roll = roll;
    }

    /*protected void finalize(){
        System.out.println("Finalize called for student roll: " + this.roll);
    }*/
    AutoCloseable autoCloseable = new AutoCloseable() {
        @Override
        public void close() throws Exception {
            System.out.println("Finalize called for student roll: " + roll);
        }
    };
}
