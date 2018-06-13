import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumbersConverterTest {
    @Test
    void convertToEmpty() {
        var converter = new RomanNumbersConverter();
        String result = converter.toRoman(0);
        assertThat(result).isEmpty();
    }
}
