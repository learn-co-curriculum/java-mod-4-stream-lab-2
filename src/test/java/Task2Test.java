import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void printAbsolute1() {
        Task2.printAbsolute(Arrays.asList(5, -2, 50, -26));
        assertEquals("5\n2\n50\n26", outputStreamCaptor.toString().trim());

    }

    @Test
    void printAbsolute2() {
        Task2.printAbsolute(Arrays.asList(-4,-0));
        assertEquals("4\n0", outputStreamCaptor.toString().trim());
    }

}