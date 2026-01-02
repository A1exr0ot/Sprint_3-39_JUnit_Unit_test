import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AgeValidatorParamTest {
    private AgeValidator ageValidator = new AgeValidator();
    private int age;
    private boolean expected;

    public AgeValidatorParamTest(int age, boolean expected) {
        this.age = age;
        this.expected = expected;
    }

@Parameterized.Parameters(name = "Age: {0}, Expected: {1}")
public static Object[] getAge() {
        return new Object[][] {
                {18, true},
                {65, true},
                {17, false},
                {66, false},
                {19, true},
                {64, true},
                {-10, false},
                {0, false},
        };
}

    @Test
    public void testAge() {
        assertEquals(expected, ageValidator.isValidAge(age));
    }
}