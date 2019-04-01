
package com.joel.collections;

import com.joel.collections.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel Henrique Silva Santos
 */
public class Main {
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<>();
        //ArrayList<Pessoa> pessoas = new ArrayList<>();
        //Collection<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(new Pessoa(1, "Joel"));
        pessoas.add(new Pessoa(2, "Henrique"));
        
        System.out.println(pessoas.toString());
        
    }
}
