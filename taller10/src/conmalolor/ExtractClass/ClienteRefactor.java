/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.ExtractClass;

import conmalolor.*;


public class ClienteRefactor {
    private String Nombre;
    private String Apellido;
    String Cedula;
    private String telefono;
    private ClienteDireccion Location;
    
    
    public ClienteRefactor(String Nombre, String Apellido, String Cedula, ClienteDireccion Location) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Location = new ClienteDireccion();
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    public void setLocation(ClienteDireccion Location) {
        this.Location = Location;
    }

    
}
