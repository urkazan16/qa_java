import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Animal;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestParameterizedAnimal {

    private final String animalKindText;
    private final List<String> animalKindList;

    public TestParameterizedAnimal(String animalKindText, List<String> animalKindList) {
        this.animalKindText = animalKindText;
        this.animalKindList = animalKindList;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodAnimal() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения", "")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void checkFoodAnimal() throws Exception {
        Animal animal = new Animal();
        List<String> expectedAnimal = animal.getFood(animalKindText);
        int actual = expectedAnimal.size();
        assertEquals(expectedAnimal.size(), actual);
    }

}
