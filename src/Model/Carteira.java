/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aluno
 */
public class Carteira extends Conta {
    
    @Override
    public boolean sacar(double valor){
        if ((valor > 0 ) && (valor <= this.saldo)){
            this.saldo -= valor;
            return true;
        }else{
            return false;  
        }
    }
    
    
}