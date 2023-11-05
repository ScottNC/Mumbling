import java.util.stream.IntStream;

public class Accumul {
    public static String accum(String s) {
        return String.join("-", IntStream.range(0, s.length())
                .mapToObj(index -> mumbleCharacter(s.charAt(index), index))
                .toArray(String[]::new));
    }

    private static String mumbleCharacter(char c, int index) {
        return "%s%s".formatted(String.valueOf(c).toUpperCase(), String.valueOf(c).toLowerCase().repeat(index));
    }
}
