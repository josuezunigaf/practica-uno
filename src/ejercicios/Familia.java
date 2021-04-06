package ejercicios;

public class Familia {
    int cedula;
    String nombre;
    int edad;
    float pesoKg;
    char genero;
    
    public static void main(String [] args) {
        Familia padre = new Familia();
        Familia madre = new Familia();
        Familia hijo = new Familia();
        Familia hija = new Familia();
        
        padre.cedula = 111111111;
        padre.nombre = "Juan";
        padre.edad = 50;
        padre.pesoKg = 80;
        padre.genero = 'M';
        
        madre.cedula = 222222222;
        madre.nombre = "Ana";
        madre.edad = 45;
        madre.pesoKg = 70;
        madre.genero = 'F';
        
        hijo.cedula = 333333333;
        hijo.nombre = "Carlos";
        hijo.edad = 15;
        hijo.pesoKg = 55;
        hijo.genero = 'M';
        
        hija.cedula = 444444444;
        hija.nombre = "Maria";
        hija.edad = 10;
        hija.pesoKg = 35;
        hija.genero = 'F';
        
        System.out.println("La cedula del padre es: " + padre.cedula);
        System.out.println("El nombre del padre es: " + padre.nombre);
        System.out.println("La edad del padre es: " + padre.edad);
        System.out.println("El peso en kg del padre es: " + padre.pesoKg);
        System.out.println("El genero del padre es: " + padre.genero);
        
        System.out.println("\nLa cedula de la madre es: " + madre.cedula);
        System.out.println("El nombre de la madre es: " + madre.nombre);
        System.out.println("La edad de la madre es: " + madre.edad);
        System.out.println("El peso en kg de la madre es: " + madre.pesoKg);
        System.out.println("El genero de la madre es: " + madre.genero);
        
        System.out.println("\nLa cedula del hijo es: " + hijo.cedula);
        System.out.println("El nombre del hijo es: " + hijo.nombre);
        System.out.println("La edad del hijo es: " + hijo.edad);
        System.out.println("El peso en kg del hijo es: " + hijo.pesoKg);
        System.out.println("El genero del hijo es: " + hijo.genero);
        
        System.out.println("\nLa cedula de la hija es: " + hija.cedula);
        System.out.println("El nombre de la hija es: " + hija.nombre);
        System.out.println("La edad de la hija es: " + hija.edad);
        System.out.println("El peso en kg de la hija es: " + hija.pesoKg);
        System.out.println("El genero de la hija es: " + hija.genero);
    }
}