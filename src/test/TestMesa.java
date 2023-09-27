package test;

import domain.Mesa;
import domain.Restaurant;
import domain.SeccionRestaurant;

public class TestMesa {

	public static void main(String[] args) {

		//	Creo el restaurant
		Restaurant rest1 = new Restaurant("el pepito");

		//	Creo una seccion del restaurant
		SeccionRestaurant seccion1 = new SeccionRestaurant("456", "Patio");
		
		//	Creo varias mesas
		Mesa mesa1 = new Mesa("123", 4, Mesa.ESTADO_LIBRE);
		Mesa mesa2 = new Mesa("456", 8, Mesa.ESTADO_RESERVADA);
		Mesa mesa3 = new Mesa("789", 3, Mesa.ESTADO_LIBRE);
		Mesa mesa4 = new Mesa("ABC", 9, Mesa.ESTADO_RESERVADA);

		//	Agrego las mesas a esa seccion
		seccion1.addMesa(mesa1);
		seccion1.addMesa(mesa2);
		seccion1.addMesa(mesa3);
		seccion1.addMesa(mesa4);

		System.out.println("\n");

		//	Creo otra seccion del restaurant
		SeccionRestaurant seccion2 = new SeccionRestaurant("1234", "Terraza", 4);
		
		//	Creo mas mesas para esa seccion
		Mesa mesa5 = new Mesa("004", 9, Mesa.ESTADO_LIBRE);
		Mesa mesa6 = new Mesa("005", 33, Mesa.ESTADO_LIBRE);
		Mesa mesa7 = new Mesa("003", 12, Mesa.ESTADO_LIBRE);
		Mesa mesa8 = new Mesa("020", 14, Mesa.ESTADO_RESERVADA);

		//	Agrego esas mesas
		seccion2.addMesa(mesa5);
		seccion2.addMesa(mesa6);
		seccion2.addMesa(mesa7);
		seccion2.addMesa(mesa8);

		
		//	Agrego las secciones al restaurant
		rest1.addSeccion(seccion1);
		rest1.addSeccion(seccion2);

		
		//	Muestro el restaurant
		System.out.println(rest1.toString());
		System.out.println("\n------\n");

		
		//	Muestro detalle de las secciones
		
		System.out.println("La seccion 1 (" + seccion1.getSeccionName() + " - " + seccion1.getSeccionId() + ") tiene "
				+ seccion1.mesasReservadas() + " mesas reservadas.");
		System.out.println("La seccion 1 (" + seccion1.getSeccionName() + " - " + seccion1.getSeccionId() + ") tiene "
				+ seccion1.mesasLibres() + " mesas libres.");

		
		
		System.out.println("La seccion 2 (" + seccion2.getSeccionName() + " - " + seccion2.getSeccionId() + ") tiene "
				+ seccion2.mesasReservadas() + " mesas reservadas.");
		System.out.println("La seccion 2 (" + seccion2.getSeccionName() + " - " + seccion2.getSeccionId() + ") tiene "
				+ seccion2.mesasLibres() + " mesas libres.");

	}

}
