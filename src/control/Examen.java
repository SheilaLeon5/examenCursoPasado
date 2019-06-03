package control;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.util.converter.LocalDateStringConverter;
import modelo.Jugador;

public class Examen {

	public void  creaInfoJugadorFichero(String rutaFichero) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddMMyyyy");
		Jugador[] listaJugadores = { new Jugador("123F", "BALE", LocalDate.parse("15081998", fmt), 182, 0, 15),
				new Jugador("124F", "INIESTA", LocalDate.parse("15081979", fmt), 183, 1, 7),
				new Jugador("125F", "BALE2", LocalDate.parse("15081996", fmt), 182, 0, 1),
				new Jugador("126F", "JOAQUIN3", LocalDate.parse("15081998", fmt), 182, 2, 5),
				new Jugador("127F", "INIESTA1", LocalDate.parse("15081969", fmt), 183, 1, 3),
				new Jugador("128F", "BALE4", LocalDate.parse("15081996", fmt), 182, 0, 5),
				new Jugador("129F", "INIESTA2", LocalDate.parse("15081999", fmt), 183, 1, 0),
				new Jugador("134F", "JOAQUIN5", LocalDate.parse("15081996", fmt), 182, 2, 2),
				new Jugador("423F", "BALE8", LocalDate.parse("15081998", fmt), 182, 0, 5),
				new Jugador("524F", "INIESTA5", LocalDate.parse("15081999", fmt), 183, 1, 4),
				new Jugador("625F", "JOAQUIN7", LocalDate.parse("15081996", fmt), 182, 2, 6),
				new Jugador("724F", "INIESTA", LocalDate.parse("15081999", fmt), 183, 1, 10),
				new Jugador("825F", "BALE2", LocalDate.parse("15081996", fmt), 182, 0, 15),
				new Jugador("923F", "JOAQUIN3", LocalDate.parse("15081998", fmt), 182, 2, 5),
				new Jugador("224F", "INIESTA9", LocalDate.parse("15081999", fmt), 183, 1, 2),
				new Jugador("325F", "BALE9", LocalDate.parse("15081996", fmt), 182, 0, 1),
				new Jugador("424F", "JOAQUIN2", LocalDate.parse("15081999", fmt), 183, 2, 0),
				new Jugador("625F", "JOAQUIN5", LocalDate.parse("15081996", fmt), 182, 2, 1),
				new Jugador("823F", "BALE6", LocalDate.parse("15081998", fmt), 182, 0, 7),
				new Jugador("724F", "INIESTA3", LocalDate.parse("15081999", fmt), 183, 1, 4),
				new Jugador("925F", "BALE7", LocalDate.parse("15081996", fmt), 182, 0, 5) };

		
		try {
			FileWriter fichero = new FileWriter(rutaFichero);
			
			String cadenaJugador;
			for (Jugador jugador : listaJugadores) {
				cadenaJugador = jugador.getNif() + "#" + jugador.getNombre() + "#" + jugador.getFecha() + "#" + jugador.getAltura() + "#" + jugador.getEquipo() + "#" + jugador.getGolesMarcados() + "\n";
				fichero.write(cadenaJugador);
				System.out.println(cadenaJugador);
			}
			
			fichero.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	
	public static void main (String [] args) {
		Examen examen = new Examen();
		examen.creaInfoJugadorFichero("ficheros/infoJugadores.txt");
	}
	
}
