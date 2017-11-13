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
public class Trabajador extends Persona {
    private double costo_seguro;
    private int horas_trabajadas;
    private double costo_por_hora;

    public Trabajador(String n, String a, int e, int c, double costo_seguro, int horas_trabajadas, double costo_por_hora) {
        super(n, a, e, c);
        this.costo_seguro = costo_seguro;
        this.horas_trabajadas = horas_trabajadas;
        this.costo_por_hora = costo_por_hora;
    }

    public Trabajador(){
        
    }

    public double getCosto_seguro() {
        return costo_seguro;
    }

    public void setCosto_seguro(int costo_seguro) {
        this.costo_seguro = costo_seguro;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getCosto_por_hora() {
        return costo_por_hora;
    }

    public void setCosto_por_hora(int costo_por_hora) {
        this.costo_por_hora = costo_por_hora;
    }
    
    public double obtener_sueldo(){
        double calculo = getHoras_trabajadas() * getCosto_por_hora();
        return getCosto_seguro() + calculo;
    }

    
@Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "\t\tSeguro: $%s\n"
                + "\t\tHoras trabajadas: %s\n"
                + "\t\tValor por hora: %s\n"
                + "\t\tSueldo: $%s\n", super.toString(), getCosto_seguro(),getHoras_trabajadas(),
                getCosto_por_hora(),obtener_sueldo());
        return cadena;
    }
    
}
