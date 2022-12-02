/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author chaia
 */
public class Cuadrilatero extends Poligono{
    
    private int alpha,beta;
    private int a,b;
    private float base,altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alpha, int beta, int gamma, int a, int b, int c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    public int getAlpha() {
        return alpha;
    }

    public int getBeta() {
        return beta;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float perimetro(){
        return a+a+a+a;
    }
    
    @Override
    public float area(){
        return 2*a;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + 
                "alpha=" + alpha + 
                ", beta=" + beta + 
                ", a=" + a + 
                ", b=" + b + 
                ", base=" + base + 
                ", altura=" + altura + '}';
    }
    
}
