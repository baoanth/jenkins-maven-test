/**
 * GradeConverter class for converting numeric scores to grades.
 */
public final class GradeConverter {

    /**
     * The maximum allowed score.
     */
    private static final int MAX_SCORE = 100;

    /**
     * The minimum allowed score.
     */
    private static final int MIN_SCORE = 0;

    /**
     * Minimum score for grade A.
     */
    private static final int MIN_A_SCORE = 90;

    /**
     * Minimum score for grade B.
     */
    private static final int MIN_B_SCORE = 80;

    /**
     * Minimum score for grade C.
     */
    private static final int MIN_C_SCORE = 70;

    /**
     * Minimum score for grade D.
     */
    private static final int MIN_D_SCORE = 60;

    /**
     * Minimum score for grade E.
     */
    private static final int MIN_E_SCORE = 50;

    /**
     * Converts a numeric score to a grade letter.
     *
     * @param score the numeric score
     * @return the letter grade or "Invalid"
     */
    public String convert(final int score) {
        if ((score > MAX_SCORE) || (score < MIN_SCORE)) {
            return "Invalid";
        } else if (score >= MIN_A_SCORE) {
            return "A";
        } else if (score >= MIN_B_SCORE) {
            return "B";
        } else if (score >= MIN_C_SCORE) {
            return "C";
        } else if (score >= MIN_D_SCORE) {
            return "D";
        } else if (score >= MIN_E_SCORE) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}
