package Lab.Generics.Q3;

public class storePairGeneric<T> {
    private T first, second;

    public storePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = " + first + "second = " + second;
    }

    public Boolean equals() {
        return (first == second);
    }

    public <T extends Comparable<T>> T compareTo() {
        if (first.compareTo(second) > 0) {
            return first;
        } else {
            return second;
        }
    }
}
