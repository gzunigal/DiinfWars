/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diinfwars.Models;

import java.util.ArrayList;

/**
 *
 * @author MonodetH
 */
public abstract class Unidad {
    // ATRIBUTOS   
    protected int equipo;
    protected int hp;
    protected int hpMax;
    protected int estamina = 100;
    protected int nivel = 1;
    protected int experiencia = 0;
    protected int movimiento;
    protected int criticalMiss = 5;
    protected ArrayList<Ataque> ataques = new ArrayList<Ataque>();
    protected ArrayList<ModificadorAtributo> modificadores = new ArrayList<ModificadorAtributo>();
    protected int mantencion;
    protected int costo;
    protected String rutaSprite;
    
    
    // CONSTRUCTORES
    public Unidad(){}
    public Unidad(int equipo){
        setDefaults(equipo);
        // Se crea una naturaleza y se agrega a modificadores
        modificadores.add(new ModificadorAtributo());
    }
    
    /**Constructor de unidad, Usada solo por profesor.*/
    public Unidad(int equipo, int puntosCorto, int puntosMedio, String naturaleza1, String naturaleza2){}
    
    
    // METODOS ABSTRACTOS (Distintos en cada unidad)
    /**
     * Setea los valores iniciales correspondiente a cada unidad
     * @param equipo El equipo al cual pertenece la unidad: 1 = equipo azul; 2 = equipo rojo
     */
    protected abstract void setDefaults(int equipo);
    
    // METODOS GENERALES (Heredables)
    public String getSprite(){
        return this.rutaSprite;
    }

    public int getEquipo() {
        return this.equipo;
    }
    
    public int getMovimientos(){
        return this.movimiento;
    }
    
}
