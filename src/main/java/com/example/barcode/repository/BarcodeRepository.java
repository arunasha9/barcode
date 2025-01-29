package com.example.barcode.repository;

import com.example.barcode.entity.GenerateBarcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BarcodeRepository extends JpaRepository<GenerateBarcode, Long> {
    @Query(value = "SELECT elem ->> 'setNo' AS setNo, " +
            "elem ->> 'varName' AS varName, " +
            "elem ->> 'barcode' AS barcode " +
            "FROM barcode.generate_barcode, jsonb_array_elements(serial_no) AS elem " +
            "WHERE generation_id = :generationId", nativeQuery = true)
    List<Object[]> findBarcodesByGenerationId(@Param("generationId") UUID generationId);
}
