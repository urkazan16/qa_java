import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import ru.yandex.praktikum.Feline;
import ru.yandex.praktikum.Lion;

@RunWith(Parameterized.class)
public class TestParameterizedLion {
    private final String sex;
    private final boolean hasMane;
    @Mock
    Feline feline;

    public TestParameterizedLion(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionFeline() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void checkGenderLion() throws Exception {
        Lion lion = new Lion(feline, sex);
        Boolean hasManeBoolean = lion.doesHaveMane();
        Assert.assertEquals(hasManeBoolean, hasMane);
    }
}
