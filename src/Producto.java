import java.util.Objects;
import java.util.Scanner;

public class Producto {
    static Scanner sc = new Scanner(System.in);
    static String [][] users = new String[10][4];
    static String [][] busquedas = new String[10][1];
    static int opc,opc2, npers=0,nper,l=0,k=0,o=0;
    static boolean valid= false,valid2 = false;
    static String salir  = "no",salir2 = "no",emailr,passwordr;
    public static void main (String [] args)
    {
        while (salir.equals("no")) {
            menuDeInicio();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    registro();
                    break;
                case 2:
                    inicioSesion();
                    validacion();
                    menuGeneral();



                    break;
                case 3:
                    visualUsuarios();
                    break;
                case 4:
                    salir  ="si";
                    break;
                default:
                    print("Digite una opcion valida");
                    break;
            }
        }
    }
    public static void menuDeInicio()
    {
        print("*********Artistpage*********");
        print("Menu de inicio");
        print("Por favor ingrese una opcion: ");
        print("1.-Registrar artista");
        print("2.-Iniciar sesion");
        print("3.-Ver artistas registrados");
        print("4.-Salir");
    }
    public static void inicioSesion()
    {
        print("******************* Inicio de sesion *******************");
        print("Digite su correo o su id: ");
        emailr = sc.next();
        print("Digite su contraseña: ");
        passwordr = sc.next();
    }
    public static void menuGeneral()
    {
        salir2 = "no";
        while (salir2.equals("no")&& Objects.equals(valid,true))
        {
            print("Bienvenido!: "+users[l][0]+" "+users[l][1]);
            print("Por favor digite una opcion:");
            print("1.-Buscar por nombre del artista");
            print("2.-Buscar por id del artista");
            print("3.-Todos los artistas");
            print("4.-Cerrar sesión");
            opc2 = sc.nextInt();
            switch (opc2){
                case 1:
                    busquedaArtista();
                    valResultados();
                    resultado();
                    break;
                case 2:
                    bussquedaId();
                    valResultadosId();
                    resultado();
                    break;
                case 3:
                    todosLosArtistas();
                    break;
                case 4:
                    salir2 = "si";
                    valid = false;
                    break;
                default:
                    print("Digite una opcion valida!");
                    return;

            }
        }
    }
    public static void busquedaArtista()
    {
        String [] artista = new String[5];
        print("Artista buscado recientemente: ");
        for (int i=0;i<1;i++) {
            print(busquedas[i][0]);
        }
        print("Porfavor digite el nombre del artista que desea buscar: ");
        artista [0] = sc.next();
        busquedas [k]= artista;
    }
    public static void bussquedaId()
    {
        String [] busqueda = new String[5];
        print("Artistas buscados recientemente: ");
        for (int i=0;i<1;i++) {
            print(busquedas[i][0]);
        }
        print("Porfavor digite el Id del artista que desea buscar: ");
        busqueda [0] = sc.next();
        busquedas [k]= busqueda;
    }
    public static void todosLosArtistas()
    {
        print("Estos son los artisitas registrados hasta ahora:");
        for(int i = 0; i<npers;i++)
        {
            print("Nombre: "+users[i][0]);
            print("Apellido: "+users[i][1]);
            print("ID: "+users[i][4]);
            print("Correo: "+users[i][3]);
            print("Publicaciones: Coming soon!");
        }
    }
    public static void valResultados()
    {
        print("Buscando... ");
        print(busquedas[k][0]);
        o=0;
        while ((o<npers) && Objects.equals(valid2,false))
        {
            if ((Objects.equals(busquedas[k][0], users[o][0])))
            {
                 valid2 = true;

            }else
            {
                valid2 = false;
                o++;
            }
        }
    }
    public static void valResultadosId()
    {
        print("Buscando... ");
        print(busquedas[k][0]);
        o=0;
        while ((o<npers) && Objects.equals(valid2,false))
        {
            if ((Objects.equals(busquedas[k][0], users[o][4])))
            {
                valid2 = true;

            }else
            {
                valid2 = false;
                o++;
            }
        }
    }
    public static void resultado()
    {
        if(valid2)
        {
            print("Artista encontrado: ");
            print("Id del artista: "+ users[o][4]);
            print("Nombre: "+ users[o][0]);
            print("Apellido: "+ users[o][1]);
            print("Correo: "+users[o][2]);
            print("Publicaciones: Coming soon!");
            valid2 = false;
            k=0;
        }else
        {
            print("Lo sentimos no se encontraron resultados");
        }
    }
    public static void validacion()
    {
        l=0;
        while ((l<npers) && Objects.equals(valid, false)){
            if ((Objects.equals(emailr, users [l][2])||(Objects.equals(emailr,users[l][4]))) && (Objects.equals(users [l][3], passwordr)))
            {
                valid=true;
            }else
            {
                valid=false;
                l++;
            }
        }
        if (!valid)
        {
            print("Error en el ingreso:(");
        }
    }
    public static void registro()
    {
        print("Bienvenido al registro de usuarios");
        print("Por favor ingrese cuantos usuarios va a ingresar ");
        nper = sc.nextInt();
        npers = npers + nper;
       int i = 0;
        while (i<npers)
        {
            String [] user = new String[5];
            print("Por favor ingrese los siguientes datos");
            print("Name: ");
            user [0] = sc.next();
            print("last name: ");
            user [1] = sc.next();
            print("Email: ");
            user [2] = sc.next();
            print("Password: ");
            user [3] = sc.next();
            user [4] = "00"+(i+1);
            users [i] = user;
            print("Felicidades fuiste registrado");
            print("Usuario "+user[0]+" Su id es: "+user[4]);

            i++;

        }
    }
    public static void visualUsuarios()
    {
        for(int j = 0;j<npers;j++)
        {
            print("Nombre: "+users [j][0]+" Id: "+users [j][4]);
            print();
        }
    }
    public static void print()
    {
        String text = "";
        System.out.println(text);
    }
    public static void print(String text)
    {
        System.out.println(text);
    }

}
