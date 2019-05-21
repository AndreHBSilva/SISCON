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
public class Poupanca extends Banco{
    private int aniversario;
    
    public Poupanca(String nome, String agencia, int numero){
        super(nome, agencia, numero);
    }
    
    public Poupanca(String nome, String agencia, int numero, int aniversario){
        super(nome, agencia, numero);
        this.setAniversario(aniversario);
    }
    
    public double rendimento(double taxa){
        return taxa*saldo/100 + saldo;
    }

    public int getAniversario() {
        return aniversario;
    }

    public boolean setAniversario(int aniversario) {
        if ((aniversario > 0) && (aniversario < 32)){
            this.aniversario = aniversario;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean sacar(double valor){
        if((valor > 0) && (valor <= this.saldo)){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
}
