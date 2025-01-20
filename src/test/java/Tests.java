
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Tests
{
    @Test
    public void testDecodeDecimal() {
        assertEquals(Integer.valueOf(123), Integer.decode("123"));
    }

    @Test
    public void testDecodeHexadecimal() {
        assertEquals(Integer.valueOf(255), Integer.decode("0xFF"));
    }

    @Test
    public void testDecodeHexadecimalWithHash() {
        assertEquals(Integer.valueOf(255), Integer.decode("#FF"));
    }

    @Test
    public void testDecodeOctal() {
        assertEquals(Integer.valueOf(57), Integer.decode("071"));
    }

    @Test
    public void testDecodeNegativeDecimal() {
        assertEquals(Integer.valueOf(-123), Integer.decode("-123"));
    }

    @Test
    public void testDecodeNegativeHexadecimal() {
        assertEquals(Integer.valueOf(-255), Integer.decode("-0xFF"));
    }

    @Test
    public void testDecodeEmptyString() {
        assertThrows(NumberFormatException.class, () -> Integer.decode(""));
    }

    @Test
    public void testDecodeInvalidFormat() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("123abc"));
    }
}
