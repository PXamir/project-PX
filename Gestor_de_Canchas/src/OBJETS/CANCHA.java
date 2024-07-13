/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJETS;

import java.time.LocalDate;
import java.time.LocalTime;



/**
 *
 * @author SAMIR
 */
public class CANCHA {
    
    private int IDcancha;
    private LocalDate dia;
    private LocalTime hora;

    public CANCHA(int IDcancha, LocalDate dia, LocalTime hora) {
        this.IDcancha = IDcancha;
        this.dia = dia;
        this.hora = hora;
    }

    public int getIDcancha() {
        return IDcancha;
    }

    public void setIDcancha(int IDcancha) {
        this.IDcancha = IDcancha;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    
    
    
}
