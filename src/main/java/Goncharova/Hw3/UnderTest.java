package Goncharova.Hw3;

public class UnderTest {

    public int[] m1(int[] arr) throws RuntimeException {

        int i = 0;
        int[] res = new int[0];
        boolean f = false;

        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                f = true;
                break;
            }
        }

        if (f == false) {
            throw new RuntimeException();
        }

        res = new int[arr.length - i - 1];

        for (int k = (i + 1), n = 0; k < arr.length; k++, n++) {
            res[n] = arr[k];
        }

        return res;
    }

    public boolean m2(int[] arr) {
        boolean f1 = false;
        boolean f2 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                f1 = true;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                f2 = true;
                break;
            }
        }

        return f1 && f2;
    }
}
