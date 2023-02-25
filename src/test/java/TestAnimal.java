import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import ru.yandex.praktikum.Animal;
import ru.yandex.praktikum.constants.TextAnimal;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAnimal {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Mock
    private Animal animal;

    @Test
    public void checkAnimalFamily() {
        Animal animal = new Animal();
        String familyText = animal.getFamily();
        String expectedFamilyText = TextAnimal.FAMILY_TEXT;
        assertEquals(expectedFamilyText, familyText);
    }

    @Test
    public void checkGetFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> actualAnimal = animal.getFood(TextAnimal.ANIMAL_HERBIVORE);
        List<String> expectedAnimal = TextAnimal.LIST_HERBIVORES;
        assertEquals(expectedAnimal, actualAnimal);
    }

    @Test
    public void checkGetFoodPredator() throws Exception {
        Animal animal = new Animal();
        List<String> actualAnimal = animal.getFood(TextAnimal.ANIMAL_PREDATOR);
        List<String> expectedAnimal = TextAnimal.LIST_PREDATOR;
        assertEquals(expectedAnimal, actualAnimal);
    }

    @Test
    public void checkGetFoodOmnivores() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage(TextAnimal.ANIMAL_TEXT_EXPECT_MESSAGE);
        Animal animal = new Animal();
        animal.getFood(TextAnimal.ANIMAL_OMNIVORES);
    }
}
