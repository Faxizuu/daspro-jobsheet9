import java.util.Arrays;

public class ArrayBilangan11 {
    public static void main(String[] args) {
        int[] bil = {5, 13, -7, 17};

        // for biasa
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }

        // foreach
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        // Arrays.toString()
        System.out.println(Arrays.toString(bil));
    }
}