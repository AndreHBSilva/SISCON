/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(1554);
        System.out.println(cc.getNumero());
    }
}
