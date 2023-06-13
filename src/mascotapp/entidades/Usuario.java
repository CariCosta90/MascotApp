package mascotapp.entidades;

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;

    //con alt+insert netBeans nos habilita la posibilidad de crear el constructor de forma automatica
    public Usuario() {
    }
    
    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

}
