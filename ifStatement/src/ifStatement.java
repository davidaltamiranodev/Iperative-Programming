public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.println("Por favor enciende tu bluetooth para iniciar la transferencia");
        }
    }
}
