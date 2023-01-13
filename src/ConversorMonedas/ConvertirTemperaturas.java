package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
	
	public void  ConvertirCelsiusAFahrenheit(double valorRecibido) {
		double gradosFahrenheit = valorRecibido / 32;
		gradosFahrenheit = (double) Math.round(gradosFahrenheit *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes ° " +gradosFahrenheit+ " Fahrenheit");
	}
	
	public void  ConvertirCelsiusAKelvin(double valorRecibido) {
		double gradosKelvin = valorRecibido / 273.15;
		gradosKelvin = (double) Math.round(gradosKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes ° " +gradosKelvin+ " Kelvin");
	}
	
	public void  ConvertirCelsiusARankine(double valorRecibido) {
		double gradosRankine = valorRecibido / 491.67;
		gradosRankine = (double) Math.round(gradosRankine *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes ° " +gradosRankine+ " Rankine");
	}

}
