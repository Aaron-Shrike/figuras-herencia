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
public class Rectangulo extends Figura{
    private int base;
    private int altura;

    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public String toString() {
        String texto = "RECTANGULO\nBase: " + base +
                        "\nAltura: " + altura +
                        "\nArea: " + calcularArea() +
                        "\n-------------";
        
        return texto;
    }

    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo(int base, int altura, int color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
  
}
