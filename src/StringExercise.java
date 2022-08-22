import javax.swing.*;
import java.util.Locale;

public class StringExercise {
    public static void main(String[] args) {
        System.out.println("Helllo World");
        String s = "abc";
        String r = "abc";
        String q = "ab" + "c";
        System.out.println(s == r);

        // length of a string
        System.out.println(s.length());

        // get part of a string
        String substring = s.substring(1);
        System.out.println(substring);

        // first 5 caracters

        String substring1 = s.substring(0, 1);
        System.out.println(substring1);

        // all uppercase
        String s1 = s.toUpperCase(Locale.ROOT);
        System.out.println(s1);

        String extraSpaces = "Rain       ";
        System.out.println(extraSpaces.trim());
        System.out.println(extraSpaces);

        String fullName = "Ioan Pop Mihai";
        String[] s2 = fullName.split(" ");
        for (String z : s2) {
            System.out.println(z);
        }
         for(int i=0; i<s2.length-1; i++){
            if((i>0)&&(i<s2.length))
         s2[i]=s2[i].substring(0,1)+".";
    }
        for(String m:s2){
            System.out.println(m);
        }

        System.out.println(s.indexOf("c"));

        System.out.println(s.contains("a"));

        // replacing lowercases with 0 - works with uppercases as well
        System.out.println(s.replaceAll("[a-z]","0"));

        // replacing numbers with
        String cucu = "123cc";
        System.out.println(cucu.replaceAll("[0-9]","*"));

        String format = String.format("%s has received %d apples and shared %d with %s","Ana",14,5,"Marcel");
        System.out.println(format);

        String number = "10";
        int i = Integer.parseInt(number);
        System.out.println(i);
    }
}
