/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wilmar
 */
public class Player {
    private  String nick;
    private String Função;
    private String Classes;
    private Raca raca;
    private Atributos atributos;
    private int ilvl;

    public Player(Raca raca) {
        this.raca= raca;
        atributos = new Atributos(145, 145, 145, 145, 145, 145);
        raca.setModificadoresAtributo(atributos);
    }

    public Atributos setAtributo(){
        return atributos;
    }
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getFunção() {
        return Função;
    }

    public void setFunção(String Função) {
        this.Função = Função;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String Classes) {
        this.Classes = Classes;
    }

    public int getIlvl() {
        return ilvl;
    }

    public void setIlvl(int ilvl) {
        this.ilvl = ilvl;
    }
    
}
