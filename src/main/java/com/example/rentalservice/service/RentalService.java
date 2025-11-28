package com.example.rentalservice.service;

import com.example.rentalservice.model.Rental;
import com.example.rentalservice.repository.RentalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {

    private final RentalRepository rentalRepository;

    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    public Rental addRental(Rental rental) {
        return rentalRepository.save(rental);
    }
}

