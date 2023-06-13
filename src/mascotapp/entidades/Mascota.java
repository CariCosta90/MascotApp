package mascotapp.entidades;

public class Mascota {
    //declaramos atributos

    private String nombre;
    private String apodo;
    //conejo, gaot, perro, loro...
    private String tipo;
    private int edad;
    private boolean cola;
    private String raza;
    private String color;
    private int energia;

    //trabajamos con el contructor
    public Mascota() {
        energia = 1000;
    }

    //constructor con argumentos
    public Mascota(String nombre, String apodo, String tipo) {
        this.apodo = apodo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String raza, String color) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.color = color;
        this.energia = 1000;
    }

    //trabajamos con el setter - este es un metodo
    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }

    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //trabajamos el getter 
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    //primer metodo
    
    /**
     * Funcion para pasear
     * @param energiaRestar
     * @return energia
     */
    
    public int pasear(int energiaRestar) {
        // energia = energia - energiaRestar;
        energia -= energiaRestar;
        return energia;
    }
    
    /**
     * Funcion para pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */

    //sobrecarga de metodos - se puede hacer el mismo metodo pero que reciba distintos parametros
    public int pasear(int energiaRestar, int vueltas) {
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        return energia;
    }

    //funcion que devuelve un mensaje formateado y armado segun cada mascota en vez de mostrar el lugar reservado en la memoria que es lo que queda si esto no esta
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", color=" + color + ", energia=" + energia + '}';
    }

}
