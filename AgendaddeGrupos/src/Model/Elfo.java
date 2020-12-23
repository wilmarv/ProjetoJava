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
public class Elfo extends Raca{
    @Override
    public void setModificadoresAtributo(Atributos atributos) {
       atributos.setGilidade((int)(atributos.getGilidade() * 1.15));
       atributos.setAcertoCritico((int)(atributos.getAcertoCritico() * 1.1));
    }
}
