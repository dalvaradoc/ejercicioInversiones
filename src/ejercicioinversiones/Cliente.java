/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinversiones;

/**
 *
 * @author Estudiante
 */
public class Cliente {
    private int cc;
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private String email;
    private Asset[] activos;

    public Cliente(int cc, String nombre, String apellido, int telefono, int edad, String email) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.activos = new Asset[10];
    }
    
    
    
    
    
}
