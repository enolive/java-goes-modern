import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumbersConverterTest {
    @Test
    void convertToEmpty() {
        var converter = new RomanNumbersConverter();
        assertThat(converter.toRoman(0)).isEmpty();
    }
}
