public class Berserker {
    private String nombre;
    private int fuerza;
    private int vida;

    public Berserker(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Espartano enemigo) {
        int danio = fuerza + (int)(Math.random() * 10); // Daño basado en fuerza
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " ataca con furia causando " + danio + " de daño.");
    }

    public void atacar(HechiceroArcano enemigo) {
        int danio = fuerza + (int)(Math.random() * 10);
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " golpea al hechicero causando " + danio + " de daño.");
    }

    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        vida = Math.max(vida, 0);
        System.out.println(nombre + " recibe " + cantidad + " de daño. Vida restante: " + vida);
    }

    public void mostrarEstado() {
        System.out.println("Berserker: " + nombre);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Vida: " + vida);
    }
}
