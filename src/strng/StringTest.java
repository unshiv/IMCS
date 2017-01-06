package strng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Manohar on 12/24/2016.
 */
public class StringTest {
    public static void main(String[] args) {
//        stringOperations();
        stringBuilderUsage();
    }

    private static void stringBuilderUsage() {
        String str1 = "Raj";
        String str2 = "Kumar";
        long salary = 5000;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str1);
        stringBuilder.append(str2);
        stringBuilder.append(salary);

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str1)
                .append(str2)
                .append(" has ")
                .append(salary);

        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder2.toString());
    }

    private static void stringOperations() {


        String str1 = "xyz";
        String str2 = "xyz";
        String str3 = new String("xyz");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        String str4 = str1 + " " + str3;
        String str5 = "Testing Program";
        System.out.println(str5.length());
        System.out.println(str5.substring(0, 7));
        System.out.println(str5.substring((str5.length() - 6), str5.length()));
        System.out.println(str5.contains("Program"));
        System.out.println(str5.charAt(8));
        System.out.println(str5.indexOf('P'));
        System.out.println(str5.toUpperCase());
        System.out.println(str5.toLowerCase());
        System.out.println(str5.equals(str3));
        System.out.println(str5.split(" "));
        System.out.println("101,Raj,5000".split(","));
        System.out.println(str5.concat(str3));
        System.out.println(str5.toString());
        System.out.println(String.valueOf(5000));
        String input = "%10s has %10d amount";
        System.out.println(String.format(input, "Manohar", 5000));

        final String str = "Hello\n" + "Batman,\n" + "Joker\n" + "here\n";
        final Pattern p = Pattern.compile("Joker");
        final Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println("Found match");
        }
    }
}
