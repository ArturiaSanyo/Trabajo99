public class Berserker extends Personaje {
    private int fuerza;

    public Berserker(String nombre, int fuerza) {
        super(nombre, 100);
        this.fuerza = fuerza;
    }

    public void atacar(Personaje enemigo) {
        int danio = fuerza + random.nextInt(10); // fuerza base + 0 a 9
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " ataca con furia causando " + danio + " de daño.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Berserker: " + nombre);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Vida: " + vida);
    }
}
