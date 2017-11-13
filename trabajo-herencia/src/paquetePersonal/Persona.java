/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePersonal;

/**
 *
 * @author Carolina
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;

    public Persona(String n, String a, int e, int c) {
        setNombre(n);
        setApellido(a);
        setEdad(e);
        setCedula(c);
    }
    public Persona(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
@Override
    public String toString() {
        return String.format("\t%s %s\n" + "\t\t%d años\n"
                + "\t\tcedula: %s", 
                getNombre(), getApellido(), getEdad(), getCedula());
    } 
    
}
