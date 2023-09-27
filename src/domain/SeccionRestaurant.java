package domain;

import java.util.Arrays;

public class SeccionRestaurant {
	public static final Integer CANTIDAD_MESAS = 3;

	private String seccionId;
	private String seccionName;
	private Mesa[] mesas;

	public SeccionRestaurant(String seccionId, String seccionName) {
		this.seccionId = seccionId;
		this.seccionName = seccionName;
		this.mesas = new Mesa[CANTIDAD_MESAS];
	}

	public SeccionRestaurant(String seccionId, String seccionName, Integer numeroMesas) {
		this.seccionId = seccionId;
		this.seccionName = seccionName;
		this.mesas = new Mesa[numeroMesas];
	}

	public String getSeccionName() {
		return seccionName;
	}

	public void setSeccionName(String seccionName) {
		this.seccionName = seccionName;
	}

	public String getSeccionId() {
		return seccionId;
	}

	public void setSeccionId(String seccionId) {
		this.seccionId = seccionId;
	}

	public Mesa[] getMesas() {
		return mesas;
	}

	public void setMesas(Mesa[] mesas) {
		this.mesas = mesas;
	}

	public static Integer getCantidadMesas() {
		return CANTIDAD_MESAS;
	}

	// Metodo para agregar mesas a la secccion
	public void addMesa(Mesa mesa) {
		int i = 0;
		while (i < mesas.length) {
			if (this.mesas[i] == null) {
				this.mesas[i] = mesa;
				break;
			}
			i++;
		}
		if (i >= mesas.length) {
			System.out.println("ERROR: Seccion completa");
		}

	}

	// Metodo para saber cantidad de mesas
	private int saberMesasPorSeccion() {
		int cantidad = 0;
		for (int i = 0; i < mesas.length; i++) {
			if (mesas[i] != null) {
				cantidad = cantidad + 1;
			}
		}
		return cantidad;
	}

	// Metodo para saber estado de las mesas
	private int saberMesasPorSeccionPorEstado(String estado) {
		int cantidad = 0;
		for (int i = 0; i < mesas.length; i++) {
			if (mesas[i] != null && mesas[i].getMesaDisponibilidad().equals(estado)) {
				cantidad = cantidad + 1;
			}
		}
		return cantidad;
	}

	// Metodo para saber reservadas
	public int mesasReservadas() {
		return saberMesasPorSeccionPorEstado(Mesa.ESTADO_RESERVADA);
	}

	// Metodo para saber ocupadas
	public int mesasLibres() {
		return saberMesasPorSeccionPorEstado(Mesa.ESTADO_LIBRE);
	}

	@Override
	public String toString() {
		return "Seccion ID: " + seccionId + "(" + seccionName + ")" + "\nMesas: " + Arrays.toString(mesas);
	}

}
