public class Hormigas {
    public static void main(String[] args) {
        double i = 0, numHormigas = 1;
        double numTotalHormiguas = 0, resultado = 0;
        while(numHormigas < 125000000000000.0){
            if (numHormigas == 125000000000000.0){
                System.out.println("i = " + i);
            }
            resultado = numHormigas * 2;
            if (resultado == 125000000000000.0){
                System.out.println("i = " + i);
            }
            numTotalHormiguas += resultado;
            i++;
        }
        System.out.println("i = "+i);
        System.out.println("total hormigas = " + numTotalHormiguas);
        System.out.println("total hormigas = " + numTotalHormiguas);
    }
}
