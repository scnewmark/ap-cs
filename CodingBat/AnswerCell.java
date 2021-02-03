package CodingBat;

public class AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (isAsleep) ? false : (isMom) ? true : (isMorning) ? false : true;
    }

    public static void main(String[] args) {
        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));
    }
}
