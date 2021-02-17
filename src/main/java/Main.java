import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        String str1 = "kasur";
        String str2 = "rusak";

        System.out.println(isAnagramSort(str1, str2));

    }

    static boolean isAnagramSort(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
