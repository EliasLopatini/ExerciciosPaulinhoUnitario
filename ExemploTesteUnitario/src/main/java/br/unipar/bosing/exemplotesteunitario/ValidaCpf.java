
package br.unipar.bosing.exemplotesteunitario;

/**
 *
 * @author 00236544
 */
public class ValidaCpf {
    
    public boolean validador(String cpf){
        if(cpf.length() == 11){ 
            return true;
        } 
        return false;
    }
}

