
public class Expression {
    public static int count(int x, int y, String sign) {
        switch (sign) {
            case "+":
                return x + y;
            case "-":
                return  x - y;
            case "*":
                return  x * y;
            case "/":
                return  x / y;
            default: return 0;
        }
    }
}
