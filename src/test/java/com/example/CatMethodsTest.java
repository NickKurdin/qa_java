package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatMethodsTest {
    @Mock
    Cat cat;

    @Test
    public void checkCat() throws Exception {
        cat.getSound();
        Mockito.verify(cat).getSound();
        cat.getFood();
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    }

}
