/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploTema6;

/**
 *
 * @author Okumura
 */
public class Animal implements Comparable{
    private String nombre;
    private String tipo;
    private int edad;
    
    /**
    *Constructor de Animal
    * @param nombre
    * @param tipo
    * @param Edad
    **/
    public Animal(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public int compareTo(Object o) {
        Animal ani = (Animal) o;
        
        return this.nombre.compareTo(ani.nombre);
    }
    
}
