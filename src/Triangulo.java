/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author chaia
 */
public class Triangulo extends Poligono{
    
    private int alpha,beta,gamma;
    private int a,b,c;
    private float base,altura;

    public Triangulo() {
    }

    public Triangulo(int alpha, int beta, int gamma, int a, int b, int c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    public int getAlpha() {
        return alpha;
    }

    public int getBeta() {
        return beta;
    }

    public int getGamma() {
        return gamma;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
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

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float perimetro(){
        return a+b+c;
    }
    
    @Override
    public float area(){
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + 
                "alpha=" + alpha + 
                ", beta=" + beta + 
                ", gamma=" + gamma + 
                ", a=" + a + 
                ", b=" + b + 
                ", c=" + c + 
                ", base=" + base + 
                ", altura=" + altura +'}';
    }
       
}
