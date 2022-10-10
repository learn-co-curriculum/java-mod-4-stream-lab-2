import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {

    @Test
    void sumAbsolute1() {
        assertEquals(83, Task3.sumAbsolute(Arrays.asList(5, -2, 50, -26)));
    }

    @Test
    void printAbsolute2() {
        assertEquals(4, Task3.sumAbsolute(Arrays.asList(-4)));
    }

    @Test
    void printAbsolute3() {
        assertEquals(0, Task3.sumAbsolute(new ArrayList()));
    }

}