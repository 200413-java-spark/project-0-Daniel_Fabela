package com.github.danielfabela.partpicker.components;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ComponentsTest {
    ComponentsFactory factory;

    @Before
    public void setup(){
        factory = ComponentsFactory.getInstance();
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPartsUnrecognizedThrowsException(){
        factory.getComponents("unknown", "unknown", "unknown");
    }

    @Test
    public void whenGettingTotalsfromWholeIntegersinPrice(){
        assertEquals(106.25, factory.getComponents("cpu", "Ryzen 5 3600", "100").TotalPrice(), 0);
        assertEquals(53.125, factory.getComponents("moth", "Asus B450-Plus", "50").TotalPrice(), 0);
        assertEquals(318.75, factory.getComponents("gpu", "EVGA RTX 2070 Super", "300").TotalPrice(), 0);
        assertEquals(127.50, factory.getComponents("ssd", "Samsung 970 Evo 1TB M.2", "120").TotalPrice(), 0);
    }

    @Test
    public void whenGettingTotalsfromDecimalsinPrice(){
        assertEquals(186.946875, factory.getComponents("cpu", "Ryzen 5 3600", "175.95").TotalPrice(), 0);
        assertEquals(148.946875, factory.getComponents("moth", "Asus B450-Plus", "139.99").TotalPrice(), 0);
        assertEquals(548.239375, factory.getComponents("gpu", "EVGA RTX 2070 Super", "515.99").TotalPrice(), 0);
        assertEquals(288.614375, factory.getComponents("ssd", "Samsung 970 Evo 1TB M.2", "265.99").TotalPrice(), 0);
    }
}