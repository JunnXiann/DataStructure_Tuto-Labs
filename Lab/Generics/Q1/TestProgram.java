package Lab.Generics.Q1;

public class TestProgram {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        strObj.setE("Hello");
        MyGeneric<Integer> intObj = new MyGeneric<>(42);
        System.out.println("strObj value: " + strObj.getE());
        System.out.println("intObj value: " + intObj.getE());
    }
}
