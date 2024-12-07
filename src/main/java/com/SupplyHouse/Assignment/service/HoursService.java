package com.SupplyHouse.Assignment.service;

import com.SupplyHouse.Assignment.model.RegularHours;
import com.SupplyHouse.Assignment.model.SpecialHours;

import java.util.List;

public interface HoursService {
    List<RegularHours> getRegularHours();

    List<SpecialHours> getSpecialHours();

    SpecialHours addSpecialHours(SpecialHours specialHours);
}