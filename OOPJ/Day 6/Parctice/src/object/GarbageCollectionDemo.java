package object;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GC g1 = new GC(1);
        GC g2 = new GC(2);
        g2 = null; //Nullifying the references
        //System.gc();
        Runtime.getRuntime().gc(); // To explicitly call GC
    }
}
