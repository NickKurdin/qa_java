package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class FelineMethodsTest {

    @Mock
    Feline feline;
    @Test
    public void checkFeline() throws Exception {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
        feline.getKittens(5);
        Mockito.verify(feline).getKittens();
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }
}
