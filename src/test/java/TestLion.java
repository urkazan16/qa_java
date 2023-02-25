import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.praktikum.Feline;
import ru.yandex.praktikum.Lion;
import ru.yandex.praktikum.constants.TextAnimal;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Mock
    private Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean actual = lion.doesHaveMane();
        assertTrue(actual);
    }

    @Test
    public void checkNotHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean actual = lion.doesHaveMane();
        assertFalse(actual);
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(TextAnimal.LIST_PREDATOR);
        List<String> actual = lion.getFood();
        List<String> expected = TextAnimal.LIST_PREDATOR;
        assertEquals(expected, actual);
    }

    @Test
    public void checkExceptionByCreateLion() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage(TextAnimal.LION_TEXT_EXPECT_MESSAGE);
        Lion lion = new Lion(feline, "invalidGender");
    }

}
