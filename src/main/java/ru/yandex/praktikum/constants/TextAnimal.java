package ru.yandex.praktikum.constants;

import java.util.Arrays;
import java.util.List;

public class TextAnimal {
    public static final String FAMILY_TEXT = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    public static final String ANIMAL_HERBIVORE = "Травоядное";
    public static final String ANIMAL_PREDATOR = "Хищник";
    public static final String ANIMAL_OMNIVORES = "Всеядные";
    public static final List LIST_PREDATOR = Arrays.asList("Животные", "Птицы", "Рыба");
    public static final List LIST_HERBIVORES = Arrays.asList("Трава", "Различные растения");
    public static final String ANIMAL_TEXT_EXPECT_MESSAGE = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    public static final String LION_TEXT_EXPECT_MESSAGE = "Используйте допустимые значения пола животного - самей или самка";
}
