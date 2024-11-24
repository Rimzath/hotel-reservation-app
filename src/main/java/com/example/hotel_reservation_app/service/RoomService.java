package com.example.hotel_reservation_app.service;

import com.example.hotel_reservation_app.dao.RoomRepository;
import com.example.hotel_reservation_app.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(Long id) {
        return roomRepository.findById(id);
    }

    public Optional<Room> getRoomByRoomNumber(int roomNumber) {
        return roomRepository.getRoomByRoomNumber(roomNumber);
    }

    public List<Room> getRoomsByHotelId(Long hotelId) {
        return roomRepository.findByHotelId(hotelId);
    }

    public void saveOrUpdateRoom(Room room) {
        roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }

}