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
			Object seleccionPesoOMasa = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión: ",				//da la opcion principal "menu de opciones"
					"Menu",JOptionPane.PLAIN_MESSAGE,null,
					new Object[] {"Conversor de monedas","Conversor de Masas"}, "Selecciona");
			
			
			
			if (seleccionPesoOMasa!= null) {				//En caso de seleccionar cancelar esto no correra
				
				String seleccionPesoMasa = seleccionPesoOMasa.toString();
				if (seleccionPesoMasa == "Conversor de monedas") {
					
					String convertirAMonedas = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir");
					
					if(convertirAMonedas.matches("[0-9]+")) {
						
						 Double convertirAMonedas1 = Double.parseDouble(convertirAMonedas);
						Object seleccionDeMoneda = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero: ", "Monedas",JOptionPane.PLAIN_MESSAGE,null,
								new Object[] {"Pesos Mxn a Dólares","Pesos Mxn a Euros","Pesos Mxn a Libras Esterlinas","Pesos Mxn a Yenes","Pesos Mxn a Sur-Korean Won","Dólar a Pesos Mxn"
										,"Euros a Pesos Mxn","Libras Esterlinas a Pesos Mxn","Yenes a Pesos Mxn", "Sur-korean Won a Pesos Mxn"},"Pesos Mxn a Euros");
						
						if (seleccionDeMoneda!= null) {
							String seleccionMoneda = seleccionDeMoneda.toString();
							
							switch (seleccionMoneda) {
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
							JOptionPane.showMessageDialog(null, "Programa finalizado"); // En caso de presionar "cancel" en el segundo showinput
							break;
						}
						
						}else {
							JOptionPane.showMessageDialog(null, "valor no válido"); //En caso de no ingresar valores numericos
						}
					
					
					
					
				}
				else {
					String convertirAMasa = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Masa que desea convertir");
					
					
					if(convertirAMasa.matches("[0-9]+")) {
						Object seleccionDeMasa = JOptionPane.showInputDialog(null, "Elije el tipo de masa a la que deseas convertir: ", "Masas",JOptionPane.PLAIN_MESSAGE,null,
								new Object[] {"Gramos a Onzas","Gramos a Libras","Gramos a Kilogramos","Gramos a Toneladas","Gramos a Libras","Onzas a Gramos","Onzas a Libras"
										,"Onzas a Kilogramos","Onzas a Toneladas","Libras a Gramos", "Libras a Onzas","Libras a Kilogramos", "Libras a Toneladas"
										, "Kilogramos a Gramos", "Kilogramos a Onzas", "Kilogramos a Libras", "Kilogramos a Toneladas", "Toneladas a Gramos", "Toneladas a Onzas"
										, "Toneladas a Libras", "Toneladas a Kilogramos"}, "Gramos a Onzas");
						Double convertirMasa = Double.parseDouble(convertirAMasa);
						
						if (seleccionDeMasa!=null) {
							String seleccionMasa = seleccionDeMasa.toString();
							
							switch (seleccionMasa) {
							case "Gramos a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Onzas es: "+ conversionesDefault.gramosAOz(convertirMasa) + " Onzas");
								break;
							case "Gramos a Libras":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Libras es: "+ conversionesDefault.gramosALibras(convertirMasa) + " Libras");
							break;
							case "Gramos a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Kilogramos es: "+ conversionesDefault.gramosAKg(convertirMasa) + " Kilogramos");
							break;
							case "Gramos a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Gramos a Toneladas es: "+ conversionesDefault.gramosATon(convertirMasa) + " Toneladas");
							break;
							case "Onzas a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Gramos es: "+ conversionesDefault.ozAgramos(convertirMasa) + " Gramos");
							break;
							case "Onzas a Libras":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Libras es: "+ conversionesDefault.ozALibras(convertirMasa) + " Libras");
							break;
							case "Onzas a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Kilogramos es: "+ conversionesDefault.ozAKg(convertirMasa) + " Kilogramos");
							break;
							case "Onzas a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Onzas a Toneladas es: "+ conversionesDefault.ozATon(convertirMasa) + " Toneladas");
							break;
							case "Libras a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Libras a Gramos es: "+ conversionesDefault.librasaGramos(convertirMasa) + " Gramos");
							break;
							case "Libras a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Libras a Onzas es: "+ conversionesDefault.librasaOnzas(convertirMasa) + " Onzas");
							break;
							case "Libras a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Libras a Kilogramos es: "+ conversionesDefault.librasaKilos(convertirMasa) + " Kilograos");
							break;
							case "Libras a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Libras a Toneladas es: "+ conversionesDefault.librasaToneladas(convertirMasa) + " Toneladas");
							break;
							case "Kilogramos a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Gramos es: "+ conversionesDefault.kgAgramos(convertirMasa) + " Gramos");
							break;
							case "Kilogramos a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Onzas es: "+ conversionesDefault.kgAOz(convertirMasa) + " Onzas");
							break;
							case "Kilogramos a Libras":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Libras es: "+ conversionesDefault.kgALibras(convertirMasa) + " Libras");
							break;
							case "Kilogramos a Toneladas":JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Toneladas es: "+ conversionesDefault.kgATon(convertirMasa) + " Toneladas");
							break;
							case "Toneladas a Gramos":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Gramos es: "+ conversionesDefault.tonAgramos(convertirMasa) + " Gramos");
							break;
							case "Toneladas a Onzas":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Onzas es: "+ conversionesDefault.tonAoz(convertirMasa) + " Onzas");
							break;
							case "Toneladas a Libras":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Libras: "+ conversionesDefault.tonALibras(convertirMasa) + " Libras");
							break;
							case "Toneladas a Kilogramos":JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Kilogramos es: "+ conversionesDefault.tonaKg(convertirMasa) + " Kilogramos");
							break;
							
							default:
								break;
							}
						}else {
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							break;
						}
					}else {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					
					
				
					
				}
				bucle = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
				if (bucle >0) {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado"); //en caso de cancelar el primer showinput
				break;
			}
			
			
		} while (bucle == 0);
		
		
		
		
	}
}
