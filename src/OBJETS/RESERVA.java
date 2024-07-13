package OBJETS;

import java.sql.Date;


/**
 *
 * @author SAMIR
 */
public class RESERVA {
    
    private String DNI;
    private Date dia;
    private String hora;

    public RESERVA(String dni, Date dia, String hora) {
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
