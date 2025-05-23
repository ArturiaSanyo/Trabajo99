public class HechiceroArcano extends Personaje {
    private int nivelMagia;
    private int energia;

    public HechiceroArcano(String nombre, int nivelMagia) {
        super(nombre, 80); // Vida base menor
        this.nivelMagia = nivelMagia;
        this.energia = 100;
    }

    public void lanzarHechizo(String hechizo, Personaje enemigo) {
        if (energia >= 10) {
            int danio = nivelMagia * 5 + random.nextInt(10); // Daño base + aleatorio
            enemigo.recibirDanio(danio);
            energia -= 10;
            System.out.println(nombre + " lanza " + hechizo + " causando " + danio + " de daño.");
        } else {
            System.out.println(nombre + " no tiene suficiente energía para lanzar " + hechizo + ".");
        }
    }

    public void recargarEnergia() {
        energia = 100;
        System.out.println(nombre + " ha recargado su energía.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Hechicero Arcano: " + nombre);
        System.out.println("Nivel de Magia: " + nivelMagia);
        System.out.println("Energía: " + energia);
        System.out.println("Vida: " + vida);
    }
}
