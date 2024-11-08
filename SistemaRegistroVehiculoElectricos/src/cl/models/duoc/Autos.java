package cl.models.duoc;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cetecom
 */
public class Autos extends Vehiculo {
    public int cantidadPasajeros;
    public String disponibilidadDeAutopilot;

    public Autos() {
    }
    
    public Autos(int cantidadPasajeros, String disponibilidadDeAutopilot, int codigoAlfanumerico, String mantenimiento) {
        super(codigoAlfanumerico, mantenimiento);
        this.cantidadPasajeros = cantidadPasajeros;
        this.disponibilidadDeAutopilot = disponibilidadDeAutopilot;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getDisponibilidadDeAutopilot() {
        return disponibilidadDeAutopilot;
    }

    public void setDisponibilidadDeAutopilot(String disponibilidadDeAutopilot) {
        this.disponibilidadDeAutopilot = disponibilidadDeAutopilot;
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
        return "Autos{" + "cantidadPasajeros=" + cantidadPasajeros + ", disponibilidadDeAutopilot=" + disponibilidadDeAutopilot + '}';
    }    
}
