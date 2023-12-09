
public class CuentaCorriente {
		public String nombreTitular;
		String DNI;
		private double saldo;
		
		
		public CuentaCorriente(String nombreTitular, String dNI, double saldo) {
			super();
			this.nombreTitular = nombreTitular;
			DNI = dNI;
			this.saldo = 0;
		}
		
		
		
		public CuentaCorriente(String dNI, double saldo) {
			super();
			DNI = dNI;
			this.saldo = saldo;
		}

		

		public CuentaCorriente(String nombreTitular, String dNI) {
			super();
			this.nombreTitular = nombreTitular;
			DNI = dNI;
			
		}



		public boolean sacarDinero(double cantidad) {
			boolean transaccionPosible=false;
			
			if(this.saldo>=cantidad) {
				this.saldo-=cantidad;
				transaccionPosible=true;
			}else {
				transaccionPosible=false;
			}
			return transaccionPosible;
			
		}
		
		public void ingresarDinero(int cantidad) {
			this.saldo+=cantidad;
		}
		
		public void mostrarInformacion() {
			String str="Nombre Titular: "+this.nombreTitular+"\nDNI: "+this.DNI+"\nSaldo: "+this.saldo;
			System.out.println(str);
		}

		public String getNombreTitular() {
			return nombreTitular;
		}

		public void setNombreTitular(String nombreTitular) {
			this.nombreTitular = nombreTitular;
		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		
}


