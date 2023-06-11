package ec.epn.edu;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int op1 = 0;
        int op2 = 0;
        do {
            System.out.println("\t****Calculadora****");
            System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Potenciacion\n6. Radicacion\n7. Salir");
            System.out.println("\tEscoja la operacion a utilizar:");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    //Suma
                    System.out.println("Ingrese el primer operando: ");
                    op1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo operando: ");
                    op2 = scanner.nextInt();
                    System.out.println("");
                    System.out.println("El resultado de la operacion es: " + addition(op1, op2));
                    break;
                case 2:
                    //resta
                    System.out.println("Ingrese el primer operando: ");
                    op1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo operando: ");
                    op2 = scanner.nextInt();
                    System.out.println("");
                    System.out.println("El resultado de la operacion es: " + substract(op1, op2));
                    break;
                case 3:
                    System.out.println("Ingrese el primer operando: ");
                    op1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo operando: ");
                    op2 = scanner.nextInt();
                    System.out.println("");
                    System.out.println("El resultado de la operacion es: " + multiplication(op1, op2));
                    break;
                case 4:
                    //div
                    System.out.println("Ingrese el primer operando: ");
                    op1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo operando: ");
                    op2 = scanner.nextInt();
                    System.out.println("");
                    System.out.println("El resultado de la operacion es: " + split(op1, op2));
                    break;
                case 5:
                    System.out.println("Ingrese el primer operando: ");
                    op1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo operando: ");
                    op2 = scanner.nextInt();
                    System.out.println("");
                    System.out.println("El resultado de la operacion es: " + String.valueOf(power(op1, op2)));
                    break;
                case 6:
                    System.out.println("Ingrese el primer operando: ");
                    op1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo operando: ");
                    op2 = scanner.nextInt();
                    System.out.println("");
                    System.out.println("El resultado de la operacion es: " + String.valueOf(root(op1, op2)));
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Eleccion no reconocida, vuelva a intentar...");
                    break;
            }
        } while (op != 7);
    }

    //Potenciacion
    public int power(int op1, int op2) {
        return (int) Math.pow(op1, op2);
    }

    //Raiz
    public double root(double op1, int op2) {
        return Math.pow(op1, (1.0 / op2));
    }

    public int substract(int op1, int op2){
        return op1 - op2;
    }

    public int split(int op1, int op2){
//        if(op2 == 0){
//            throw new IllegalArgumentException("Division por cero no es valida");
//        }
        return op1 / op2;
    }

    //Suma
    public double addition(int op1, int op2) {
        return op1 + op2;
    }

    //Multiplicacion
    public double multiplication(int op1, int op2) {
        return op1 * op2;
    }

}
