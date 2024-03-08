package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }


    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void testHasCity() {
        CustomList list = MockCityList(); // Assuming MockCityList() initializes the list with some cities
        list.addCity(new City("Estevan", "SK"));
        Assertions.assertTrue(list.hasCity("Estevan"));
        Assertions.assertFalse(list.hasCity("NonExistentCity"));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = MockCityList();
        list.addCity(new City("Moose Jaw", "SK"));
        assertTrue(list.hasCity("Moose Jaw"));
        list.deleteCity("Moose Jaw");
        assertFalse(list.hasCity("Moose Jaw"));
    }
    @Test
    public void testCountCities() {
        CustomList list = MockCityList();
        list.addCity(new City("Saskatoon", "SK"));
        list.addCity(new City("Regina", "SK"));
        assertEquals(2, list.countCities());
    }




}
