package Lab.Generics.Q3;

public class TestProgram {
    public static void main(String[] args) {
        storePairGeneric<Integer> a = new storePairGeneric<Integer>(6, 4);
        storePairGeneric<Integer> b = new storePairGeneric<Integer>(2, 2);
        storePairGeneric<Integer> c = new storePairGeneric<Integer>(6, 3);

        a.compareTo();
    }
}
