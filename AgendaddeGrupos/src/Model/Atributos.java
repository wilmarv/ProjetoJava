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
public class Atributos {
    private int força ;
    private int gilidade ;
    private int intelecto ;
    private int acertoCritico ;
    private int  maestria ;
    private int aceleracao ;

    public Atributos(int força, int gilidade, int intelecto, int acertoCritico, int maestria, int aceleracao) {
        this.força = força;
        this.gilidade = gilidade;
        this.intelecto = intelecto;
        this.acertoCritico = acertoCritico;
        this.maestria = maestria;
        this.aceleracao = aceleracao;
    }
    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getGilidade() {
        return gilidade;
    }

    public void setGilidade(int gilidade) {
        this.gilidade = gilidade;
    }

    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getAcertoCritico() {
        return acertoCritico;
    }

    public void setAcertoCritico(int acertoCritico) {
        this.acertoCritico = acertoCritico;
    }

    public int getMaestria() {
        return maestria;
    }

    public void setMaestria(int maestria) {
        this.maestria = maestria;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

   
}
