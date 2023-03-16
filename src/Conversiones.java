
import java.text.DecimalFormat;

public class Conversiones {
	DecimalFormat df = new DecimalFormat("#.##");
	
	public String MxaDolar(double valor){
		valor = valor/ 17.95; 
		return df.format(valor);
	}
	public String MxaEuro(double valor) {
	
		valor= valor/18.95;
		return df.format(valor);
			
	}
	public String MxaLibrasEsterlinas(double valor) {
		valor= valor/21.28;
		return df.format(valor);
	}
	public String MxaYenes(double valor) {
		valor =  valor*7.23;
		return df.format(valor);
	}
	public String MxaWones(double valor) {
		valor = valor * 73.49;
		return df.format(valor);
	}
	public String DolaraMx(double valor) {
		valor =  valor * 17.95;
		return df.format(valor);
	}
	public String EuroaMx(double valor) {
		valor = valor * 18.95;
		return df.format(valor);
		
	}
	public String LibrasEsterlinasaMx(double valor) {
		valor = valor * 21.28;
		return df.format(valor);
	}
	public String YenesaMx(double valor) {
		valor = valor * 0.13;
		return df.format(valor);
	}
	public String WonesaMx(double valor) {
		valor = valor * 0.014;
		return df.format(valor);
	}
	public String kgAgramos(double valor) {
		valor = valor * 1000;
		return df.format(valor);
	}
	public String kgAOz(double valor) {
		valor = valor * 35.2739619496;
		return df.format(valor);
	}
	public String kgATon(double valor) {
		valor = valor * 0.001;
		return df.format(valor);
	}
	public String gramosAKg(double valor) {
		valor = valor/1000;
		return df.format(valor);
	}
	public String gramosAOz(double valor) {
		valor = valor/28.34952315;
		return df.format(valor);
	}
	public String gramosATon(double valor) {
		valor= valor/1000000;
		return df.format(valor);
	}
	public String ozAgramos(double valor) {
		valor=  valor*28.34952315;
		return df.format(valor);
	}
	public String ozAKg(double valor) {
		valor= valor*0.0283495231;
		return df.format(valor);
	}
	public String ozATon(double valor) {
		valor= valor*0.0000283495;
		return df.format(valor);
	}
	public String tonAgramos(double valor) {
		valor=  valor*1000000;
		return df.format(valor);
	}
	public String tonAoz(double valor) {
		valor = valor * 35273.96194958;
		return df.format(valor);
	}
	public String tonaKg(double valor ) {
		valor= valor * 1000;
		return df.format(valor);
	}
	public String gramosALibras(double valor) {
		valor = valor * 0.0022046226;
		return df.format(valor);
	}
	public String librasaGramos(double valor) {
		valor = valor * 453.59237;
		return df.format(valor);
	}
	public String librasaOnzas(double valor) {
		valor = valor/ 16;
		return df.format(valor);
	}
	public String librasaKilos(double valor) {
		valor = valor * 0.45359237;
		return df.format(valor);
	}
	public String librasaToneladas(double valor) {
		valor = valor * 0.0004535924;
		return df.format(valor);
	}
	public String ozALibras (double valor) {
		valor = valor / 16;
		return df.format(valor);
	}
	public String kgALibras (double valor) {
		valor = valor / 0.45359237;
		return df.format(valor);
	}
	public String tonALibras (double valor) {
		valor = valor / 0.0004535924;
		return df.format(valor);
	}
	
}

