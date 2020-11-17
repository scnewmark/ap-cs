package AliceCount;

import java.util.regex.*;
import java.util.*;
import java.io.*;

public class AliceCount {
    final static String ROOT_PATH = "/Users/scnewmark/Desktop/school/CompSci/Java/AliceCount/";
    public static boolean match(String a, String b) { return Pattern.compile(a, Pattern.CASE_INSENSITIVE).matcher(b).find(); }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(ROOT_PATH + "alice.txt"));
        PrintWriter out = new PrintWriter(new FileOutputStream(ROOT_PATH + "words.txt"));

        int totalWords = 0;
        double e = 0, t = 0, a = 0, o = 0, i = 0;

        while (in.hasNext()) {
            String word = in.next();

            if (match("[etaoi]", word)) {
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
        Character[] chars = { 'e', 't', 'a', 'o', 'i' };
        Double[] doubles = { e, t, a, o, i };
        for (int index = 0; index < chars.length; index++) { percents.put(chars[index], doubles[index]); }

        Set<Character> keys = percents.keySet();
        for (Character key: keys) { System.out.println("Percentage of words containing the letter '" + key + "' is " + Math.round((percents.get(key) / totalWords) * 10000.0) / 100.0 + "%"); }

        out.close();
    }
}
