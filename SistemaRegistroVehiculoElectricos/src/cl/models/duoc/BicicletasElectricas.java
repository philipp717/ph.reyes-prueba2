package cl.models.duoc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cetecom
 */
public class BicicletasElectricas extends Vehiculo {
    public String tipoFrenos;
    public int capacidadBateria;

    public BicicletasElectricas() {
    }

    public BicicletasElectricas(String tipoFrenos, int capacidadBateria, int codigoAlfanumerico, String mantenimiento) {
        super(codigoAlfanumerico, mantenimiento);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateria = capacidadBateria;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public void setMantenimiento(String mantenimiento) {
        super.setMantenimiento(mantenimiento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMantenimiento() {
        return super.getMantenimiento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCodigoAlfanumerico(int codigoAlfanumerico) {
        super.setCodigoAlfanumerico(codigoAlfanumerico); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCodigoAlfanumerico() {
        return super.getCodigoAlfanumerico(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public String toString() {
        return "BicicletasElectricas{" + "tipoFrenos=" + tipoFrenos + ", capacidadBateria=" + capacidadBateria + '}';
    }
    
    
    
}
