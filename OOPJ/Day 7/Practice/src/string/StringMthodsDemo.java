package string;

public class StringMthodsDemo {
    public static void main(String[] args) {
        String str = "Welcome to CDAC";
        String str2 =  "Welbome to CDAC";
        char char1[] = new char[10];
        //charAt(index)
        System.out.println(str.charAt(3)); // It returns character at 3rd index

        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        str.getChars(2,9,char1,2);
        /*for (char c1: char1){
            System.out.print(c1 + " ");
        }*/
        //output -> "    l c o m e  t "

        //getBytes() -> return ascii value of characters
        byte[] bytes = str.getBytes();
        /*for (byte b : bytes){
            System.out.print(b+" ");
        }*/

        char[] charArray = str.toCharArray();
        /*for (char c : charArray){
            System.out.print(c + " ");
        }*/

        //compareTo() => compare lexigraphically and return int
        int i = str.compareTo(str2);
        System.out.println(i);

       /* System.out.println(str.substring(5));
        System.out.println(str.substring(5, 7));
        System.out.println(str.subSequence(2,5));*/

        String replace = str.replace('e', 't');
        System.out.println(replace);

        String s = str.replaceFirst("co", "do");
        System.out.println(s);

        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf("AC"));
        System.out.println(str.isEmpty());

        str = "     ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        String join = String.join(" *---* ", s, str2);
        System.out.println(join);

       /* String s4 = "13/12/2001";
        String[] split = s4.split("/");
        for (String s2 : split){
            System.out.println(s2);
        }*/

        StringBuffer stb = new StringBuffer("Welcome");
        stb.insert(0,"Java");
        System.out.println(stb);

    }
}
