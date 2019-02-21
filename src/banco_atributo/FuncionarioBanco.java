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
public class FuncionarioBanco {
    int codigo;
    String função;
    Endereco end;
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
        System.out.println("código");
    }
    
    public void cadastrarEndereco(Endereco end){
        this.end = end;
        System.out.println("endereco");
    }
}
