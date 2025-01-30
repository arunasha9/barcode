/*
package com.example.barcode.helper;


import com.example.barcode.dto.BarcodeDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.io.IOException;
import java.util.List;

@Converter
public class BarcodeDTOListConverter implements AttributeConverter<List<BarcodeDTO>, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public String convertToDatabaseColumn(List<BarcodeDTO> attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Error converting list of BarcodeDTO to JSON string", e);
        }
    }
    @Override
    public List<BarcodeDTO> convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, objectMapper.getTypeFactory().constructCollectionType(List.class, BarcodeDTO.class));
        } catch (IOException e) {
            throw new IllegalArgumentException("Error converting JSON string to list of BarcodeDTO", e);
        }
    }
}
*/
