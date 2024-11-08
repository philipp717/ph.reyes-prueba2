package cl.models.duoc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo {
    private int codigoAlfanumerico;
    private String mantenimiento;

    public Vehiculo() {
    }

    public Vehiculo(int codigoAlfanumerico, String mantenimiento) {
        this.codigoAlfanumerico = codigoAlfanumerico;
        this.mantenimiento = mantenimiento;
    }

    public int getCodigoAlfanumerico() {
        return codigoAlfanumerico;
    }

    public void setCodigoAlfanumerico(int codigoAlfanumerico) {
        this.codigoAlfanumerico = codigoAlfanumerico;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigoAlfanumerico=" + codigoAlfanumerico + ", mantenimiento=" + mantenimiento + '}';
    }
    
}
