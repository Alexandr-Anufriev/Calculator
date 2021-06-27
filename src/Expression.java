import java.io.IOException;

public class Expression {
    public static int count(int x, int y, String sign) throws IOException {
        switch (sign) {
            case "+":
                return x + y;
            case "-":
                return  x - y;
            case "*":
                return  x * y;
            case "/":
                return  x / y;
            default: throw new IOException("Некорректный знак вычисления");
        }
    }
}
