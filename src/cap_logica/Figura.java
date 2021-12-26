/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Sh
 */
public abstract class Figura {
    private int color;
    
    public abstract float calcularArea();
    @Override
    public abstract String toString();

    public Figura() {
        this.color = 0;
    }

    public Figura(int color) {
        this.color = color;
    }
    

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
}
