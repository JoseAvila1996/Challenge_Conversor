import javax.swing.*;
import javax.swing.plaf.synth.SynthScrollBarUI;

import org.w3c.dom.ls.LSInput;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	
	public Frame() {
		super("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,300));
		Conversiones conversionesDefault = new Conversiones();
		
		setLayout(new BorderLayout());
		
		int bucle = 0;
		
		do {
			String seleccionPesoOMasa = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión: ", "Menu",JOptionPane.PLAIN_MESSAGE,null,
					new Object[] {"Conversor de monedas","Conversor de Masas"}, "Selecciona")).toString();
			
			if (seleccionPesoOMasa == "Conversor de monedas") {
				
				String convertirAMonedas = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir");
				
				if(convertirAMonedas.matches("[0-9]+")) {
					
					 Double convertirAMonedas1 = Double.parseDouble(convertirAMonedas);
					String seleccionDeMoneda = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero: ", "Monedas",JOptionPane.PLAIN_MESSAGE,null,
							new Object[] {"Pesos Mxn a Dólares","Pesos Mxn a Euros","Pesos Mxn a Libras Esterlinas","Pesos Mxn a Yenes","Pesos Mxn a Sur-Korean Won","Dólar a Pesos Mxn"
									,"Euros a Pesos Mxn","Libras Esterlinas a Pesos Mxn","Yenes a Pesos Mxn", "Sur-korean Won a Pesos Mxn"},"Pesos Mxn a Euros")).toString();
					
					switch (seleccionDeMoneda) {
					case "Pesos Mxn a Dólares":JOptionPane.showMessageDialog(null, "la conversion de Mxn a Dolares es: "+ conversionesDefault.MxaDolar(convertirAMonedas1) + " Dolares");
						break;
					case "Pesos Mxn a Euros": JOptionPane.showMessageDialog(null, "la conversion de Mxn a Euros es: "+ conversionesDefault.MxaEuro(convertirAMonedas1) + " Euros");
						break;
					case "Pesos Mxn a Libras Esterlinas": JOptionPane.showMessageDialog(null, "la conversion de Mxn a Libras Esterlinas es: "+ conversionesDefault.MxaLibrasEsterlinas(convertirAMonedas1) + " Libras Esterlinas");
						break;
					case "Pesos Mxn a Yenes": JOptionPane.showMessageDialog(null, "la conversion de Mxn a Yenes es: "+ conversionesDefault.MxaYenes(convertirAMonedas1) + " Yenes");
						break;
					case "Pesos Mxn Sur-Korean Won": JOptionPane.showMessageDialog(null, "la conversion de Mxn a Won es: "+ conversionesDefault.MxaWones(convertirAMonedas1) + " Won");
						break;
					case "Dólar a Pesos Mxn": JOptionPane.showMessageDialog(null, "la conversion de Dolares a Pesos Mxn es: "+ conversionesDefault.DolaraMx(convertirAMonedas1) + " Pesos Mxn");
						break;
					case "Euros a Pesos Mxn": JOptionPane.showMessageDialog(null, "la conversion de Euros a Pesos Mxn es: "+ conversionesDefault.YenesaMx(convertirAMonedas1) + " Pesos Mxn");
						break;
					case "Libras Esterlinas a Pesos Mxn": JOptionPane.showMessageDialog(null, "la conversion de Libras Esterlinas a Pesos Mxn es:: "+ conversionesDefault.LibrasEsterlinasaMx(convertirAMonedas1) + " Pesos Mxn");
						break;
					case "Yenes a Pesos Mxn": JOptionPane.showMessageDialog(null, "la conversion de Yenes Pesos Mxn es: "+ conversionesDefault.YenesaMx(convertirAMonedas1) + " Pesos Mxn");
						break;
					case "Sur-Korean Won a Pesos Mxn": JOptionPane.showMessageDialog(null, "la conversion de Won a Pesos Mxn es: "+ conversionesDefault.WonesaMx(convertirAMonedas1) + " Pesos Mxn");
					break;
					default:
						break;
					}
				}else {
					JOptionPane.showMessageDialog(null, "valor no válido");
				}
				
				
				
			}
			else {
				Double convertirAMasa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Masa que desea convertir"));
				String seleccionDeMasa = (JOptionPane.showInputDialog(null, "Elije el tipo de masa a la que deseas convertir: ", "Masas",JOptionPane.PLAIN_MESSAGE,null,
						new Object[] {"Gramos a Onzas","Gramos a Libras","Gramos a Kilogramos","Gramos a Toneladas","Gramos a Libras","Onzas a Gramos","Onzas a Libras"
								,"Onzas a Kilogramos","Onzas a Toneladas","Libras a Gramos", "Libras a Onzas","Libras a Kilogramos", "Libras a Toneladas"
								, "Kilogramos a Gramos", "Kilogramos a Onzas", "Kilogramos a Libras", "Kilogramos a Toneladas", "Toneladas a Gramos", "Toneladas a Onzas"
								, "Toneladas a Libras", "Toneladas a Kilogramos"}, "Gramos a Onzas")).toString();
				
				switch (seleccionDeMasa) {
				case "Gramos a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Onzas es: "+ conversionesDefault.gramosAOz(convertirAMasa) + " Onzas");
					break;
				case "Gramos a Libras":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Libras es: "+ conversionesDefault.gramosALibras(convertirAMasa) + " Libras");
				break;
				case "Gramos a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Kilogramos es: "+ conversionesDefault.gramosAKg(convertirAMasa) + " Kilogramos");
				break;
				case "Gramos a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Toneladas es: "+ conversionesDefault.gramosATon(convertirAMasa) + " Toneladas");
				break;
				case "Onzas a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Gramos es: "+ conversionesDefault.ozAgramos(convertirAMasa) + " Gramos");
				break;
				case "Onzas a Libras":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Libras es: "+ conversionesDefault.ozALibras(convertirAMasa) + " Libras");
				break;
				case "Onzas a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Kilogramos es: "+ conversionesDefault.ozAKg(convertirAMasa) + " Kilogramos");
				break;
				case "Onzas a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Toneladas es: "+ conversionesDefault.ozATon(convertirAMasa) + " Toneladas");
				break;
				case "Libras a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Libras a Gramos es: "+ conversionesDefault.librasaGramos(convertirAMasa) + " Gramos");
				break;
				case "Libras a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Libras a Onzas es: "+ conversionesDefault.librasaOnzas(convertirAMasa) + " Onzas");
				break;
				case "Libras a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Libras a Kilogramos es: "+ conversionesDefault.librasaKilos(convertirAMasa) + " Kilograos");
				break;
				case "Libras a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Libras a Toneladas es: "+ conversionesDefault.librasaToneladas(convertirAMasa) + " Toneladas");
				break;
				case "Kilogramos a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Gramos es: "+ conversionesDefault.kgAgramos(convertirAMasa) + " Gramos");
				break;
				case "Kilogramos a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Onzas es: "+ conversionesDefault.kgAOz(convertirAMasa) + " Onzas");
				break;
				case "Kilogramos a Libras":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Libras es: "+ conversionesDefault.kgALibras(convertirAMasa) + " Libras");
				break;
				case "Kilogramos a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Toneladas es: "+ conversionesDefault.kgATon(convertirAMasa) + " Toneladas");
				break;
				case "Toneladas a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Gramos es: "+ conversionesDefault.tonAgramos(convertirAMasa) + " Gramos");
				break;
				case "Toneladas a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Onzas es: "+ conversionesDefault.tonAoz(convertirAMasa) + " Onzas");
				break;
				case "Toneladas a Libras":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Libras: "+ conversionesDefault.tonALibras(convertirAMasa) + " Libras");
				break;
				case "Toneladas a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Kilogramos es: "+ conversionesDefault.tonaKg(convertirAMasa) + " Kilogramos");
				break;
				
				default:
					break;
				}
				
			}
			bucle = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			if (bucle >0) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}
			
		} while (bucle == 0);
		
		
		
		
	}
}
