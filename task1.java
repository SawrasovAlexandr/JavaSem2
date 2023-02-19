
public class task1 {

public static void main(String[] args) {
    System.out.println(buildString(6, 'a', 'b')); // ababab

    System.out.println(strRLE("aaaabbbcdd"));
    }
    
    /**
    * Дано четное число N (>0) и символы c1 и c2.
    * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    */
    private static String buildString(int n, char first, char second) {
        String str = new String();
        for (int i = 0; i < n; i++) {
            str += (i % 2 == 0) ? first : second;
        }
        return str;
    }
    
    /**
     * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. результат - a4b3cd2
     */
    private static String strRLE(String str) {
        if (str == "") return str;
        String rle = new String();
        rle += str.charAt(0);
        Integer count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) count++;
            else {
                rle += (count == 1) ? str.charAt(i) : Integer.toString(count) + str.charAt(i);
                count = 1;
            }
        }
        if (count > 1) rle += count;
        return rle;
    }
}