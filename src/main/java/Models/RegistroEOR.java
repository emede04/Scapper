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

    public RegistroEOR(String identificaci�n, String Nombre, String contacto, String Categor�a, String capacitaci�n, String Caducidad) {
        this.identificaci�n = identificaci�n;
        this.Nombre = Nombre;
        this.contacto = contacto;
        this.Categor�a = Categor�a;
        this.capacitaci�n = capacitaci�n;
        this.Caducidad = Caducidad;
    }

    public String getIdentificaci�n() {
        return identificaci�n;
    }

    public void setIdentificaci�n(String identificaci�n) {
        this.identificaci�n = identificaci�n;
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

    public String getCategor�a() {
        return Categor�a;
    }

    public void setCategor�a(String Categor�a) {
        this.Categor�a = Categor�a;
    }

    public String getCapacitaci�n() {
        return capacitaci�n;
    }

    public void setCapacitaci�n(String capacitaci�n) {
        this.capacitaci�n = capacitaci�n;
    }

    public String getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(String Caducidad) {
        this.Caducidad = Caducidad;
    }
    String identificaci�n, Nombre,contacto,Categor�a, capacitaci�n, Caducidad;

}
