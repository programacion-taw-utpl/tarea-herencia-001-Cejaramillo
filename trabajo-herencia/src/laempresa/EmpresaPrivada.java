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
public class EmpresaPrivada extends Empresa {
    private double ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(String n, String s, String c, Trabajador[] t, int v, int n_s) {
        super(n, s, c, t);
        setVentas_mensual_fijo(v);
        setNumero_sucursales(n_s);
    }

    public double getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setVentas_mensual_fijo(double ventas_mensual_fijo) {
        this.ventas_mensual_fijo = ventas_mensual_fijo;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }

    public void setNumero_sucursales(int numero_sucursales) {
        this.numero_sucursales = numero_sucursales;
    }
@Override
    public String toString() {
        return String.format("%s" + "Ventas: $%s\n"
                + "Sucursales: %s\n"
                + "Total Trabajadores:\n"
                + "\n%s", super.toString(), getVentas_mensual_fijo(), getNumero_sucursales(),total_trabajadores());
    }
}
