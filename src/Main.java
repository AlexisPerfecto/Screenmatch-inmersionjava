import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidos a la inmersion en Java!");
        System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix I";
        String sinopsis = """
                Matrix es mi pelicula favorita sobre hackers y como salir de la realidad virtual
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Cuando se estreno: " + fechaDeLanzamiento);
        System.out.println("Calificacion de 1 al 5: " + evaluacion);
        System.out.println("La tienes incluida en tu subscripcion: " + incluidoEnElPlanBasico);
        System.out.println("Resumen de la pelicula: " + sinopsis);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if(fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        }else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la calificacion que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix " +
                "calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
        }
    }
