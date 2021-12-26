/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_logica.Figura;
import cap_logica.Rectangulo;
import cap_logica.Triangulo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sh
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10,15,1);
        Triangulo t2 = new Triangulo(6,8,2);
        Triangulo t3 = new Triangulo(45,33,3);
        Rectangulo r1 = new Rectangulo(10,15,4);
        Rectangulo r2 = new Rectangulo(6,8,5);
        Rectangulo r3 = new Rectangulo(45,33,6);
        
        ArrayList<Figura> misFiguras = new ArrayList();
        
        misFiguras.add(t1);
        misFiguras.add(t2);
        misFiguras.add(t3);
        misFiguras.add(r1);
        misFiguras.add(r2);
        misFiguras.add(r3);
        
        Iterator elemento = misFiguras.iterator();
        while(elemento.hasNext()){
            Figura f = (Figura)elemento.next();
            
            System.out.println(f.toString());
        }
        
        System.out.println(t1.presentar());
    }
    
}
