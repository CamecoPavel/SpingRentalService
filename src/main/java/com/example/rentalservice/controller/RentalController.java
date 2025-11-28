package com.example.rentalservice.controller;

import com.example.rentalservice.model.Rental;
import com.example.rentalservice.service.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public List<Rental> getAllRentals() {
        return rentalService.getAllRentals();
    }

    @PostMapping
    public Rental addRental(@RequestBody Rental rental) {
        return rentalService.addRental(rental);
    }
}
