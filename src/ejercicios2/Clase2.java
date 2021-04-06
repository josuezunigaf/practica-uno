package ejercicios2;

import ejercicios.ConceptosJava;

public class Clase2 {

    public static void main(String[] args) {
        ConceptosJava obj = new ConceptosJava();

        // Llamado al metodo accesor "Set" para asignarle nuestro valor
        obj.setModificador1(10);

        // Impresion y llamado al metodo accesor "Get" para obtener el valor
        System.out.println("El valor es: " + obj.getModificador1());
    }
}
