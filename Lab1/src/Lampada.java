/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandretorres
 */
class Lampada {
    private boolean aceso;

    public Lampada(){
        aceso = false;
    }
    
    public void acende(){
        aceso = true;
    }
    
    public void apaga(){
        aceso = false;
    }
    
    public boolean isAceso(){
        return aceso;
    }
}
