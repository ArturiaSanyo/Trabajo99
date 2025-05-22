public class HechiceroArcano {
    private String nombre;
    private int nivelMagia;
    private int energia;

    public HechiceroArcano(String nombre, int nivelMagia) {
        this.nombre = nombre;
        this.nivelMagia = nivelMagia;
        this.energia = 100; // Energía inicial predeterminada
    }

    public void lanzarHechizo(String hechizo) {
        if (energia >= 10) {
            System.out.println(nombre + " lanza el hechizo: " + hechizo);
            energia -= 10;
        } else {
            System.out.println(nombre + " no tiene suficiente energía para lanzar un hechizo.");
        }
    }

    public void recargarEnergia() {
        energia = 100;
        System.out.println(nombre + " ha recargado su energía.");
    }

    public void mostrarEstado() {
        System.out.println("Hechicero Arcano: " + nombre);
        System.out.println("Nivel de Magia: " + nivelMagia);
        System.out.println("Energía: " + energia);
    }
}
