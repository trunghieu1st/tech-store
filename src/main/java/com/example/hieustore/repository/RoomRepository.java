package com.example.hieustore.repository;

import com.example.hieustore.domain.entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
    @Query(value = "SELECT * FROM rooms", nativeQuery = true)
    Page<Room> getAll(Pageable pageable);
}
