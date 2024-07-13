/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJETS;

/**
 *
 * @author SAMIR
 */
public class USUARIO {
    
    private String DNI;
    private String nombre;
    private String pass;

    public USUARIO(String DNI, String nombre, String pass) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.pass = pass;
    }

    public USUARIO() {
    }
    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
