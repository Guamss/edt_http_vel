
public class Main
{
    public static void main(String[] args) throws Exception
    {
        // Exemple d'utilisation
        Jour jour = new Jour("INF3-FA", "2024-09-09", "2024-09-09");
        for (Cours cours : jour.getCoursList())
        {
            System.out.println(cours);
        }
    }

}
