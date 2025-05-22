import java.util.Scanner;

public class JuegoLucha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Espartano jugador1 = new Espartano("Espartano 1");
        Espartano jugador2 = new Espartano("Espartano 2");

        System.out.println("¡Empieza la batalla entre espartanos!");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("\nTurno de " + jugador1.getNombre());
            jugador1.atacar(jugador2);

            if (!jugador2.estaVivo()) break;

            System.out.println("\nTurno de " + jugador2.getNombre());
            jugador2.atacar(jugador1);
        }

        if (jugador1.estaVivo()) {
            System.out.println("\n" + jugador1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println("\n" + jugador2.getNombre() + " ha ganado la batalla.");
        }

        scanner.close();
    }
}

class Espartano {
    private String nombre;
    private int vida = 100;

    public Espartano(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Espartano enemigo) {
        int danio = (int)(Math.random() * 20 + 1); // Daño aleatorio entre 1 y 20
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " ataca y causa " + danio + " de daño.");
    }

    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        vida = Math.max(vida, 0);
        System.out.println(nombre + " tiene " + vida + " de vida restante.");
    }
}
