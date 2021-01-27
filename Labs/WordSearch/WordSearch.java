package Labs.WordSearch;

import java.util.regex.*;
import java.util.Arrays;

public class WordSearch {
    private String[][] arr; 

    public WordSearch(int row, int col) {
        this.arr = new String[row][col]; 
    }

    public void setSpot(String s, int row, int col) {
        this.arr[row][col] = s;
    }

    public boolean inGrid(String s) {
        boolean inGrid;
        String temp = "";
        for (int i = 0; i < this.arr.length; i++) {
            for (String x: this.arr[i]) {
                temp += x;
            }
            inGrid = Pattern.compile(s, Pattern.CASE_INSENSITIVE).matcher(temp).find();
            if (inGrid == true) return true;
            
            temp = this.reverseString(temp);
            inGrid = Pattern.compile(s, Pattern.CASE_INSENSITIVE).matcher(temp).find();
            if (inGrid == true) return true;
        }
        
        for (int x = 0; x < this.arr.length; x++) {
            if (x == 15) break;
            temp = "";
            for (int y = 0; y < this.arr.length; y++) {
                temp += this.arr[y][x];
            }

            inGrid = Pattern.compile(s, Pattern.CASE_INSENSITIVE).matcher(temp).find();
            if (inGrid == true) return true;

            temp = this.reverseString(temp);
            inGrid = Pattern.compile(s, Pattern.CASE_INSENSITIVE).matcher(temp).find();
            if (inGrid == true) return true;
        }
        return false;
    }

    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        return sb.toString();
    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.arr)
            .replace("], ", "]\n")
            .replace(",", " ")
            .replace("[", "[ ")
            .replace("]", " ]")
            .replace("[ [ ", "[ ")
            .replace("] ]", "]");
    }
}
