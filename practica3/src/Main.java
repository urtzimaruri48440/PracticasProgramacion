import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static String [] jugadores = {"Pitulina", "Myke Tyson", "Buesa", "Aritz besos", "Ibai zaramaga", "Josulin", "Jose Miguel Gallego Claveria", "Pepe el romano"};
    private static String [] posiciones = {"portero", "defensa", "centrocampista", "delantero"};
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Set<Integer> jugadoresDisponibles = new HashSet<>();

        for (int i = 0; i < jugadores.length; i++) {
            jugadoresDisponibles.add(i);
        }
        for (String posicion : posiciones) {
            System.out.println("Seleccione un jugador para la posición de " + posicion + ":");
            for (int i = 0; i < jugadores.length; i++) {
                if (jugadoresDisponibles.contains(i)) {
                    System.out.println(i + ": " + jugadores[i]);
                }
            }
            int seleccion = sc.nextInt();
            while (!jugadoresDisponibles.contains(seleccion)) {
                System.out.println("Selección inválida. Por favor, seleccione un jugador disponible:");
                seleccion = sc.nextInt();
            }
            jugadoresDisponibles.remove(seleccion);
            System.out.println("Has seleccionado a " + jugadores[seleccion] + " como " + posicion + ".");
        }
    }
}