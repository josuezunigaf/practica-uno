package ejercicios;

public class ConceptosJava {
    // Tipos de datos primitivos

    // Entero

    int numEntero1;  // 12 digitos, ejemplo: int numEntero1 = 123456789;
    long numEntero2; // mas de 12 digitos, ejemplo: long numEntero2 = 1234567890123;

    // Decimal

    float numDecimal1;  // 6 digitos, ejemplo: float numDecimal1 = 123.45f;
    double numDecimal2; // mas de 6 digitos, ejemplo: double numDecimal2 = 12345.678;

    // Caracter
    
    char caracter1; // un solo caracter, ejemplo: char caracter1 = 'a';

    // Booleano

    boolean decision1; // valor true o false, ejemplo: boolean decision1 = true;

    // Tipos de datos no primitivos / Objeto

    /*
     * Actuan igual que los primitivos, pero ademas podemos asignar valores null
     * y realizar mas operaciones propias con el atributo, por ejemplo, obtener
     * el length(), el toString(), entre otros.
     */
    Integer numEntero3;
    Long numEntero4;
    Float numDecimal3;
    Double numDecimal4;
    Character caracter2;
    Boolean decision2;

    String cadena; // Un ejemplo: String cadena = "Esto es un tipo String";

    // Modificadores de acceso

    private int modificador1; // -> pueden acceder solo las clases dentro del mismo paquete
    public int modificador2;  // -> pueden acceder todas las clases de todos los paquetes
    private int modificador3; // -> puede acceder solo la clase desde donde fue creado excepto definamos metodos/miembros
                              // dentro de la clase para poder acceder desde otras clases/paquetes, usando encapsulamiento

    // Metodo accesor "Set" para establecer el valor
    public void setModificador1(int modificador1) {
        this.modificador1 = modificador1;
        // el "this" hace referencia a la variable actual, que en este caso es
        // modificador1 de la clase ConceptosJava
    }

    // Metodo accesor "Get" para obtener/leer el valor
    public int getModificador1() {
        return modificador1;
    }
}
