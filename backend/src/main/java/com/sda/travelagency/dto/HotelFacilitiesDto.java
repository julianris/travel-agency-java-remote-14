package com.sda.travelagency.dto;

import com.sda.travelagency.entity.Attraction;

import java.util.List;

public record HotelFacilitiesDto(

        Long id,
        List<AttractionDto> attractions,

        List<String> apartmentFacilities

) {
}
