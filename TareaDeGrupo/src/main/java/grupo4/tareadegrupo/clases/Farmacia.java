/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo4.tareadegrupo.clases;

/**
 *
 * @author OdalysQuintano
 */
public class Farmacia extends Hospital {
    
    private String encargadoFarmacia;
    private String telefonoEncargado;

    public Farmacia(){};
    
    public Farmacia (String encargadoFarmacia, String telefonoEncargado) {
        this.encargadoFarmacia = encargadoFarmacia;
        this.telefonoEncargado = telefonoEncargado;
    };
    
    public String getEncargadoFarmacia() {
        return encargadoFarmacia;
    }

    public String getTelefonoEncargado() {
        return telefonoEncargado;
    }

    public void setEncargadoFarmacia(String encargadoFarmacia) {
        this.encargadoFarmacia = encargadoFarmacia;
    }

    public void setTelefonoEncargado(String telefonoEncargado) {
        this.telefonoEncargado = telefonoEncargado;
    }

    @Override
    public String getDimensionesEdificio() {
        return "100 mts largo x 75 mts ancho";
    }

    @Override
    public String getColorEdificio() {
        return "blanco";
    }

    @Override
    public String getUbicacionEdificio() {
        return "Contigua al laboratorio del Hospital Escuela.";
    }

    @Override
    public int getNumeroDePisos() {
        return 2;
    }
    
}
