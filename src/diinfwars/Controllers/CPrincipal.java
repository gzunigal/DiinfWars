/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diinfwars.Controllers;

import diinfwars.Views.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author MonodetH
 */
public class CPrincipal implements ActionListener{
    /**Instancia de la vista principal*/
    private static VPrincipal v;
    
    // Controladores
    private CCreditos cCreditos;
    private CPreJugar cJugar;
    private CEstadisticas cEstadisticas;
    private CPreTorneo cTorneo;
    private CLogin cLogin;
        
    
    public CPrincipal(){
        this.run();
    }
    
    public void run(){
        if (this.v == null){this.v = new VPrincipal(this);}
        this.v.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        
        if (boton == v.getBoton("Estadisticas")){
            if (cEstadisticas == null){cEstadisticas = new CEstadisticas(this);}
            v.setVisible(false);
            cEstadisticas.run();
        }else if (boton == v.getBoton("Torneo")){
            cTorneo = new CPreTorneo(this);
            v.setVisible(false);
            cTorneo.run();
        }else if (boton == v.getBoton("Creditos")){
            if(cCreditos == null){cCreditos = new CCreditos(this);}
            v.setVisible(false);
            cCreditos.run();
        }else if (boton == v.getBoton("Registrarse")){
            
            if(cLogin == null){cLogin = new CLogin(this);}
            v.setVisible(false);
            cLogin.run();
            
        }else if(boton == v.getBoton("Jugar")){
            cJugar = new CPreJugar(this);
            v.setVisible(false);
            cJugar.run();
        }
    }
    
}
