package com.example.hotel_reservation_app.dao;

import com.example.hotel_reservation_app.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Optional<Room> getRoomByRoomNumber(int roomNumber);

    List<Room> findByHotelId(Long hotelId);

}