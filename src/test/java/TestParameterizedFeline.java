import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Feline;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestParameterizedFeline {
    private final int kittensCount;
    private final int expectKittensCount;


    public TestParameterizedFeline(int kittensCount, int expectKittensCount) {
        this.kittensCount = kittensCount;
        this.expectKittensCount = expectKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getCountKittens() {
        return new Object[][]{
                {1, 1},
                {2, 2}
        };
    }

    @Test
    public void checkGetCountKittens() {
        Feline feline = new Feline();
        assertEquals(expectKittensCount, feline.getKittens(expectKittensCount));
    }
}
