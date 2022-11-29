public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        // Devuelve un entero hacia arriba
        System.out.println(Math.floor(x));

        // Devuelve un numero elevado a otro
        System.out.println(Math.pow(x, y));

        // Devuelve un número mayor
        System.out.println(Math.max(x, y));

        // Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        // Devuelve el area de un circulo
        // pi * r2
        System.out.println(Math.PI * Math.pow(y, 2));

        // Devuelve el area de una esfera
        // 4 * PI * r2
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Devuelve volumen de una esfera
        // (4 / 3) * PI * r3
        System.out.println((4 / 3) * Math.PI * Math.pow(y, 3));





    }
}
