public class GradeConverter {
    public String convert(int score)  
    {
        final int MAX_SCORE = 100;
        final int A_SCORE = 90;
        final int B_SCORE = 80;
        final int C_SCORE = 70;
        final int D_SCORE = 60;
        final int E_SCORE = 59;
        final int MIN_SCORE = 0;

        if (score <= MAX_SCORE && score >= A_SCORE) {
            return "A";
        } else if (score < A_SCORE && score >= B_SCORE) {
            return "B";
        } else if (score < B_SCORE && score >= C_SCORE) {
            return "C";
        } else if (score < C_SCORE && score >= D_SCORE) {
            return "D";
        } else if (score < D_SCORE && score >= MIN_SCORE) {
            return "E";
        } else {
            return "Invalid";
        }
    }


}

