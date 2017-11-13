/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;
import paquetePersonal.Trabajador;
/**
 *
 * @author Carolina
 */
public class Empresa {
    private String nombre;
    private String siglas;
    private String ciudad;
    private Trabajador[] trabajadores;
    

    public Empresa(String n, String s, String c, Trabajador[] t) {
        setNombre(n);
        setSiglas(s);
        setCiudad(c);
        setTrabajadores(t);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }
    public String total_trabajadores(){  
        String total = " ";
        for (int i = 0; i < trabajadores.length; i++) {
            total += "\t" +(i+1)+ ")" +this.trabajadores[i].toString();
        }
            return total;
    }

@Override
    public String toString() {
        return String.format("Empresa: %s\nSiglas: %s\nCiudad: %s",
            getNombre(), getSiglas(), getCiudad());
    }
    

    
    
}
