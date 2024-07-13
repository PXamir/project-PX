package OBJETS;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author SAMIR
 */
public class RESERVA {
    
    private String DNI;
    private Date dia;
    private Time hora;

    public RESERVA(String dni, Date dia, Time hora) {
        this.DNI = dni;
        this.dia = dia;
        this.hora = hora;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    
    
}
