import java.util.Scanner;

public class Calculation {
    private final RomeToArab romeToArab = new RomeToArab();
    int result;
    ArabOrRome aOr;

    public void go() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        String[] arrayOfExpression = expression.split(" ");
        String first;
        String second;
        String sign;

        if (arrayOfExpression.length == 3) {
            first = arrayOfExpression[0];
            sign = arrayOfExpression[1];
            second = arrayOfExpression[2];
        } else {
            throw new Exception("Неправильно введено выражение");
        }

        int firstNumber;
        int secondNumber;
        try {
            firstNumber = Integer.parseInt(first);
            secondNumber = Integer.parseInt(second);
            aOr = ArabOrRome.ARAB;
        } catch (Exception e) {
            aOr = ArabOrRome.ROME;
            firstNumber = romeToArab.convert(first);
            secondNumber = romeToArab.convert(second);
        }

        result = Expression.count(firstNumber, secondNumber, sign);

        System.out.println(aOr.equals(ArabOrRome.ARAB)
                ? "Результат: " + result
                : "Результат: " + new ArabToRome(result).getResult());
    }
}
