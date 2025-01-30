package com.example.barcode.service;
import com.example.barcode.dto.BarcodeDTO;
//import com.example.barcode.repository.BarcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BarcodeService {

   // private final BarcodeRepository barcodeRepository;

   /* @Autowired
    public BarcodeService(BarcodeRepository barcodeRepository) {
        this.barcodeRepository = barcodeRepository;
    }
*/
    public List<BarcodeDTO> getBarcodesByGenerationId(UUID generationId) {
      //  List<Object[]> results = barcodeRepository.findBarcodesByGenerationId(generationId);
        List<BarcodeDTO> barcodeDTOs = new ArrayList<>();

       /* for (Object[] result : results) {
            BarcodeDTO barcodeDTO = new BarcodeDTO();
            barcodeDTO.setSetNo(Integer.parseInt((String) result[0]));
            barcodeDTO.setVarName((String) result[1]);
            barcodeDTO.setBarcode((String) result[2]);
            barcodeDTOs.add(barcodeDTO);
        }*/

        return barcodeDTOs;
    }
}
