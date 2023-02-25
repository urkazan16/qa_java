package ru.yandex.praktikum;

import java.util.List;

public class Lion {

    private Feline feline;
    private boolean hasMane;

    public Lion(Feline feline, String sex) throws Exception {
        if ("Самец".equals(sex)) {
            this.feline = feline;
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.feline = feline;
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
