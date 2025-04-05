import java.util.Scanner;

class AdivinarPersonaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Piensa en un personaje de la siguiente lista y no lo digas:");
        System.out.println("Radamel Falcao García\nGoku\nMichael Jordan\nEminem\nDarth Vader\nAdam Sandler");
        System.out.println("Bruce Wayne\nTin Tin\nAyudante de Santa\nJoe Biden\nJosé Saramago\nGünter Grass\nKim Jong Un.");
        
        System.out.println("Voy a hacerte 5 preguntas para adivinar el personaje, responde con si o no.");

        System.out.println("Tu personaje es ficticio?");
        String respuesta = scanner.nextLine().toLowerCase();
        if (respuesta.equals("si")) {
            System.out.println("Ha sido revivido?");
            if (scanner.nextLine().equalsIgnoreCase("si")){
                System.out.println("Tu personaje es Goku.");
            } else {
                System.out.println("Tiene mucha plata?");
                if (scanner.nextLine().equalsIgnoreCase("si")){
                    System.out.println("Tu personaje es Bruce Wayne.");
                } else {
                    System.out.println("Es amigo de Bart?");
                    if (scanner.nextLine().equalsIgnoreCase("si")){
                        System.out.println("Tu personaje es Ayudante de Santa.");
                    }
                    else {
                        System.out.println("Es el cucho de Leia?");
                        if (scanner.nextLine().equalsIgnoreCase("si")){
                            System.out.println("Tu personaje es Darth Vader.");
                        } else {
                            System.out.println("Tu personaje es Tin Tin.");
                        }
                    }
                }
            }
        } else {
            System.out.println("Hace deporte?");
            if (scanner.nextLine().equalsIgnoreCase("si")){
                System.out.println("Usa el número 9?");
                if (scanner.nextLine().equalsIgnoreCase("si")){
                    System.out.println("Tu personaje es Radamel Falcao García.");
                } else {
                    System.out.println("Tu personaje es Michael Jordan.");
                }
            } else {
                System.out.println("Tiene más de 70 años y aún vive?");
                if (scanner.nextLine().equalsIgnoreCase("si")){
                    System.out.println("Ha ganado el premio Nobel de literatura?");
                    if (scanner.nextLine().equalsIgnoreCase("si")){
                        System.out.println("Tu personaje es Jose Saramago.");
                    } else {
                        System.out.println("Tu personaje es Joe Biden.");
                    }
                } else {
                    System.out.println("Ha hecho peliculas?");
                    if (scanner.nextLine().equalsIgnoreCase("si")){
                        System.out.println("Ha ganado un Oscar?");
                        if (scanner.nextLine().equalsIgnoreCase("si")){
                            System.out.println("Tu personaje es Eminem.");
                        } else {
                            System.out.println("Tu personaje es Adam Sandler.");
                        }
                    } else {
                        System.out.println("Ha ganado el premio Nobel de literatura?");
                        if (scanner.nextLine().equalsIgnoreCase("si")){
                            System.out.println("Tu personaje es Guenter Grass.");
                        } else {
                            System.out.println("Tu personaje es Kim Jong Un.");
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}