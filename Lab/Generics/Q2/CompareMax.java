package Lab.Generics.Q2;

public class CompareMax {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 7;
        Integer maxInt = maximum(x, y, z);
        System.out.println("Maximum integer value: " + maxInt);

        String a = "cat";
        String b = "dog";
        String c = "zebra";
        String maxString = maximum(a, b, c);
        System.out.println("Maximum string value: " + maxString);
    }
}
