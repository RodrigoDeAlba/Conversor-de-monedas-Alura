package ConversorMonedas;

import javax.swing.JOptionPane;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	public void ConvertirMonedas(double ValorRecibido) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De pesos a dolares","De pesos a euros", "De pesos a libras", "De pesos a Yenes", "De pesos a Wones"},
				"Seleccion")).toString();
		switch(opcion) {	
		case "De pesos a dolares": 	
			monedas.ConvertirPesosMexicanosADolar(ValorRecibido);
			break;
		case "De pesos a euros": 
			monedas.ConvertirPesosMexicanosAEuro(ValorRecibido);
			break;
		case "De pesos a libras": 
			monedas.ConvertirPesosMexicanosAEuro(ValorRecibido);
			break;
		case "De pesos a Yenes": 
			monedas.ConvertirPesosMexicanosAEuro(ValorRecibido);
			break;
		case "De pesos a Wones": 
			monedas.ConvertirPesosMexicanosAEuro(ValorRecibido);
			break;
						
	}
		
}
	ConvertirTemperaturas grados = new ConvertirTemperaturas();
	public void ConvertirTemperaturas(double TempRecibida) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije el tipo de medición que deseas tomar", "Grados",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De Celsius a Fahrenheit","De Celsius a Kelvin", "De Celsius a Rankine"},
				"Seleccion")).toString();
		switch(opcion) {	
		case "De Celsius a Fahrenheit": 	
			grados.ConvertirCelsiusAFahrenheit(TempRecibida);
			break;
		case "De Celsius a Kelvin": 
			grados.ConvertirCelsiusAKelvin(TempRecibida);
			break;
		case "De Celsius a Rankine": 
			grados.ConvertirCelsiusARankine(TempRecibida);
			break;
						
	}
}
}
