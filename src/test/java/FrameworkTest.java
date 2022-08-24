import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrameworkTest {

    @Test
    public void successfully_test_testing_framework() {
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
    }

    @Test
    public void assertion_should_fail() {
        Assertions.fail();
    }
}
