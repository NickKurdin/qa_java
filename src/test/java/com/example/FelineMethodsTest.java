package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineMethodsTest {

    @Mock
    Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
        Mockito.when(feline.getKittens()).thenReturn(1);
    }

    @Test
    public void checkGetKittensWithParam() throws Exception {
        feline.getKittens(5);
        Mockito.verify(feline).getKittens(5);
        Mockito.when(feline.getKittens()).thenReturn(5);
    }

    @Test
    public void checkEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void checkGetFamily() throws Exception {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
    }
}
