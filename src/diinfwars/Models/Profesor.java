/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diinfwars.Models;

/**
 *
 * @author MonodetH
 */
public class Profesor extends Unidad {
    public static int sCosto = 0;
    public static String sRutaSprite1 = "/images/unidadPlaceholder.png";
    public static String sRutaSprite2 = "/images/unidadPlaceholder.png";

    public Profesor(int equipo) {
        super(equipo);
    }
    
    
    public Profesor(int equipo,int puntosCorto,int puntosMedio,String naturaleza1,String naturaleza2){
        setDefaults(equipo);
        
        // Naturalezas
        /*
            AGREGAR NATURALEZAS SEGUN CORRESPONDA
        */
        modificadores.add(new ModificadorAtributo());
        modificadores.add(new ModificadorAtributo());
        
        //Ataques
        ataques.add(new Ataque(puntosCorto,2,1));
        ataques.add(new Ataque(puntosMedio,3,2));
    }
    
    @Override
    protected void setDefaults(int equipo) {
        // ATRIBUTOS
        this.equipo = equipo;
        this.hp = 75;
        this.hpMax = 75;
        this.movimiento = 3;
        this.mantencion = 0;
        this.costo = 0;

        this.rutaSprite = (equipo == 1)? Profesor.sRutaSprite1:Profesor.sRutaSprite2;
    }
    
}