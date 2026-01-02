public class AgeValidator {
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 65;

    public boolean isValidAge(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }
}
