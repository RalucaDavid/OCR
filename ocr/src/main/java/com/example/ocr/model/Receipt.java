package com.example.ocr.model;

public record Receipt (
    String cif,
    String date,
    String receiptNumber,
    String fuelType,
    String paymentMethod,
    String total
) {}