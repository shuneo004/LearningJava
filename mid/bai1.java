import java.util.*;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        if (isInteger(input)) {
            int num = Integer.parseInt(input);
            int[] digits = convertToDigits(num);
            Arrays.sort(digits);
            boolean found = false;
            do {
                int swappedNum = swapDigits(digits);
                if (swappedNum % 45 == 0) {
                    System.out.println(swappedNum);
                    found = true;
                    break;
                }
            } while (nextPermutation(digits));
            if (!found)
                System.out.println("-1");
        } else {
            System.out.println("Chuỗi không phải là số nguyên.");
        }
    }

    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static int[] convertToDigits(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int swapDigits(int[] digits) {
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static boolean nextPermutation(int[] array) {
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }
        swap(array, i, j);
        reverse(array, i + 1);
        return true;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(int[] array, int start) {
        int i = start, j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }
}