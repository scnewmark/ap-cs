package AliceCount;

import java.util.regex.*;
import java.util.*;
import java.io.*;

public class AliceCount {
    final static String ROOT_PATH = "/Users/scnewmark/Desktop/school/CompSci/Java/AliceCount/";
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

            boolean containsE = Pattern.compile("e", Pattern.CASE_INSENSITIVE).matcher(word).find();
            boolean containsT = Pattern.compile("t", Pattern.CASE_INSENSITIVE).matcher(word).find();
            boolean containsA = Pattern.compile("a", Pattern.CASE_INSENSITIVE).matcher(word).find();
            boolean containsO = Pattern.compile("o", Pattern.CASE_INSENSITIVE).matcher(word).find();
            boolean containsI = Pattern.compile("i", Pattern.CASE_INSENSITIVE).matcher(word).find();

            if (containsE || containsT || containsA || containsO || containsI) {
                if (containsE) {
                    e++;
                }
                if (containsT) {
                    t++;
                }
                if (containsA) {
                    a++;
                }
                if (containsO) {
                    o++;
                }
                if (containsI) {
                    i++;
                }
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
        for (Character key: keys) {
            System.out.println("Percentage of words containing the letter '" + key + "' is " + Math.round((percents.get(key) / totalWords) * 10000.0) / 100.0 + "%");
        }

        out.close();

    }
}
