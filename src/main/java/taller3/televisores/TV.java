package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV += 1;

	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(estado == true) {
			if(canal < 121 && canal > 0) {
				this.canal = canal;
			}	
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(estado) {
		this.volumen = volumen;
		}
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTv) {
		numTV = numTv;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public void turnOn() {
		this.estado = true;
		
	}
	
	public void turnOff () {
		this.estado = false;
		
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void canalUp () {
		if (estado) {
			if(canal <= 119 && canal > 0) {
				canal += 1;
			}			
		}
		
	}
	
	public void canalDown () {
		if (estado) {
			if(canal <= 120 && canal > 1) {
				canal -= 1;
			}		
		}
	}
	
	public void volumenUp () {
		if (estado) {
			if(volumen <= 6 && volumen > -1) {
				volumen += 1;
			}			
		}
		
	}
	
	public void volumenDown () {
		if (estado) {
			if(volumen <= 7 && volumen > 0) {
				volumen -= 1;
			}		
		}
	}
	
	
	
	

}
