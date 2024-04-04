public class MergeArrays {
    public static void main(String[] args) {
        int[] X = {2, 8, 13, 15, 20, -1, -1, -1, -1};
        int[] Y = {5, 7, 9, 25};
        mergeArrays(X, Y, 5, Y.length);
        System.out.println("Merged array:");
        for (int num : X) {
            System.out.print(num + " ");
        }
    }

    public static void mergeArrays(int[] X, int[] Y, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        
        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }

        
        while (j >= 0) {
            X[k--] = Y[j--];
        }
    }
}
