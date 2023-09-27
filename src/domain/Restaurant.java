package domain;

import java.util.Arrays;

public class Restaurant {
	public static final Integer CANTIDAD_SECCIONES = 3;
	
	private String restNombre;
	SeccionRestaurant[] secciones;
	
	
	
	public Restaurant() {
		
	}
	

	
	
	public Restaurant(String restNombre) {
		super();
		this.restNombre = restNombre;
		this.secciones = new SeccionRestaurant[CANTIDAD_SECCIONES];
	}
	
	
	public Restaurant(String restNombre, int cantidadSecciones) {
		super();
		this.restNombre = restNombre;
		this.secciones = new SeccionRestaurant[cantidadSecciones];
	}




	public String getRestNombre() {
		return restNombre;
	}
	public void setRestNombre(String restNombre) {
		this.restNombre = restNombre;
	}
	public SeccionRestaurant[] getSeccion() {
		return secciones;
	}
	public void setSeccion(SeccionRestaurant[] seccion) {
		this.secciones = seccion;
	}

	
	
	
	
	
	
	// Metodo para agregar mesas a la secccion
		public void addSeccion(SeccionRestaurant seccion) {
			int i = 0;
			while (i < secciones.length) {
				if (this.secciones[i] == null) {
					this.secciones[i] = seccion;
					break;
				}
				i++;
			}
			if (i >= secciones.length) {
				System.out.println("ERROR: Seccion completa");
			}

		}

//		// Metodo para saber cantidad de mesas
//		private int saberMesasPorSeccion() {
//			int cantidad = 0;
//			for (int i = 0; i < secciones.length; i++) {
//				if (secciones[i] != null) {
//					cantidad = cantidad + 1;
//				}
//			}
//			return cantidad;
//		}
//
//		// Metodo para saber estado de las mesas
//		private int saberMesasPorSeccionPorEstado(String estado) {
//			int cantidad = 0;
//			for (int i = 0; i < secciones.length; i++) {
//				if (secciones[i] != null && secciones[i].getMesaDisponibilidad().equals(estado)) {
//					cantidad = cantidad + 1;
//				}
//			}
//			return cantidad;
//		}

		
		// Metodo para saber reservadas
//		public int mesasReservadas() {
//			return saberMesasPorSeccionPorEstado(Mesa.ESTADO_RESERVADA);
//		}
//
//		//Metodo para saber ocupadas
//		public int mesasLibres() {
//			return saberMesasPorSeccionPorEstado(Mesa.ESTADO_LIBRE);
//		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	@Override
	public String toString() {
		return "Nombre restaurant: " + restNombre + "\nSecciones: " + Arrays.toString(secciones);
	}
	
	
	
	
}
