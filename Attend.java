  /* Fichier: Attend
   * Version: 1
   * Info:		Il sert � cr�er une attende.
   */

  public class Attend extends Thread{
     
       public Attend(int temps){
       
      //On doit mettre un 'try' quand on veut utiliser le 'sleep'.
         try{
         //Ici, il y a un temps d'attende, le temps d'attende est en milliseconde:
            sleep(temps);
         }
             catch (Exception e){
            }
      
      }
   
   }
