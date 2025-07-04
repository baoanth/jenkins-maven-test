import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for GradeConverter.
 */
public class GradeConverterTest {

    private GradeConverter converter;

    private static final int SCORE_A = 100;
    private static final int SCORE_A_MIN = 90;
    private static final int SCORE_B = 80;
    private static final int SCORE_C = 70;
    private static final int SCORE_D = 60;
    private static final int SCORE_E = 50;
    private static final int SCORE_INVALID_HIGH = 101;
    private static final int SCORE_INVALID_LOW = -10;

    @Before
    public void setUp() {
        converter = new GradeConverter();
    }

    /**
     * Test convert A grade.
     */
    @Test
    public void testConvertA() {
        assertEquals("A", converter.convert(SCORE_A));
        assertEquals("A", converter.convert(SCORE_A_MIN));
    }

    /**
     * Test convert B grade.
     */
    @Test
    public void testConvertB() {
        assertEquals("B", converter.convert(SCORE_B));
    }

    /**
     * Test convert C grade.
     */
    @Test
    public void testConvertC() {
        assertEquals("C", converter.convert(SCORE_C));
    }

    /**
     * Test convert D grade.
     */
    @Test
    public void testConvertD() {
        assertEquals("D", converter.convert(SCORE_D));
    }

    /**
     * Test convert E grade.
     */
    @Test
    public void testConvertE() {
        assertEquals("E", converter.convert(SCORE_E));
    }

    /**
     * Test invalid high score.
     */
    @Test
    public void testConvertInvalidHigh() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_HIGH));
    }

    /**
     * Test invalid low score.
     */
    @Test
    public void testConvertInvalidLow() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_LOW));
    }
}
