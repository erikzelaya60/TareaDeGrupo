/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo4.tareadegrupo;

import grupo4.tareadegrupo.clases.Farmacia;
import grupo4.tareadegrupo.clases.Laboratorio;

/**
 *
 * @author erikzelaya60
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Farmacia farmacia = new Farmacia();
        farmacia.setEncargadoFarmacia("Odalys Quintano");
        farmacia.setTelefonoEncargado("99887766");
        
        System.out.println("Encargado de farmacia: " + farmacia.getEncargadoFarmacia());
        System.out.println("Telefono del encargado de farmacia: " + farmacia.getTelefonoEncargado());
        System.out.println("Ubicacion edificio: " + farmacia.getUbicacionEdificio());
        System.out.println("Color edificio: " + farmacia.getColorEdificio());
        System.out.println("Numero de pisos: " + farmacia.getNumeroDePisos());
        System.out.println("Dimensiones del edificio: " + farmacia.getDimensionesEdificio());
        
        Farmacia farmacia2 = new Farmacia("Erik Zelaya", "99998888");
        
        System.out.println("(Usando constructor) Encargado de farmacia 2: " + farmacia2.getEncargadoFarmacia());
        System.out.println("(Usando constructor) Telefono del encargado de farmacia 2: " + farmacia2.getTelefonoEncargado());        
        
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.setEncargadoLaboratorio("Kevin Morazan");
        laboratorio.setTelefonoEncargado("89897766");
        
        System.out.println("Encargado de laboratorio: " + laboratorio.getEncargadoLaboratorio());
        System.out.println("Telefono del encargado de lab: " + laboratorio.getTelefonoEncargado());
        System.out.println("Ubicacion edificio: " + laboratorio.getUbicacionEdificio());
        System.out.println("Color edificio: " + laboratorio.getColorEdificio());
        System.out.println("Numero de pisos: " + laboratorio.getNumeroDePisos());
        System.out.println("Dimensiones del edificio: " + laboratorio.getDimensionesEdificio());
        
    }
    
}
