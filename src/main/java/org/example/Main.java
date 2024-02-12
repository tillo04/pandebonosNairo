package org.example;
import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea=new Scanner(System.in);
        String cedula;
        String nombreCliente;
        LocalDate fecha=LocalDate.now();

        String nombreEmpleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD="tomas0304";
        String contrasenaEmpleadoBD="tomas0304";

        Integer opcion;
        Integer cantidadTradicional=0;
        Integer cantidadGuayaba=0;
        Integer cantidadArequipe=0;
        Integer cantidad7quesos=0;
        Integer cantidadBebida=0;

        boolean loginExitoso=false;

        while (loginExitoso==false){

            System.out.println("***PANDEBONOS NAIRO***");
            System.out.println("**********************");
            System.out.println("Apreciado empleado, inicie sesión: ");
            System.out.print("Dijite su usuario: ");
            nombreEmpleado = lea.nextLine();
            System.out.print("Dijite su contraseña: ");
            contrasenaEmpleado = lea.nextLine();

            //login
            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)) {
                System.out.println("Cargando sistema.....");
                loginExitoso=true;
            } else {
                System.out.println("usuario incorrecto");
            }
        }

        System.out.println("\n....Pandesoftware....");
        System.out.println("1. registrar compra");
        System.out.println("2. calcular total");
        System.out.println("3. modificar compra");
        System.out.println("4. salir");
        do {
            System.out.println("seleccione una opcio");
            opcion=lea.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }

        }while (opcion !=4);


        System.out.println("1. tradicional ($8000)");
        System.out.println("2. guayaba ($9500)");
        System.out.println("3. Arequipe ($12000)");
        System.out.println("4. 7 quesos ($20000)");
        System.out.println("5. bebida ($9500)");
        System.out.println("6. ");

        do {
            System.out.println("dijite su producto: ");
            Integer productoSeleccionado = lea.nextInt();
            switch (productoSeleccionado){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }while (opcion !=4);




    }
}