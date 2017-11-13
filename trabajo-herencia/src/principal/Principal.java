/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import paquetePersonal.Trabajador;
import laempresa.EmpresaPrivada;
/**
 *
 * @author Carolina
 */
public class Principal {
    public static void main(String[] args) {
        
        Trabajador t = new Trabajador();

        Trabajador total_trabajadores[] = new Trabajador[2];
        total_trabajadores[0] = new Trabajador("Ana Luisa", "Velez Alcivar", 30, 12903939, 100, 40,  t.obtener_sueldo());
        total_trabajadores[1] = new Trabajador("Mario Anibal", "Vela Narvaez", 35, 212889, 100, 50,  t.obtener_sueldo());
        
        EmpresaPrivada ep = new EmpresaPrivada("Soluciones Software", "SS´s", "Loja", total_trabajadores, 20000, 12);
        System.out.println(ep);
    } 
}
