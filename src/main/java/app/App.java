package app;

public class App {

    public static void exe(){

    }
public static void menu choix ()
    {
        Scanner sc=new Scanner(System.in);
        int choix3 = 0;
         
         
         
         
        do
        {
            System.out.println("-------------------------choix --------------------------");
            System.out.println("                   1.Ajouter                                  ");//faites un choix 
            System.out.println("               3.stocker                               ");
            System.out.println("               4.rechercher                            ");
            System.out.println("               5.afficher                           ");
            System.out.println("               6.supprimer                             ");
            System.out.println("                   7.Quitter                              ");
            System.out.println("Taper votre choix :                                       ");
            choix3=sc.nextInt();
            switch(choix3)
            {
            case 1: String c;
                    choix c;
                    System.out.println("veuillez taper votre choix :");
                    c=sc.nextLine();
                    tp= new choix(c);
                    annuaire.getDir().getListe_choix().add(c);
                    System.out.println("choix bien ajouté !");
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
            default:System.out.println("svp respecter notre menu !");
            }
        }while(choix3!=6);
         
    }
}
