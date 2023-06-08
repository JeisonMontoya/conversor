import javax.swing.JOptionPane;

//Menu de conversor
public class Main {
	public static void main(String[] args) {
		String[] opcionesPrincipales = { "Conversor de Monedas", "Conversor de Temperatura", "Salir" };

		boolean salir = false;
		while (!salir) {
			String seleccionPrincipal = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
					"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesPrincipales, opcionesPrincipales[0]);

			if (seleccionPrincipal != null) {
				switch (seleccionPrincipal) {
				case "Conversor de Monedas":
					convertirMonedas();
					break;
				case "Conversor de Temperatura":
					convertirTemperatura();
					break;
				case "Salir":
					salir = true;
					break;
				}
			} else {
				salir = true;
			}
		}
	}

//    Menu de conversor de moneda
	public static void convertirMonedas() {
		String[] opcionesMonedas = { "Dólar a Peso colombiano", "Euro a Peso colombiano",
				"Libra Esterlina a Peso colombiano", "Yen Japonés a Peso colombiano",
				"Won sul-coreano a Peso colombiano", "Volver" };

		boolean volver = false;
		while (!volver) {
			String seleccionMoneda = (String) JOptionPane.showInputDialog(null, "Seleccione la conversión:",
					"Conversor de Monedas", JOptionPane.PLAIN_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);

			if (seleccionMoneda != null) {
				if (seleccionMoneda.equals("Volver")) {
					volver = true;
				} else {
					convertirPesoColombiano(seleccionMoneda);
				}
			} else {
				volver = true;
			}
		}
	}

//    funcion para convertir la moneda 
	public static void convertirPesoColombiano(String monedaDestino) {
		String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Colombianos:");
		if (input != null) {
			try {
				double pesosColombianos = Double.parseDouble(input);
				double resultado = 0.0;

				switch (monedaDestino) {
				case "Dólar a Peso colombiano":
					resultado = pesosColombianos / 4180; // Tipo de cambio aproximado
					break;
				case "Euro a Peso colombiano":
					resultado = pesosColombianos / 4506; // Tipo de cambio aproximado
					break;
				case "Libra Esterlina a Peso colombiano":
					resultado = pesosColombianos / 5246; // Tipo de cambio aproximado
					break;
				case "Yen Japonés a Peso colombiano":
					resultado = pesosColombianos / 30; // Tipo de cambio aproximado
					break;
				case "Won sul-coreano a Peso colombiano":
					resultado = pesosColombianos / 322; // Tipo de cambio aproximado
					break;
				}

				// Redondear a dos decimales
				resultado = Math.round(resultado * 100) / 100.0;

				JOptionPane.showMessageDialog(null,
						pesosColombianos + " Pesos Colombianos son equivalentes a " + resultado + " " + monedaDestino,
						"Resultado", JOptionPane.INFORMATION_MESSAGE);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Cantidad inválida", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

//	Funcion para convertir temepratura
	public static void convertirTemperatura() {

		String opcion = JOptionPane.showInputDialog("Seleccione el tipo de conversión:\n"
                + "1. Celsius a Fahrenheit\n"
                + "2. Fahrenheit a Celsius\n"
                + "3. Celsius a Kelvin\n"
                + "4. Kelvin a Celsius\n"
                + "5. Fahrenheit a Kelvin\n"
                + "6. Kelvin a Fahrenheit");
        
        if (opcion != null) {
            int seleccion = Integer.parseInt(opcion);
            
            switch (seleccion) {
                case 1:
                    convertirCelsiusAFahrenheit();
                    break;
                case 2:
                    convertirFahrenheitACelsius();
                    break;
                case 3:
                    convertirCelsiusAKelvin();
                    break;
                case 4:
                    convertirKelvinACelsius();
                    break;
                case 5:
                    convertirFahrenheitAKelvin();
                    break;
                case 6:
                    convertirKelvinAFahrenheit();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
    public static void convertirCelsiusAFahrenheit() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:");
        
        if (input != null) {
            try {
                double celsius = Double.parseDouble(input);
                double fahrenheit = (celsius * 9 / 5) + 32;
                
                JOptionPane.showMessageDialog(null, celsius + " °C son equivalentes a " + fahrenheit + " °F",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirFahrenheitACelsius() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Fahrenheit:");
        
        if (input != null) {
            try {
                double fahrenheit = Double.parseDouble(input);
                double celsius = (fahrenheit - 32) * 5 / 9;
                
                JOptionPane.showMessageDialog(null, fahrenheit + " °F son equivalentes a " + celsius + " °C",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirCelsiusAKelvin() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:");
        
        if (input != null) {
            try {
                double celsius = Double.parseDouble(input);
                double kelvin = celsius + 273.15;
                
                JOptionPane.showMessageDialog(null, celsius + " °C son equivalentes a " + kelvin + " K",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirKelvinACelsius() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Kelvin:");
        
        if (input != null) {
            try {
                double kelvin = Double.parseDouble(input);
                double celsius = kelvin - 273.15;
                
                JOptionPane.showMessageDialog(null, kelvin + " K son equivalentes a " + celsius + " °C",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirFahrenheitAKelvin() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Fahrenheit:");
        
        if (input != null) {
            try {
                double fahrenheit = Double.parseDouble(input);
                double kelvin = (fahrenheit + 459.67) * 5 / 9;
                
                JOptionPane.showMessageDialog(null, fahrenheit + " °F son equivalentes a " + kelvin + " K",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirKelvinAFahrenheit() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Kelvin:");
        
        if (input != null) {
            try {
                double kelvin = Double.parseDouble(input);
                double fahrenheit = kelvin * 9 / 5 - 459.67;
                
                JOptionPane.showMessageDialog(null, kelvin + " K son equivalentes a " + fahrenheit + " °F",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
