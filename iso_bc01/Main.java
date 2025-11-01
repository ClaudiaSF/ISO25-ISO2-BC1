package iso_bc01;
import iso_bc01.Presentacion.*;
import iso_bc01.Dominio.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido a nuestra aplicación: " );
        reservar();

    }

    public static void reservar(){
         IU_ReservarMaterial reservar = new IU_ReservarMaterial();
         Reserva r = reservar.CapturarDatos();
         System.out.println("Reserva realizada con éxito");  
    }


}