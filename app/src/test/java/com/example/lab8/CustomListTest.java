package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomListTest {

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
    public void hasCityTest(){
        list = MockCityList();
        assertEquals(list.hasCity(list), false);

        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.hasCity(list), true);



    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();

        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);

        list.deleteCity("Estevan");
        assertEquals(list.getCount(), 0);



    }

    @Test
    public void countCityTest(){
        list = MockCityList();

        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.countCity(),1);
    }
}
