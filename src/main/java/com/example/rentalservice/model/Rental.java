package com.example.rentalservice.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ← ВАЖНО: GeneratedValue с "d"
    private Long id;

    private String itemName;
    private String renterName;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;
    private double pricePerDay;

    // Конструкторы
    public Rental() {}

    public Rental(String itemName, String renterName, LocalDate startDate, LocalDate endDate, boolean active, double pricePerDay) {
        this.itemName = itemName;
        this.renterName = renterName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
        this.pricePerDay = pricePerDay;
    }

    // Геттеры
    public Long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getRenterName() {
        return renterName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isActive() {
        return active;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    // Сеттеры
    public void setId(Long id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}