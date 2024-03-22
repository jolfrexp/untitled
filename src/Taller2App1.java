import java.util.Objects;
import java.util.Scanner;
public class Taller2App1 {
    static Scanner sc = new Scanner(System.in);
    static String[] Usuario = new String [4];
    static String emailr,passwordr,salir = "no", salir2 = "no", nom ="";
    static boolean valid= false;
    static int rpta2,rpta;
    public static void main(String[] args) {
        while (salir.equals("no")) {
               menu();
            rpta = sc.nextInt();
            switch (rpta) {
                case 1: {
                    menu2();
                    break;
                }
                case 2: {
                    InicioSesion();
                    Validacion();
                    Categoria();
                        break;
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
    public static void print(String text)
    {
        System.out.println(text);
    }
    public static void menu()
    {
        print("Bienvenido al sotfware del laboratorio!");
        print("Porfavor seleccione una opcion");
        print("1.- Registrar usuario.");
        print("2.- Iniciar sesion.");
        print("3.- Salir.");
    }
    public static void menu2()
    {
        print("****************************Registro****************************");
        print("Ingrese su nombre: ");
        Usuario [0] = sc.next();
        print("Ingrese su apellido: ");
        Usuario [1] = sc.next();
        print("Ingrese su correo: ");
        Usuario [2] = sc.next();
        print("ingrese una contraseña: ");
        Usuario [3] = sc.next();
        print("Felicidades usted a sido registrado!");

    }
    public static void InicioSesion()
    {
        print("******************* Inicio de sesion *******************");
        print("Digite su correo: ");
        emailr = sc.next();
        print("Digite su contraseña: ");
        passwordr = sc.next();
    }
    public static void Validacion()
    {
        if ((Objects.equals(emailr, Usuario [2])) && (Objects.equals(Usuario[3], passwordr)))
        {
            valid=true;
        }else
        {
            print("lo sentimos no estas registrado");
            valid=false;
        }
    }
    public static void Categoria()
    {
        while (salir2.equals("no")&&(valid==true)){
            System.out.println("Bienvenido señor " + Usuario[0] + " " + Usuario[1] + ".");
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
    }
}
