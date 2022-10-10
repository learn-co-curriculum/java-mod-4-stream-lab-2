import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

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
    void printStringLengths1() {
            Task1.printStringLengths(Arrays.asList("John", "Joe", "Al", "Kate" ));
            assertEquals("4\n3\n2\n4", outputStreamCaptor.toString().trim());
    }

    @Test
    void printStringLengths2() {
        Task1.printStringLengths(Arrays.asList("a", "bc", "def" ));
        assertEquals("1\n2\n3", outputStreamCaptor.toString().trim());
    }

}