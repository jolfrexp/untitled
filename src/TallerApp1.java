
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


public class TallerApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salir = "no", salir2 = "no", nom ="", ape = "", email = "", password= "", emailr, passwordr;
        int rpta2;
        int rpta;
        while (salir.equals("no")) {

            System.out.println("Bienvenido al sotfware del laboratorio!");
            System.out.println("Porfavor seleccione una opcion");
            System.out.println("1.- Registrar usuario.");
            System.out.println("2.- Iniciar sesion.");
            System.out.println("3.- Salir.");
            rpta = sc.nextInt();
            switch (rpta) {
                case 1: {
                    Map<String, String> Creditos = new HashMap<>();

                    System.out.println("****************************Registro****************************");

                    System.out.println("Ingrese su nombre: ");

                    nom = sc.next();

                    System.out.println("Ingrese su apellido: ");

                    ape = sc.next();

                    System.out.println("Ingrese su correo: ");

                    email = sc.next();

                    System.out.println("ingrese una contraseña: ");

                    password = sc.next();
                    System.out.println("Felicidades usted a sido registrado!");

                    Creditos.put(email,password);
                    Creditos.put(nom,ape);

                    break;
                }
                case 2: {
                    System.out.println(email);
                    System.out.println(password);
                    System.out.println("******************* Inicio de sesion *******************");
                    System.out.println("Digite su correo: ");
                    emailr = sc.next();
                    System.out.println("Digite su contraseña: ");
                    passwordr = sc.next();
                    if ((Objects.equals(emailr, email)) && (Objects.equals(password, passwordr))) {
                        while (salir2.equals("no")) {
                            System.out.println("Bienvenido señor " + nom + " " + ape + ".");
                            System.out.println("Por favor digite una opcion a la cual desea ingresar.");
                            System.out.println("Opcion 1 validar categoria.");
                            System.out.println("Opcion 2 ver beneficios de la categoria.");
                            System.out.println("Opcion 3 salir.");
                            rpta2 = sc.nextInt();
                            switch (rpta2) {
                                case 1: {
                                    System.out.println(nom + " Usted a validado la categoria!");
                                    break;
                                }
                                case 2: {
                                    System.out.println(nom + " Los beneficios de la categoria serian..................................................................................................................................... ");
                                    break;
                                }
                                case 3: {
                                    salir2 = "si";
                                    break;
                                }
                                default: {
                                    System.out.println("Digite una opcion valida.");
                                    return;
                                }
                            }
                        }

                    }else{


                        System.out.println("Lo sentimo no estas registrado");
                        break;
                    }

                }
                case 3:
                {
                    salir = "si";
                    break;

                }
                default:{
                    System.out.println("Digite una opcion valida");
                    break;
                }
            }
        }
    }
}