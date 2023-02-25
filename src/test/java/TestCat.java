import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.praktikum.Cat;
import ru.yandex.praktikum.Feline;
import ru.yandex.praktikum.constants.TextAnimal;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Mock
    private Feline feline;

    @Test
    public void checkSoundCat() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void checkCatFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(TextAnimal.LIST_PREDATOR);
        List<String> actual = cat.getFood();
        List<String> expected = TextAnimal.LIST_PREDATOR;
        assertEquals(expected, actual);
    }
}
