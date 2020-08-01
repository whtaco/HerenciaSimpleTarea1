/*
Diseño de un algoritmo el cual va a representar una herencia simple y el calculo 
de resistencia que posee los sensores MAF (controla el flujo masico de aire) y MAP
(presión de admisión), con valores dados de intensidad(amperios) y voltaje(voltios).
 */
package herenciasimpletarea1;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
import java.text.DecimalFormat;
class Sensor{
    double voltaje;
    double intensidad;
    
    void MostrarCaracteristicasSensor(){
        System.out.println("El voltaje en el sensor MAP es de: "
        +voltaje+" voltios"+"\nLa intensidad del sensor MAP es de: "+intensidad+" amperios");
    }
}
class MAP extends Sensor{
    double resistencia;

double CalcularResistencia(){
    return voltaje/intensidad;
}

void mostrarResistencia(){
    System.out.println("La resistencia del sensor MAP es de: "+ String.format("%.2f", resistencia));
}
}

class MAF extends Sensor{
    double resistencia;
    
    double CalcularResistencia(){
        return voltaje/intensidad;
    }
    
    void mostrarResistencia(){
        System.out.println("La resistencia del sensor MAP es de: %.2f"+String.format("%.2f", resistencia));
    }
}
public class HerenciaSimpleTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MAP sensor1=new MAP();
        MAF sensor2=new MAF();
        
        sensor1.voltaje=5.3;
        sensor1.intensidad=0.033;
        
        sensor2.voltaje=6.1;
        sensor2.intensidad=0.01;
     
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("Materia: PROGRAMACIÓN");
        System.out.println("Nombre: WILLIAM TACO");
        System.out.println("Docente: ING. LUIS GUERRA");
        System.out.println();
        
        System.out.println("Información del sensor MAP");
        sensor1.MostrarCaracteristicasSensor();
        System.out.println("La resistencia en el sensor MAP es de: "+String.format("%.2f", sensor1.CalcularResistencia())+" ohmios");
        System.out.println();
        
        System.out.println("Información del sensor MAF");
        sensor2.MostrarCaracteristicasSensor();
        System.out.println("La resistencia en el sensor MAF es de: "+String.format("%.2f", sensor2.CalcularResistencia())+" ohmios");
        
        System.out.println();
        System.out.println("El sensor MAF posee mas resistencia, en caso de sobrecargas de energia");
    }
    
}
