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
public abstract class Conta {
    private String nome;
    protected double saldo;
    //Conta ct = new Conta();
    
    public Conta(String nome) {
        this.setNome(nome);
    }
    
    public abstract boolean sacar(double valor);
    
    public boolean depositar(double valor)
    {
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    public void transferir(int ct){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 3){
            this.nome = nome;
        }else{
            this.nome = "Nome inválido!";
        }    
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
