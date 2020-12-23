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
public class Humano extends Raca{

    @Override
    public void setModificadoresAtributo(Atributos atributos) {
        atributos.setAcertoCritico((int)(atributos.getAcertoCritico() * 1.08));
        atributos.setMaestria((int)(atributos.getMaestria()* 1.08));
        atributos.setAceleracao((int)(atributos.getAceleracao() * 1.08));
    }
    
}
