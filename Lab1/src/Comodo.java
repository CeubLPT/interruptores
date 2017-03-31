
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandretorres
 */
public class Comodo {
    private String nome;
    private ArrayList<Interruptor> interruptores;
    
    public Comodo(){
        // Inicializa o ArrayList
        interruptores = new ArrayList<>();
    }
    
    public void conecta(Interruptor interruptor){
        interruptores.add(interruptor);
    }
    
    public void apagaTodos(){
        for (Interruptor i:interruptores){
            if (i.getLampada().isAceso())
                    i.aciona();
        }
    }
    
    public void acendeTodos(){
        for (Interruptor i:interruptores){
            if (!i.getLampada().isAceso())
                    i.aciona();
        }        
    }
    
    public double obtemIluminacao(){
        double acesos = 0, total = interruptores.size();
        for (Interruptor i:interruptores){
            if (i.getLampada().isAceso()){
                acesos++;
            }
                    
        }

        return acesos / total * 100;
    }
    
}
