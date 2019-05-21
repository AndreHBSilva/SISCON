/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author André Hugo
 */
public class ContaCorrente extends Banco{
    private double limite;
    
    public ContaCorrente(String nome, String agencia, int numero, double limite){
        super(nome, agencia, numero);
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double valor){
        if((valor > 0 ) && (valor <= (this.saldo + this.getLimite()))){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
}
