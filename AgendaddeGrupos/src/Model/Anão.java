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
public class Anão extends Raca{
    @Override
    public void setModificadoresAtributo(Atributos atributos) {
       atributos.setForça((int)(atributos.getForça() * 1.20));
    }
}
