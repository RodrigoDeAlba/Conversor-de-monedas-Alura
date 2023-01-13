package ConversorMonedas;

import javax.swing.*;


public class Principal {
	
	public static void main(String[] args) {
		
		int seleccion = 0;
		
		while(seleccion == 0) {
		
		Function monedas = new Function();	
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de moneda","Conversor de temperatura"}, "Seleccion")).toString();
		switch (opciones) {	
		case "Conversor de moneda": {
			
			try {
			
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
			double ValorRecibido = Double.parseDouble(input);
			monedas.ConvertirMonedas(ValorRecibido);
			seleccion=JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?", input, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			String mensaje = "";
	        switch (seleccion) {
	        case 0:
	            mensaje = "Continuemos";
	            break;
	        case 1:
	            mensaje = "Programa terminado";
	           
	            break;
	        case 2:
	            mensaje = "Programa terminado";
	            
	        }
			//if (JOptionPane.YES_NO_CANCEL_OPTION == seleccion) {
				//System.out.println("Selecciona opcion afirmativa");
			//}else{
				//JOptionPane.showMessageDialog(null, "Programa terminado");
	            //System.exit(seleccion);
			}
			
				catch (Exception ex) {
				String msg = "Solo se aceptan valores numericos, vuelva a intentar";
				JOptionPane.showMessageDialog(null, "Exception: " + msg);
				ex.printStackTrace();
			}
			
		}
		}
		Function grados = new Function();	
		opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de moneda","Conversor de temperatura"}, "Seleccion")).toString();
		switch (opciones) {	
		case "Conversor de temperatura": {
			
			try {
			
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
			double TempRecibida = Double.parseDouble(input);
			grados.ConvertirTemperaturas(TempRecibida);
			seleccion=JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?", input, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			String mensaje = "";
	        switch (seleccion) {
	        case 0:
	            mensaje = "Continuemos";
	            break;
	        case 1:
	            mensaje = "Programa terminado";
	           
	            break;
	        case 2:
	            mensaje = "Programa terminado";
	            
	        }
			
			}
			
				catch (Exception ex) {
				String msg = "Solo se aceptan valores numericos, vuelva a intentar";
				JOptionPane.showMessageDialog(null, "Exception: " + msg);
				ex.printStackTrace();
			}
			
		}
		}
	}
		
	}

}
		
	