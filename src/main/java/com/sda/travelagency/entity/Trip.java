package com.sda.travelagency.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Trip {
    LocalDate tripStartDate;

    LocalDate tripEndDate;

    Destination destination;

    Price tripPrice;

    TransportType typOfTransports;

    SecurityRules securityRules;

    PaymentType paymentType;

    MealType mealType;

    HotelFacilities hotelFacilities;

    List<String> photos;



}
