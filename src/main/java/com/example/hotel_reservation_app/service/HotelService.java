package com.example.hotel_reservation_app.service;

import com.example.hotel_reservation_app.dao.HotelRepository;
import com.example.hotel_reservation_app.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public Optional<Hotel> getHotelById(Long id) {
        return hotelRepository.findById(id);
    }

    public List<Hotel> getHotelsByCity(String city) {
        return hotelRepository.getHotelsByCity(city);
    }

    public void saveOrUpdateHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }

}

