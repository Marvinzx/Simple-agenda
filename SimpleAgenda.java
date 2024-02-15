import java.util.Scanner;

public class SimpleAgenda {
    public static void agregarContacto (){

       Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese un contacto a agregar");

      String nombres= sc.nextLine();

      if (nombres.length() >4 && nombres.length() <8) {
          System.out.println("Contacto agregado con exito");




        }   else if (nombres.length() >7 && nombres.length()  <31){

          System.out.println("Agregado,contiene de 8-30 caracteres");

      }else {System.out.println("Nombre muy largo");}


    }

    public static void removerContacto(int b){

        if (b>1000 && b<9999){

            System.out.println("Verificando contacto a eliminar");

        }else {
            System.out.println("ID invalido");
        }

    }
    public  static String acualizarContacto(int N)
    {
        return "N/A";

    }
    public static void mostrarContactos(){
        System.out.println("Mostrando contacto");

    }

    public static void main(String[] args) {
        agregarContacto();
        //removerContacto();
       //mostrarContactos();
    }
}


