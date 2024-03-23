package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMethodsTest {
    @Mock
    Lion lion;

    @Test
    public void checkLion() throws Exception {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
        lion.doesHaveMane();
        Mockito.when(lion.doesHaveMane()).thenReturn(true);
        lion.getFood();
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    }

}
