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
    public void checkGetKittens() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }
    @Test
    public void checkDoesHaveMane() throws Exception {
        lion.doesHaveMane();
        Mockito.when(lion.doesHaveMane()).thenReturn(true);
    }
    @Test
    public void checkGetFood() throws Exception {
        lion.getFood();
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    }

}
