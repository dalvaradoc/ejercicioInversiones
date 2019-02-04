/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinversiones;

import com.sun.security.ntlm.Client;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Company {
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Cliente> clients;

    public Company(String name) {
        this.name = name;
        this.assets = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    
    public boolean addClient (int cc, String nombre, String apellido, int telefono, int edad, String email) {
        Cliente client = new Cliente(cc, nombre, apellido, telefono, edad, email);
        clients.put(cc, client);
        if (clients.containsKey(cc)){
            return true;
        }
        return false;
    }
    
}
