package calculator;

/** Subtraction operation for the calculator. */
public class Sub implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
