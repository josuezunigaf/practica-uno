package ejercicios;

public class SumaDeEdad {
    int edadPadre;
    int edadMadre;
    int edadHijo;
    int edadHija;
    int suma;

    public void asignarEdad() {
        edadPadre = 50;
        edadMadre = 40;
        edadHijo = 15;
        edadHija = 10;
    }

    public void sacarSuma() {
        suma = edadPadre + edadMadre + edadHijo + edadHija;
    }

    public void mostrarResultado() {
        System.out.println("La suma de edades de la familia es de: " + suma);
    }
}
