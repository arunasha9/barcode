package com.example.barcode.entity;



import com.example.barcode.dto.BarcodeDTO;
//import com.example.barcode.helper.BarcodeDTOListConverter;
//import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


@Component
//@Table(name = "generate_barcode", schema = "barcode")
public class GenerateBarcode {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id;

   /* @Column(nullable = false)*/
    private UUID generationId;

   /* @Column(nullable = false, columnDefinition = "jsonb")
    @Convert(converter = BarcodeDTOListConverter.class)*/
    private List<BarcodeDTO> serialNo;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getGenerationId() {
        return generationId;
    }

    public void setGenerationId(UUID generationId) {
        this.generationId = generationId;
    }

    public List<BarcodeDTO> getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(List<BarcodeDTO> serialNo) {
        this.serialNo = serialNo;
    }
}

