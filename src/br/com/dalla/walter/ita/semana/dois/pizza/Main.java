package br.com.dalla.walter.ita.semana.dois.pizza;

public class Main {

    public static void main(String[] args) {
        Pizza portuguesa = new Pizza("Portuguesa");
        portuguesa.adicionaIngrediente("ovos");
        portuguesa.adicionaIngrediente("milho");
        portuguesa.adicionaIngrediente("ervilha");
        portuguesa.adicionaIngrediente("queijo");
        portuguesa.adicionaIngrediente("presunto");
        portuguesa.adicionaIngrediente("tomate");


        Pizza mucarela = new Pizza("Muçarela");
        mucarela.adicionaIngrediente("molho");
        mucarela.adicionaIngrediente("gorgonzola");

        Pizza tresQueijos = new Pizza("Tres Queijos");
        tresQueijos.adicionaIngrediente("gorgonzola");
        tresQueijos.adicionaIngrediente("cheddar");
        tresQueijos.adicionaIngrediente("parmesão");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionaPizzaAoCarrinho(mucarela);
        carrinhoDeCompras.adicionaPizzaAoCarrinho(portuguesa);
        carrinhoDeCompras.adicionaPizzaAoCarrinho(tresQueijos);

        System.out.println(mucarela.toString());
        System.out.println(portuguesa.toString());
        System.out.println(tresQueijos.toString());

        System.out.println("O total do carrinho de compra é: " + carrinhoDeCompras.valortotal());// obs: a chamada do valor total do objeto portuguesa ja � feito na linha de codigo para que nao comtabilize 2x.

        System.out.println("os ingredientes utilizados no pedido foram: "+new Pizza("pizza").getListaTodosOsIngredientesMap());
    }
    //Criador Walter Dalla Torre Neto.
}
