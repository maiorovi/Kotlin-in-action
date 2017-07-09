package kotlin_in_action.ch2

import org.junit.Test
import org.assertj.core.api.Assertions.*;

class ExpressionEvaluatorTest {

    @Test fun evaluatesNumberExprToThisNumber(){
        val number = Num(12)

        assertThat(eval(number)).isEqualTo(12)
    }

    @Test fun evaluatesSumOfTwoElements() {
        val expr = Sum(Num(12), Num(20))

        assertThat(eval(expr)).isEqualTo(32)
    }
}