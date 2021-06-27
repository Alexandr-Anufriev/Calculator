import java.io.IOException;

public class RomeToArab {
    private static final String[] str = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public Integer convert(String s) throws IOException {
        for (int i = 0; i < str.length; i++) {
            if (s.equals(str[i])) {
                return i + 1;
            }
        }
        throw new IOException("Некорректное введение римских цифр");
    }
}







