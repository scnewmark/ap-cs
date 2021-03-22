package Labs.Hearts.tests;

import Labs.Hearts.*;

public class CardGameTest {
    public static void main(String[] args) {
        String [] names = {"Betty","Bob","Sue","Albert"};
        // game 2
        CardGame game = new CardGame("Hearts",4,names,0);
        System.out.println(">>> Printing game in TestCardGame");
        System.out.println(game);
        int total = 0;
        int cp1Score = 0, cp2Score = 0, cp3Score = 0, cp4Score = 0;
        for (int i=1; i <= 20000; i++) {
            game = new CardGame("Hearts", 4, names, 0);
            game.getDeckOfCards().shuffle();
            game.deal(13,0);
            game.deal(13,1);
            game.deal(13,2);
            game.deal(13,3);
            game.playGame();
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    cp1Score += game.getPlayers().get(j).getScore();
                }
                if (j == 1) {
                    cp2Score += game.getPlayers().get(j).getScore();
                }
                if (j == 2) {
                    cp3Score += game.getPlayers().get(j).getScore();
                }
                if (j == 3) {
                    cp4Score += game.getPlayers().get(j).getScore();
                }
                total += game.getPlayers().get(j).getScore();
            }
        }
        System.out.println(">>> Printing Total Score and Player % in TestCardGame");
        System.out.println("Total Score = " + total);
        double percent;

        percent = ((int) ((cp1Score /(double) total) * 10000))/ 100.0;
        System.out.println("Player 1" + " " + percent + "%");

        percent = ((int) ((cp2Score /(double) total) * 10000))/ 100.0;
        System.out.println("Player 2" + " " + percent + "%");
        percent = ((int) ((cp3Score /(double) total) * 10000))/ 100.0;
        System.out.println("Player 3" + " " + percent + "%");
        percent = ((int) ((cp4Score /(double) total) * 10000))/ 100.0;
        System.out.println("Player 4" + " " + percent + "%");
    }
}
