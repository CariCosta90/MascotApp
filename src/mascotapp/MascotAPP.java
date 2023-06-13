package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {
        ServicioMascota sm = new ServicioMascota();

        Mascota m1 = sm.crearMascota();

        System.out.println(m1.toString());

    }

}
