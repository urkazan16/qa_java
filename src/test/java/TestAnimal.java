import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.praktikum.Animal;
import ru.yandex.praktikum.constants.TextAnimal;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestAnimal {

    @Mock
    private Animal animal;

    @Test
    public void checkAnimalFamily() {
        Animal animal = new Animal();
        String familyText = animal.getFamily();
        String expectedFamilyText = TextAnimal.FAMILY_TEXT;
        Assert.assertEquals(expectedFamilyText, familyText);
    }

    @Test
    public void checkGetFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> actualAnimal = animal.getFood(TextAnimal.ANIMAL_HERBIVORE);
        List<String> expectedAnimal = TextAnimal.LIST_HERBIVORES;
        Assert.assertEquals(expectedAnimal, actualAnimal);
    }

    @Test
    public void checkGetFoodPredator() throws Exception {
        Animal animal = new Animal();
        List<String> actualAnimal = animal.getFood(TextAnimal.ANIMAL_PREDATOR);
        List<String> expectedAnimal = TextAnimal.LIST_PREDATOR;
        Assert.assertEquals(expectedAnimal, actualAnimal);
    }

    @Test
    public void checkGetFoodOmnivores() {
        try {
            Animal animal = new Animal();
            animal.getFood(TextAnimal.ANIMAL_OMNIVORES);
            Assert.fail(TextAnimal.TEXT_EXPECTED);
        } catch (Exception ex) {
            Assert.assertEquals(TextAnimal.ANIMAL_TEXT_EXPECT_MESSAGE, ex.getMessage());
        }
    }
}
