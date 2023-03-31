package devs_pizza.controller;

import java.util.ArrayList;

import devs_pizza.model.Devs_Pizza;
import devs_pizza.repository.Devs_pizzaRepository;

public class Devs_PizzaController implements Devs_pizzaRepository{
	private ArrayList<Devs_Pizza> listarhistorico = new ArrayList<Devs_Pizza>();

	@Override
	public void historicodevenda() {
		for (var x : listarhistorico) {
            x.visualizar();
		}
	}

	@Override
	public void faturamentomensal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faturmanetoanual() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarpedido(Devs_Pizza pedido) {
		 listarhistorico.add(pedido);
		
	}

}
