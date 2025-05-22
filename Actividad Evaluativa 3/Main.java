public class Main {

    public static void main(String[] args) {
        // Crear personajes
        HechiceroArcano hechicero = new HechiceroArcano("Merlín", 5);
        Espartano espartano = new Espartano("Leonidas");

        // Mostrar estados iniciales
        System.out.println("\nEstado inicial:");
        hechicero.mostrarEstado();
        System.out.println();
        espartano.mostrarEstado();

        // Combate simple
        System.out.println("\n--- ¡Empieza el combate! ---\n");

        // Turno del hechicero
        hechicero.lanzarHechizo("Bola de fuego");
        espartano.recibirDanio(25);

        // Turno del espartano
        espartano.atacar(hechicero);

        // Mostrar estados finales
        System.out.println("\nEstado final:");
        hechicero.mostrarEstado();
        System.out.println();
        espartano.mostrarEstado();
    }
}
