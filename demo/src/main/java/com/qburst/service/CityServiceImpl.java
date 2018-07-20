package com.qburst.service;

import com.qburst.dao.CityRepository;
import com.qburst.dto.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepo;

    @Override
    public List<City> findAll() {
        List<City> cities = (List<City>)cityRepo.findAll();
        return cities;
    }
}
