import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import site.acatech.service.CalculatorService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private  CalculatorService calculatorService;

    @BeforeEach
    void initCalculator() {
        calculatorService = new CalculatorService();
    }

    @AfterEach
    void underCalculator() {
        calculatorService = null;
    }

    @Test
    void testAdditionPositiveNumbers() {
        // ARRANGE
        long a = 12L;
        long b = 17L;

        // CalculatorService calculatorService = new CalculatorService();

        // ACT
        long somme = calculatorService.add(a, b);

        // ASSERT

        //assertEquals(29, somme);
        assertThat(somme).isEqualTo(29);

    }

    @Test
    void testMultiplyPositiveNumbers() {
        // ARRANGE
        long a = 10L;
        long b = 17L;

        // CalculatorService calculatorService = new CalculatorService();

        // ACT
        long multiply = calculatorService.multiply(a, b);

        // ASSERT
        assertEquals(170, multiply);
    }
}
