package Prueba2ej01;

//definir los atributos que salen en la hoja (numero de tarjeta, tipo de usuario, saldo, etc.)
//hacer los métodos 
//Por ejemplo, el abono de saldo es crear un método que le sume una cantidad al saldo

//Esa cantidad debe ser un parámetro del método


public class TarjetaP2ej01 {

		
		private int numeroDeTarjeta;
		private String tipoDeUsuario;
		private int saldo;  
		private int descuento;
		
		public TarjetaP2ej01() {
			super();
		}

		public TarjetaP2ej01(int numeroDeTarjeta, String tipoDeUsuario, int saldo, int descuento) {
			super();
			this.numeroDeTarjeta = numeroDeTarjeta;
			this.tipoDeUsuario = tipoDeUsuario;
			this.saldo = saldo;
			this.descuento = descuento;
		}

		public int getNumeroDeTarjeta() {
			return numeroDeTarjeta;
		}

		public void setNumeroDeTarjeta(int numeroDeTarjeta) {
			this.numeroDeTarjeta = numeroDeTarjeta;
		}

		public String getTipoDeUsuario() {
			return tipoDeUsuario;
		}

		public void setTipoDeUsuario(String tipoDeUsuario) {
			this.tipoDeUsuario = tipoDeUsuario;
		}

		public int getSaldo() {
			return saldo;
		}

		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}

		public int getDescuento() {
			return descuento;
		}

		public void setDescuento(int descuento) {
			this.descuento = descuento;
		}
		


}
