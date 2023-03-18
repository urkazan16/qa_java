import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.praktikum.Feline;
import ru.yandex.praktikum.Lion;
import ru.yandex.praktikum.constants.TextAnimal;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    @Mock
    private Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean actual = lion.doesHaveMane();
        Assert.assertTrue(actual);
    }

    @Test
    public void checkNotHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean actual = lion.doesHaveMane();
        Assert.assertFalse(actual);
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(TextAnimal.LIST_PREDATOR);
        List<String> actual = lion.getFood();
        List<String> expected = TextAnimal.LIST_PREDATOR;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkExceptionByCreateLion() {
        try {
            Lion lion = new Lion(feline, "invalidGender");
            Assert.fail("Expected Exception");
        } catch (Exception ex) {
            Assert.assertEquals(TextAnimal.LION_TEXT_EXPECT_MESSAGE, ex.getMessage());
        }
    }
}
