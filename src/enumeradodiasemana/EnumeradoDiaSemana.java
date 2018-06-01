/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradodiasemana;

/**
 *
 * @author tonit
 */
public class EnumeradoDiaSemana {

    /**
     * @param args the command line arguments
     */
    
    public enum DiaSemana{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO}
    
    public static void main(String[] args) {
        
        DiaSemana d;
        d=DiaSemana.LUNES;
        System.out.println("el dia de la semana es: "+d);
        
        //No es posible asignar a la variable d la cadena "LUNES"
    }
    
}
