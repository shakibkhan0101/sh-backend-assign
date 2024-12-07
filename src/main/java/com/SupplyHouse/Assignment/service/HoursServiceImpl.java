package com.SupplyHouse.Assignment.service;
import com.SupplyHouse.Assignment.model.RegularHours;
import com.SupplyHouse.Assignment.model.SpecialHours;
import com.SupplyHouse.Assignment.repository.RegularHoursRepository;
import com.SupplyHouse.Assignment.repository.SpecialHoursRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoursServiceImpl implements HoursService {
    private final RegularHoursRepository regularHoursRepository;
    private final SpecialHoursRepository specialHoursRepository;

    public HoursServiceImpl(RegularHoursRepository regularHoursRepository, SpecialHoursRepository specialHoursRepository) {
        this.regularHoursRepository = regularHoursRepository;
        this.specialHoursRepository = specialHoursRepository;
    }

    @Override
    public List<RegularHours> getRegularHours() {
        return regularHoursRepository.findAll();
    }

    @Override
    public List<SpecialHours> getSpecialHours() {
        return specialHoursRepository.findAll();
    }

    @Override
    public SpecialHours addSpecialHours(SpecialHours specialHours) {
        return specialHoursRepository.save(specialHours);
    }
}