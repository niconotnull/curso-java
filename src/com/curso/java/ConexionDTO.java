package com.curso.java;
import com.google.gson.Gson;

import java.util.Date;


public class ConexionDTO {


    private String estatusId;


    private Integer paisId;

    private Integer aggregatorId;

    private Integer marcaId;

   private String codigoCupon;

    private String sucursalId;


    private String puntoDeVenta;


    private String response;

    private String fechaRegistro;


    public String getEstatusId() {
        return estatusId;
    }

    public void setEstatusId(String estatusId) {
        this.estatusId = estatusId;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public String getCodigoCupon() {
        return codigoCupon;
    }

    public void setCodigoCupon(String codigoCupon) {
        this.codigoCupon = codigoCupon;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public String getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(String sucursalId) {
        this.sucursalId = sucursalId;
    }

    public String getPuntoDeVenta() {
        return puntoDeVenta;
    }

    public void setPuntoDeVenta(String puntoDeVenta) {
        this.puntoDeVenta = puntoDeVenta;
    }

    public Integer getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(Integer aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this, ConexionDTO.class);
    }
}