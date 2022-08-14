package com.sda.travelagency.converter;

import com.sda.travelagency.dto.TripDto;
import com.sda.travelagency.entity.Trip;

public class TripConverter implements Converter<Trip, TripDto> {
    @Override
    public TripDto fromEntityToDto(Trip trip) {
        return null;
    }

    @Override
    public Trip fromDtoToEntity(TripDto tripDto) {
        return null;
    }


}
