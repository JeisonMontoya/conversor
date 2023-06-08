
public class Test {

	public static double convertirPesoColombiano(String monedaDestino, double cantidad) {
		double resultado = 0.0;

		switch (monedaDestino) {
		case "Dólar":
			resultado = cantidad / 4180; // Tipo de cambio aproximado
			break;
		case "Euro":
			resultado = cantidad / 4500; // Tipo de cambio aproximado
			break;
		case "Libra Esterlina":
			resultado = cantidad / 5000; // Tipo de cambio aproximado
			break;
		case "Yen Japonés":
			resultado = cantidad / 35; // Tipo de cambio aproximado
			break;
		case "Won sur-coreano":
			resultado = cantidad / 3400; // Tipo de cambio aproximado
			break;
		}

		return resultado;
	}

	public static void main(String[] args) {
		// Ejemplo de uso
		double cantidad = 20000; // Cantidad en Pesos Colombianos
		String monedaDestino = "Dólar";

		double resultado = convertirPesoColombiano(monedaDestino, cantidad);

		System.out.println(cantidad + " Pesos Colombianos son equivalentes a " + resultado + " " + monedaDestino);
	}
}
