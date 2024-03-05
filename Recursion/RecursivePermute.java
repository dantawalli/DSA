import java.io.*;

class GFG {
    public static void main(String[] args) {
        String word = "ABC";
        int n = word.length();
        GFG permutation = new GFG();
        permutation.permute(word, 0, n - 1);
    }

    private void permute(String word, int l, int r) {
        if (l == r) {
            System.out.println(word);
        } else {
            for (int i = l; i <= r; i++) {
                word = swap(word, l, i); // Swap the characters at indices l and i
                permute(word, l + 1, r);
                word = swap(word, l, i); // Restore the original order before the next iteration
            }
        }
    }

    public static String swap(String word, int i, int j) {
        char[] charArray = word.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
