/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

/**
 *
 * @author Aulas Heredia
 */
public class auto {

    public String placa;
    public String modelo;
    public int year;
//void significa vacio
//
    public void calculaAnios(int actualyear) {
        int resultado = 0;
        resultado = actualyear - year;

        System.out.println("Antiguedad del vehiculo" + resultado);
    }
    public int calculaAniosResultado(int actualyear){
        return 0;
    }
}
