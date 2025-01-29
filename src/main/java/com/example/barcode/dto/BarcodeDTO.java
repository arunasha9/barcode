package com.example.barcode.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BarcodeDTO {

    @JsonProperty("setNo")
    private int setNo;

    @JsonProperty("varName")
    private String varName;

    @JsonProperty("barcode")
    private String barcode;

    // Default constructor
    public BarcodeDTO() {
    }

    // Parameterized constructor
    public BarcodeDTO(int setNo, String varName, String barcode) {
        this.setNo = setNo;
        this.varName = varName;
        this.barcode = barcode;
    }

    // Getters and Setters
    public int getSetNo() {
        return setNo;
    }

    public void setSetNo(int setNo) {
        this.setNo = setNo;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
