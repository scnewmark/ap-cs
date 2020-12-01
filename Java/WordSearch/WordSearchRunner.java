package WordSearch;

import java.util.Scanner;
import java.io.*;

public class WordSearchRunner {
    final static String ROOT_PATH = "/Users/scnewmark/Desktop/school/CompSci/Java/WordSearch/";
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Word Search!\nStarting main");
        Scanner in = new Scanner(new File(ROOT_PATH + "words.txt"));
        int rows = 0, columns = 0;
        while (in.hasNextInt()) {
            if (rows == 0) rows = in.nextInt();
            else columns = in.nextInt();
        }
        WordSearch ws = new WordSearch(rows, columns);

        int row = 0, col = 0;
        while (in.hasNext()) {
            if (in.hasNextInt()) break;
            if (col == columns) {
                col = 0;
                row++;
            } else {
                ws.setSpot(in.next(), row, col);
                col++;
            }
        }
        System.out.println("Done with array");

        System.out.println(ws);
        while (in.hasNext()) {
            if (in.hasNextInt()) in.next();
            String str = in.next();
            System.out.println(str + " - " + ws.inGrid(str));
        }
    }
}
