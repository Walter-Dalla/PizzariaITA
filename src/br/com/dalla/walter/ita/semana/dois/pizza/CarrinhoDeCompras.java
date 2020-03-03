package br.com.dalla.walter.ita.semana.dois.pizza;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{

    private List<Pizza> listaPizzas = new ArrayList<>();

    int valortotal(){
        Integer valorTotal = 0;

        for (Pizza pizza : listaPizzas)
            valorTotal += pizza.getPreco();

        return valorTotal;
    }

    public void adicionaPizzaAoCarrinho(Pizza pizza){
        if(pizza.getListaIngredientes().isEmpty())
            System.out.println("A pizza deve possuir no minimo 1 ingrediente");
        else
            listaPizzas.add(pizza);
    }
	//Criador Walter Dalla Torre Neto.
}