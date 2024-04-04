public class MaxSumPath {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 7, 10, 12};
        int[] arr2 = {1, 5, 7, 8};
        int maxSum = findMaxSumPath(arr1, arr2);
        System.out.println("Maximum sum path: " + maxSum);
    }

    public static int findMaxSumPath(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 = 0, maxSum = 0;
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                maxSum += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            sum1 += arr1[i++];
        }

        while (j < arr2.length) {
            sum2 += arr2[j++];
        }

        maxSum += Math.max(sum1, sum2);
        return maxSum;
    }
}
