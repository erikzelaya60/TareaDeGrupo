/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo4.tareadegrupo.clases;

/**
 *
 * @author KevinMorazan10
 */
public class Laboratorio extends Hospital {
    
    private String encargadoLaboratorio;
    private String telefonoEncargado;
            
    public String getEncargadoLaboratorio() {
        return encargadoLaboratorio;
    }

    public void setEncargadoLaboratorio(String encargadoLaboratorio) {
        this.encargadoLaboratorio = encargadoLaboratorio;
    }
    
    public String getTelefonoEncargado() {
        return telefonoEncargado;
    }

    public void setTelefonoEncargado(String telefonoEncargado) {
        this.telefonoEncargado = telefonoEncargado;
    }
    
    @Override
    public String getDimensionesEdificio() {
        return "200 mts largo x 150 mts ancho";
    }

    @Override
    public String getColorEdificio() {
        return "Amarillo";
    }

    @Override
    public String getUbicacionEdificio() {
        return "Contigua al Hospital Escuela";
    }

    @Override
    public int getNumeroDePisos() {
        return 3;
    }
    
}
