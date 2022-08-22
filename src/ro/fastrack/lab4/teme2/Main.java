package ro.fastrack.lab4.teme2;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        countNr("cucubau", 'c');
        System.out.println(replaceStar("Paris"));
        containsText(new String[]{"Ana", "are", "mere"}, "are");
        splitPhrase("Ana are multe mere coapte");
        sensitiveWords("Ana are multe mere si mere bune", new String[]{"mere", "Ana"});

    }

    public static void countNr(String s, char t) {
        int c = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == t) {
                c = c + 1;
            }
        System.out.println("Litera " + t + " apare de " + c + " ori in stringul " + s);
    }

    public static String replaceStar(String s) {
        int t = s.length();
        s = s.replaceAll(".", "*");
        return s;
        //System.out.println(s1);
        //  System.out.println(t);
        //for (int i=0;i<s.length();i=i+1){
        //   System.out.print("*");
        // }
    }

    public static boolean containsText(String[] s, String include) {
        boolean verificare = false;
        for (String x : s) {
            if (x.contains(include)) {
                verificare = true;
            }
        }
        return verificare;
    }

    public static void splitPhrase(String s) {
        String[] desfacut = s.split(" ");
        for (String p : desfacut) {
            System.out.print(p);
        }
    }

    public static void sensitiveWords(String s, String[] x) {
        String[] s1 = s.split(" ");
        String s2 = "";
        for (String q : s1) {
            for (String v : x) {
                s2 = s2 + q;
                if (containsText(s1, v)) {
                    s2 = s2 + replaceStar(s);

                }
            }
            System.out.println(s2);

        }
    }
}
