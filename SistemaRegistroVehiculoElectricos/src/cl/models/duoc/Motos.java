package cl.models.duoc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cetecom
 */
public class Motos extends Vehiculo{
    public int capacidadBateria;
    public String asistenciaModoEco;

    public Motos() {
    }
    

    public Motos(int capacidadBateria, String asistenciaModoEco, int codigoAlfanumerico, String mantenimiento) {
        super(codigoAlfanumerico, mantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.asistenciaModoEco = asistenciaModoEco;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getAsistenciaModoEco() {
        return asistenciaModoEco;
    }

    public void setAsistenciaModoEco(String asistenciaModoEco) {
        this.asistenciaModoEco = asistenciaModoEco;
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
        return "Motos{" + "capacidadBateria=" + capacidadBateria + ", asistenciaModoEco=" + asistenciaModoEco + '}';
    }
    
    
}
