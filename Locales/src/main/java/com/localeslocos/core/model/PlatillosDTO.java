package com.localeslocos.core.model;

public class PlatillosDTO {

    private Long idPlatillo;
    private String nombrePlatillo;

    public PlatillosDTO(Long idPlatillo, String nombrePlatillo) {
        this.idPlatillo = idPlatillo;
        this.nombrePlatillo = nombrePlatillo;
    }
    
    public PlatillosDTO() {}

    // Getters y setters

    public Long getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Long idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }
}

