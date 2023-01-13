package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void  ConvertirPesosMexicanosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 19.15;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void  ConvertirPesosMexicanosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 20.58;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void  ConvertirPesosMexicanosALibra(double valorRecibido) {
		double monedaLibra = valorRecibido / 23.18;
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras");
	}
	
	public void  ConvertirPesosMexicanosAYen(double valorRecibido) {
		double monedaYen = valorRecibido / 0.14;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yenes");
	}
	public void  ConvertirPesosMexicanosAWon(double valorRecibido) {
		double monedaWon = valorRecibido / 0.015;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wones");
	}

}
