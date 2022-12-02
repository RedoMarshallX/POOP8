/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author EquipoB
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poligono poligono1 = new Poligono();
        // EJERCICIO 1 - Uso de la clase Override
        //System.out.println(poligono1.area());
        
        /*
        poligono1 = new Poligono();
        System.out.println(poligono1);
        poligono1 = new Cuadrilatero();
        System.out.println(poligono1);
        */
        
        //EJERCICIO 2 - Asignar la dirección de un objeto a otro
        /*
        Object objeto1 = poligono1;
        System.out.println(poligono1);
        System.out.println(objeto1);
        */
        
        // EJERCICIO 3 - Método tipoPoligono
        /*
        tipoPoligono(poligono1);
        poligono1 = new Cuadrilatero();
        tipoPoligono(poligono1);
        poligono1 = new Triangulo();
        tipoPoligono(poligono1);
        */
        
        // EJERCICIO 4 - Clases abstractas
        /*
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        System.out.println(""+poligono1+cuadrilatero+triangulo);
        */
        
        //EJERCICIO 5 - Interfaces Parte 1 con InstrumentoMusical
        /*
        InstrumentoMusical instrumento = new InstrumentoDeViento();
        System.out.println(instrumento);
        */
        
        //EJERCICIO 6 - Math.PI
        System.out.println(Math.PI);
        System.out.println(Meses.DOS);
    }

    /*
    private static void tipoPoligono(Poligono poligono1) {
        if(poligono1 instanceof Triangulo){
            System.out.println("Soy un triángulo uwu");
        }else if(poligono1 instanceof Cuadrilatero){
            System.out.println("Soy un cuadrilátero ewe");
            //PIDELE FOTO A JEAN XD
        }else{
            System.out.println("Soy un polígono owo");
        }
    }
    */
}
