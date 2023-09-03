/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author md
 */
public class RegistroEOR {

    public RegistroEOR(String identificación, String Nombre, String contacto, String Categoría, String capacitación, String Caducidad) {
        this.identificación = identificación;
        this.Nombre = Nombre;
        this.contacto = contacto;
        this.Categoría = Categoría;
        this.capacitación = capacitación;
        this.Caducidad = Caducidad;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCategoría() {
        return Categoría;
    }

    public void setCategoría(String Categoría) {
        this.Categoría = Categoría;
    }

    public String getCapacitación() {
        return capacitación;
    }

    public void setCapacitación(String capacitación) {
        this.capacitación = capacitación;
    }

    public String getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(String Caducidad) {
        this.Caducidad = Caducidad;
    }
    String identificación, Nombre,contacto,Categoría, capacitación, Caducidad;

}
