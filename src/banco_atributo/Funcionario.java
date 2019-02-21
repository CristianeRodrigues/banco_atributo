/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_atributo;

/**
 *
 * @author Cristiane
 */
public class Funcionario {
    int codigo;
    String função;
    Endereco end;
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void cadastrarEndereco(Endereco end){
        this.end = end;
        System.out.println("endereco");
    }
    public int getNumero(){
        return end.numero;
    }
    public void setCidade(String cidade){
        end.cidade=cidade;
    }
}
