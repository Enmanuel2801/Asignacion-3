//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {
        // Bloque 1
        String articulo = "NombreDelArticulo";
        boolean tienePermiso = true;

        if (!tienePermiso) {
            System.out.println("No tiene permiso de acceso");
        } else {
            System.out.println("Bienvenido");
        }


        int cifra = 950;

        if (cifra >= 0 & cifra <= 500) {
            System.out.println("Rango menor");

        } else if (cifra >= 501 & cifra <= 2000) {
            System.out.println("Rango intermedio");

        } else if (cifra > 2000 & cifra < 10000) {
            System.out.println("Rango superior");

        } else {
            System.out.println("Rango inválido!");
        }
    }
}

     public class Main {
    public static void main(String[] args) {
        String respuesta;


        int n = 25;

        if (n > 0 && n < 100) {

        } else {

            respuesta = "NO";
        }

        boolean encendido = true;
        int cantidad = 20;

        if (encendido) {
            if (cantidad == 20) {
                System.out.println("Correcto");
            }
        }
    }
}


