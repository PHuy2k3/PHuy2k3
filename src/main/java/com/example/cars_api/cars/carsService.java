package com.example.cars_api.cars;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class carsService {
    public List<cars> getcars(){
        return List.of(
                new cars(
                        1L,"ABC","123",2024
                )
        );
    }
}
