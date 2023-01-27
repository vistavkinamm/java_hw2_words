
public class java_hw2_words {
    // Напишите программу, чтобы найти вхождение в строке
    // (содержащей все символы другой строки).
    
    public static void main(String[] args) {
        word("Kenguru", "engu");
    }

    public static void word(String s1, String s2){
        System.out.println(s1.contains(s2));
    }
    // Напишите программу, чтобы проверить, являются ли две данные строки 
    // вращением друг друга (вхождение в обратном порядке).

    public static boolean searchPalindrom(String s1 , String s2){
        return s1.equals(new StringBuilder(s2).reverse().toString());
        
    }

    // *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

    public static String reverseStr(String str){
        if (str.length() <=1){
            return str;
        }
        return reverseStr(str.substring(1) + str.charAt(0));
    }


}