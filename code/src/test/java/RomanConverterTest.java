import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanConverterTest {
    @Test
    void convertToEmpty() {
        var converter = new RomanConverter();
        assertThat(converter.toRoman(0)).isEmpty();
    }
}
