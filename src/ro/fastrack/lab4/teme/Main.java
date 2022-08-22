package ro.fastrack.lab4.teme;

import java.util.Random;

public class Main{
    public static void main(String[] args){
        String [] s = new String[]{"Ana","Marcela","Patrocle","Gigel","Andrei","Alexandru"};

       // letterA(s);
       // containsText(s);
        System.out.println(stringRep(s));
       // firstLetters(s);
       // randomLetters(s);
      abreViation("Ioan Pop Marcel");


    }

    static void letterA(String[] s){
        for (String x : s){
            if (x.startsWith("A")){
                System.out.println(x);
            }
        }
    }

    public static void containsText(String [] s){
        for (String x:s){
            if(x.contains("arc")){
                System.out.println(x);
            }
        }
    }

    public static String[] stringRep(String [] s){
        String[] result = new String[s.length];
        for(int i=0;i<s.length;i++){
            if (s[i]!=null){
                result[i]=s[i].replaceAll("r","*");
            }
        }
        return result;
    }

    public static void firstLetters(String [] s){
        for(String x :s){
            String t = x.substring(0,3);
            System.out.println(t);
        }
    }

    public static void randomLetters(String[] s){
        Random random = new Random();
        for(String x: s){
            char z = x.charAt(random.nextInt(x.length()));
            System.out.println(z);
        }
    }

    public static void abreViation(String fullName){
        String[] s2 = fullName.split(" ");
        for(int i=0; i<s2.length-1; i++){
            if((i>0)&&(i<s2.length))
                s2[i]=s2[i].charAt(0)+".";
        }
        for(String m:s2){
            System.out.print(m + " ");
        }
        }

}











