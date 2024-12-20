package com.sam.SamHotel.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sam.SamHotel.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT DISTINCT r.roomType FROM Room r")
    List<String> findDistinctRoomTypes();

    //search for availavle rooms by check in date and check out date
    @Query("SELECT r FROM Room r WHERE r.roomType LIKE %:roomType% AND r.id NOT IN (SELECT bk.room.id FROM Booking bk WHERE (bk.checkInDate <= :checkOutDate) AND (bk.checkOutDate >= :checkInDate))")
    List<Room> findAvailableRoomsByDatesAndTypes(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    // get all rooms that are not in the booking table
    @Query("SELECT r FROM Room r WHERE r.id NOT IN (SELECT b.room.id FROM Booking b)")
    List<Room> getAllAvailableRooms();
}
