/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.ExtractClass;

import java.util.List;


/**
 *
 * @author Administrador
 */
public class ExampleSmellCode {
    
    public List<ClienteRefactor> clientes;
    public List<EmployeeSmellCode> empleados;
    
    public void MostrarInformacion(ClienteRefactor cliente){
        validarInformacion(cliente.getNombre(),cliente.getApellido,cliente.getCedula);
        
        System.out.println("Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido() + ", con numero de cedula: " + cliente.Cedula );
        
    }
    
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        validarInformacion(Nombre, Apellido, Cedula);
        ClienteRefactor cliente = new ClienteRefactor(Nombre, Apellido, Cedula, new ClienteDireccion());
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");
        
    }
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        
        if(esNombrevalido(Nombre)){
            System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");
            
        }
        if(esApellidovalido(Apellido)){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");
            
        }
        if(esCedulavalida(Cedula)){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");
            
        }
        
    }
    
    public boolean esNombrevalido(String nombre){
         return !nombre.equals("") && nombre.length()> 16;
    }
    
    public boolean esApellidovalido(String apellido){
         return !apellido.equals("") && apellido.length()> 16;
    }
    
    public boolean esCedulavalida(String cedula){
         return !cedula.equals("") && cedula.length()< 10;
    }

    
    
}
