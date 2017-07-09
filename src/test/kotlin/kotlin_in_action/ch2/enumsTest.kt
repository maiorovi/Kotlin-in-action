package kotlin_in_action.ch2

import org.junit.Test
import org.assertj.core.api.Assertions.*;
import kotlin_in_action.ch2.Color.*;
import kotlin_in_action.ch2.Color.Companion.getWarmth;
import kotlin_in_action.ch2.Color.Companion.getMnemonic;
import kotlin_in_action.ch2.Color.Companion.mix;

class EnumsTest {

    @Test fun computesRgbValueForSelectedColor() {
        assertThat(BLUE.rgb()).isEqualTo(255)
    }

    @Test fun returnsAssosiationToProvidedColor() {
        assertThat(getMnemonic(Color.RED)).isEqualTo("Richard")
    }

    @Test fun returnsWarmthOfProvidedColor() {
        assertThat(getWarmth(Color.RED)).isEqualTo("warm")
    }

    @Test
    fun mixOfRedAndBlueProduceOrange() {
        assertThat(mix(Color.RED, Color.YELLOW)).isEqualTo(Color.ORANGE)
    }
}