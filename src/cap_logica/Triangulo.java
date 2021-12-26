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
public class Triangulo extends Figura implements Presentable{
    private int base;
    private int altura;
    
    @Override
    public float calcularArea() {
        return (base*altura)/2;
    }
    
    @Override
    public String toString() {
        String texto = "TRIANGULO\nBase: " + base +
                        "\nAltura: " + altura + 
                        "\nArea: " + calcularArea() +
                        "\n--------------------";
        
        return texto;
    }

    @Override
    public String presentar() {
        String texto = "TRIANGULO\nBase: " + base +
                        "\nAltura: " + altura + 
                        "\nArea: " + calcularArea() +
                        "\n--------------------";
        
        return texto;
    }
    
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(int base, int altura, int color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    
    public float getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
     
}
