import java.util.Random;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected Random random;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.random = new Random();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        vida = Math.max(vida, 0);
        System.out.println(nombre + " recibe " + cantidad + " de daño. Vida restante: " + vida);
    }

    public abstract void mostrarEstado();
}
