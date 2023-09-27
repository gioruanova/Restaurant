package domain;

public class Mesa {

	public static final String ESTADO_LIBRE = "Mesa Libre";
	public static final String ESTADO_RESERVADA = "Mesa Reservada";

	private String mesaId;
	private Integer mesaCapacidad;
	private String mesaDisponibilidad;

	public Mesa(String mesaId, Integer mesaCapacidad, String mesaDisponibilidad) {
		this.mesaId = mesaId;
		this.mesaCapacidad = mesaCapacidad;
		this.mesaDisponibilidad = mesaDisponibilidad;
	}

	public String getMesaId() {
		return mesaId;
	}

	public void setMesaId(String mesaId) {
		this.mesaId = mesaId;
	}

	public Integer getMesaCapacidad() {
		return mesaCapacidad;
	}

	public void setMesaCapacidad(Integer mesaCapacidad) {
		this.mesaCapacidad = mesaCapacidad;
	}

	public String getMesaDisponibilidad() {
		return mesaDisponibilidad;
	}

	public void setMesaDisponibilidad(String mesaDisponibilidad) {
		this.mesaDisponibilidad = mesaDisponibilidad;
	}

	@Override
	public String toString() {
		return "Mesa: " + this.mesaId + ", Capacidad: " + this.mesaCapacidad + ", Estado: " + this.mesaDisponibilidad;
	}

}
