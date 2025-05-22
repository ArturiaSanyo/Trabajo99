public class Personajes {

    public static void main(String[] args) {
        // Crear personajes
        HechiceroArcano hechicero = new HechiceroArcano("Morgath", 7);
        Espartano espartano = new Espartano("Ares");
        Berserker berserker = new Berserker("Thorg", 12);

        System.out.println("\n--- Estado Inicial ---");
        hechicero.mostrarEstado();
        System.out.println();
        espartano.mostrarEstado();
        System.out.println();
        berserker.mostrarEstado();

        System.out.println("\n--- Combate ---");

        // Turnos de combate simples
        hechicero.lanzarHechizo("Rayo Arcano");
        berserker.recibirDanio(30);

        berserker.atacar(hechicero);

        espartano.atacar(berserker);

        System.out.println("\n--- Estado Final ---");
        hechicero.mostrarEstado();
        System.out.println();
        espartano.mostrarEstado();
        System.out.println();
        berserker.mostrarEstado();
    }
}
