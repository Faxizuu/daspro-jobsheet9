import java.util.Arrays;

public class ArrayBilangan11 {
    public static void main(String[] args) {
        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // for biasa
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // foreach
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        // Arrays.toString()
        System.out.println(Arrays.toString(bil));
    }
}