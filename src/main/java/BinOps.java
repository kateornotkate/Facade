public class BinOps {
    public String sum(String a, String b) {
        // переведем числа из двоичной записи в строках в int и сложим их;
        int result = Integer.parseInt(a, 2)
                + Integer.parseInt(b, 2); // парсинг чисел из двоичной записи Integer.parseInt(binStr, 2);
        // переведем получившееся число обратно в двоичную запись;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        // переведем числа из двоичной записи в строках в int и перемножем их;
        int result = Integer.parseInt(a, 2)
                * Integer.parseInt(b, 2); // парсинг чисел из двоичной записи Integer.parseInt(binStr, 2);
        // переведем получившееся число обратно в двоичную запись;
        return Integer.toBinaryString(result);
    }
}