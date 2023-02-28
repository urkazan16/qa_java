import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.praktikum.Feline;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    private Feline feline;

    @Before
    public void initFeline() {
        feline = new Feline();
    }

    @Test
    public void checkEatMeat() throws Exception {
        List<String> actualSize = feline.eatMeat();
        int expectSize = 3;
        Assert.assertEquals(expectSize, actualSize.size());
    }

    @Test
    public void checkFamilyFeline() {
        String actualFamily = feline.getFamily();
        String expectFamily = "Кошачьи";
        Assert.assertEquals(expectFamily, actualFamily);
    }

    @Test
    public void checkKittens() {
        int actualKittens = feline.getKittens();
        int expectKittens = 1;
        Assert.assertEquals(expectKittens, actualKittens);
    }
}
