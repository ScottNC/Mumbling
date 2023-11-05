import static org.junit.jupiter.api.Assertions.*;

public class AccumulTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void accum() {
        testing(Accumul.accum("A"), "A");
        testing(Accumul.accum("B"), "B");
        testing(Accumul.accum("c"), "C");
    }
}