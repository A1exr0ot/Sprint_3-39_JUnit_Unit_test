import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

    public class AgeValidatorTest {
    private AgeValidator ageValidator = new AgeValidator();

    @Test
    public void testValidLowerBoundary() {
        assertTrue("ERROR", ageValidator.isValidAge(18));
    }

    @Test
    public void testValidAtUpperBoundary() {
        assertTrue(ageValidator.isValidAge(65));
    }

    @Test
    public void testInvalidAgeBelowLowerBoundary() {
        assertFalse(ageValidator.isValidAge(17));
    }

    @Test
    public void testInvalidAgeAboveUpperBoundary() {
        assertFalse(ageValidator.isValidAge(66));
    }

    @Test
    public void testAgeJustAboveLowerBoundary() {
        assertTrue(ageValidator.isValidAge(19));
    }

    @Test
    public void testAgeJustBelowUpperBoundary() {
        assertTrue(ageValidator.isValidAge(64));
    }

    @Test
    public void testNegativeAge() {
        assertFalse(ageValidator.isValidAge(-10));
    }

    @Test
    public void testZeroAge() {
        assertFalse(ageValidator.isValidAge(0));
    }
}