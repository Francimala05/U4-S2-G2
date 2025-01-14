import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RubricaTelefonica {
    public static void main(String[] args) {

        System.out.println("Benvenuto sulla tua Rubrica Telefonica");
        Map<String,String> listaMap = new HashMap<>();
        int scelta = -1;
        Scanner scanner = new Scanner(System.in);
        while (scelta != 0) {
            System.out.println("➡️Digita 0 per uscire dal programma");
            System.out.println("➡️Digita 1 per inserire un contatto");
            System.out.println("➡️Digita 2 per eliminare un contatto");
            System.out.println("➡️Digita 3 per cercare un nome");
            System.out.println("➡️Digita 4 per cercare un numero");
            System.out.println("➡️Digita 5 per mostrare tutti i contatti");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                case 1:
                    registraContatto(listaMap);

           break;
                case 2:
                    eliminaContatto(listaMap);
                    break;
                case 3:
                    cercaContatto(listaMap);
                    break;
                case 4:
                    cercaNumero(listaMap);
                    break;
                case 5:
                    if (listaMap.isEmpty()) {
                        System.out.println("La rubrica è vuota.");
                    } else {
                        System.out.println("Ecco tutti i contatti:");
                        for (Map.Entry<String, String> entry : listaMap.entrySet()) {
                            System.out.println("Nome: " + entry.getKey() + " - Numero: " + entry.getValue());
                        }
                    }
                    break;

                default:
                    System.out.println("Scelta non valida!");
            }
        }


    }
    public static void registraContatto(Map<String,String> listaMap){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome della persona: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il numero della persona: ");
        String numero = scanner.nextLine();
        listaMap.put(nome,numero);
        System.out.println("Riepilogo contatto registrato: ");
         nome = listaMap.keySet().iterator().next();
         numero = listaMap.get(nome);
        System.out.println("Nome: " + nome + " Numero: " + numero);
    }

    public static void eliminaContatto(Map<String, String> listaMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome del contatto da eliminare: ");
        String nome = scanner.nextLine();

        if (listaMap.containsKey(nome)) {
            listaMap.remove(nome);
            System.out.println("Contatto '" + nome + "' eliminato con successo!");
        } else {
            System.out.println("Il contatto con il nome '" + nome + "' non esiste nella rubrica");
        }
    }

    public static void cercaContatto(Map<String, String> listaMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome del contatto da cercare: ");
        String nome = scanner.nextLine();
        if (listaMap.containsKey(nome)) {
            System.out.println("Ecco il contatto richiesto: " + nome + " - Numero: " + listaMap.get(nome));

        } else {
            System.out.println("Il contatto con il nome '" + nome + "' non esiste nella rubrica");
        }
    }

    public static void cercaNumero(Map<String, String> listaMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero del contatto da cercare: ");
        String numero = scanner.nextLine();
        if (listaMap.containsValue(numero)) {
            System.out.println("Ecco il contatto richiesto: " + listaMap.get(numero) + " - Numero: " + numero);

        } else {
            System.out.println("Il contatto con il numero '" + numero + "' non esiste nella rubrica");
        }
    }


    }
