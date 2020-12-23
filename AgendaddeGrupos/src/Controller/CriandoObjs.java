/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Guild;
import Model.Player;
import Model.Humano;
import Model.Anão;
import Model.Elfo;
import Model.Gnomo;
import Model.Raca;

/**
 *
 * @author Wilmar
 */
public class CriandoObjs {
    
    ControllerBD Controller = new ControllerBD();
    
    
    public boolean criarGuild(String nome,String lider,String server){
        Guild objetoGuild = new Guild();        
        objetoGuild.setNome(nome);
        objetoGuild.setLider(lider);
        objetoGuild.setServidor(server);
        return Controller.adicionarGuild(objetoGuild);
    }
    
    public void criarPlayer(String nick,String raca,String Class,int ilvl,String funcao){
        Raca ra = null;
        if(raca.equals("Humano")){
            ra= new Humano();            
        }
        else if(raca.equals("Gnomo")){
            ra = new Gnomo();          
        }
        else if(raca.equals("Anão")){
            ra = new Anão();          
        }
        else if(raca.equals("Elfo")){
            ra = new Elfo();          
        }
        Player player = new Player(ra);
        player.setClasses(Class);
        player.setNick(nick);
        player.setIlvl(ilvl);
        player.setFunção(funcao);
        Controller.adicionarPlayer(player,Controller.selecionarGrupo(),raca);
    }    
}
