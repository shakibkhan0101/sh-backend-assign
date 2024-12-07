package com.SupplyHouse.Assignment.controller;
import com.SupplyHouse.Assignment.model.RegularHours;
import com.SupplyHouse.Assignment.model.SpecialHours;
import com.SupplyHouse.Assignment.service.HoursService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hours")
public class HoursController {
    private final HoursService hoursService;

    public HoursController(HoursService hoursService) {
        this.hoursService = hoursService;
    }

    @GetMapping("/regular")
    public ResponseEntity<List<RegularHours>> getRegularHours() {
        return ResponseEntity.ok(hoursService.getRegularHours());
    }

    @GetMapping("/special")
    public ResponseEntity<List<SpecialHours>> getSpecialHours() {
        return ResponseEntity.ok(hoursService.getSpecialHours());
    }

    @PostMapping("/special")
    public ResponseEntity<SpecialHours> addSpecialHours(@RequestBody SpecialHours specialHours) {
        return ResponseEntity.ok(hoursService.addSpecialHours(specialHours));
    }
}