package AliceCount;

import java.util.regex.*;
import java.util.*;
import java.io.*;

public class AliceCount {
    final static String ROOT_PATH = "/Users/scnewmark/Desktop/school/CompSci/Java/AliceCount/";
    public static boolean match(String s, String m) { return Pattern.compile(s, Pattern.CASE_INSENSITIVE).matcher(m).find(); }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(ROOT_PATH + "alice.txt"));
        PrintWriter out = new PrintWriter(new FileOutputStream(ROOT_PATH + "out.txt"));

        int totalWords = 0;

        double e = 0;
        double t = 0;
        double a = 0;
        double o = 0;
        double i = 0;

        while (in.hasNext()) {
            String word = in.next();

            if (match("e", word) || match("t", word) || match("a", word) || match("o", word) || match("i", word)) {
                if (match("e", word)) { e++; }
                if (match("t", word)) { t++; }
                if (match("a", word)) { a++; }
                if (match("o", word)) { o++; }
                if (match("i", word)) { i++; }

                word = Pattern.compile("[^a-z\\-]", Pattern.CASE_INSENSITIVE).matcher(word).replaceAll("");
                out.println(word);
            }
            totalWords++;
        }
        
        System.out.println("Words with the letter 'e' = " + (int) e);
        System.out.println("Total number of Words = " + totalWords);

        LinkedHashMap<Character, Double> percents = new LinkedHashMap<Character, Double>();
        percents.put('e', e);
        percents.put('t', t);
        percents.put('a', a);
        percents.put('o', o);
        percents.put('i', i);

        Set<Character> keys = percents.keySet();
        for (Character key: keys) { System.out.println("Percentage of words containing the letter '" + key + "' is " + Math.round((percents.get(key) / totalWords) * 10000.0) / 100.0 + "%"); }

        out.close();

    }
}
