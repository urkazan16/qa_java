import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Animal;

import java.util.List;

@RunWith(Parameterized.class)
public class TestParameterizedAnimal {

    private final List<String> animalKindList;
    private final String animalKindText;


    public TestParameterizedAnimal(String animalKindText, List<String> animalKindList) {
        this.animalKindList = animalKindList;
        this.animalKindText = animalKindText;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodAnimal() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test   /// ?
    public void checkFoodAnimal() throws Exception {
        Animal animal = new Animal();
        List<String> expectedAnimal = animal.getFood(animalKindText);
        Assert.assertEquals(animalKindList, expectedAnimal);
    }

}
