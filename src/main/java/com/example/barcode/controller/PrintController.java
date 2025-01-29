package com.example.barcode.controller;

import com.example.barcode.dto.BarcodeDTO;
import com.example.barcode.service.BarcodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.File;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/barcode")
public class PrintController {
    @Autowired
    private BarcodeService barcodeService;
    @GetMapping("/getVariableList/{generationId}")
    public ResponseEntity<List<BarcodeDTO>> getBarcodesByGenerationId(@PathVariable UUID generationId) {

//        List<BarcodeDTO> barcodeDetails = barcodeService.getBarcodesByGenerationId(generationId);
//        System.out.println(barcodeDetails.get(0).getBarcode());
//
//        if (barcodeDetails == null || barcodeDetails.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        return ResponseEntity.ok(barcodeDetails);
        List<BarcodeDTO> barcodeDetails = new ArrayList<>();
        barcodeDetails.add(new BarcodeDTO(1, "AFBR-57F5MZ", "AXKL2349001"));
        barcodeDetails.add(new BarcodeDTO(2, "YYWW", "2233"));
        barcodeDetails.add(new BarcodeDTO(3, "AFBR-57F5UMZ-EP1", ""));

        // Print the first barcode to the console for verification
        if (!barcodeDetails.isEmpty()) {
            System.out.println(barcodeDetails.get(0).getBarcode());
        }

        // Check if the list is empty and return the appropriate response
        if (barcodeDetails.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(barcodeDetails);
    }
}
