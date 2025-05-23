public class Main {
    public static void main(String[] args) {
        HechiceroArcano hechicero = new HechiceroArcano("Merlín", 5);
        Espartano espartano = new Espartano("Leonidas");
        Berserker berserker = new Berserker("Thorg", 12);

        System.out.println("\n--- Estado Inicial ---");
        hechicero.mostrarEstado();
        System.out.println();
        espartano.mostrarEstado();
        System.out.println();
        berserker.mostrarEstado();

        System.out.println("\n--- Combate ---");
        hechicero.lanzarHechizo("Bola de fuego", berserker);
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
