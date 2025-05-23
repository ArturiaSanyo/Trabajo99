public class Espartano extends Personaje {

    public Espartano(String nombre) {
        super(nombre, 100);
    }

    public void atacar(Personaje enemigo) {
        int danio = random.nextInt(20) + 1; // 1 a 20
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " ataca y causa " + danio + " de daño.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Espartano: " + nombre);
        System.out.println("Vida: " + vida);
    }
}
