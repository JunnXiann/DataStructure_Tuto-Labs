package Lab.Generics.Q1;

public class MyGeneric<E> {
    private E e;
    public MyGeneric() {
        // No-arg constructor
    }
    public MyGeneric(E e) {
        this.e = e;
    }
    public E getE() {
        return e;
    }
    public void setE(E e) {
        this.e = e;
    }
}