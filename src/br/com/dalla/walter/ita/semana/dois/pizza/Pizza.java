package br.com.dalla.walter.ita.semana.dois.pizza;


import java.util.*;

public class Pizza {

    private List<String> listaIngredientes = new ArrayList<>();
    private String nomeDaPizza = "Pizza";
    private static HashMap <String, Integer> map = new HashMap<>();

    public Pizza(String nomeDaPizza) {
        this.nomeDaPizza = nomeDaPizza;
    }
    
    public void adicionaIngrediente(String ingredienteParaAdicionar){
        boolean ingredienteJaExisteNaPizza = false;
        ingredienteParaAdicionar = ingredienteParaAdicionar.toLowerCase().trim();

        //O mesmo ingrediente não pode ser adicionado na mesma pizza 2x
        for (String ingrediente : listaIngredientes) {
            if(ingredienteParaAdicionar.equals(ingrediente)) {
                ingredienteJaExisteNaPizza = true;
                break;
            }
        }

        if(!ingredienteJaExisteNaPizza){
            listaIngredientes.add(ingredienteParaAdicionar);
            contabilizaIngrediente(ingredienteParaAdicionar);
        }
    }

    private void contabilizaIngrediente(String ingrediente){
        Integer quantidade = map.get(ingrediente);
        if(quantidade == null)
            quantidade = 0;
        map.put(ingrediente, quantidade +1);
    }
    
    public Integer getPreco(){
        //Calculo do preço de acordo com o numero de ingredientes.
        int numeroIngredientes = listaIngredientes.size();

        if (numeroIngredientes <= 2)
            return 15;

        if (numeroIngredientes >= 3 && numeroIngredientes <= 5)
            return 20;

        return 23;
    }

    public List<String> getListaIngredientes() {
        return listaIngredientes;
    }

    public String getListaTodosOsIngredientesMap() {
        String listaDeIngrediente = "\n";
        Set<String> keys = map.keySet();
        for(String key : keys){
            listaDeIngrediente+= key+ " ->" +map.get(key) + "\n";
        }
        return listaDeIngrediente;
    }

    @Override
    public String toString() {
        String strIngredientes = " ";
        for (String ingredientes: listaIngredientes) {
            strIngredientes += ingredientes + ", ";
        }

        return "A pizza de "+ nomeDaPizza +" possui os seguintes ingredientes:"+ strIngredientes +"com valor da pizza é de:"+getPreco();
    }

    //Criador Walter Dalla Torre Neto.
}
