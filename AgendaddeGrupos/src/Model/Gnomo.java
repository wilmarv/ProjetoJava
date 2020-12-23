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
public class Gnomo extends Raca{
    
    @Override
    public void setModificadoresAtributo(Atributos atributos) {
       atributos.setIntelecto((int)(atributos.getIntelecto() * 1.09));
       atributos.setAceleracao((int)(atributos.getAceleracao() * 1.15));
    }
}
