import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class ListOfTeamMates {
  private static final int MAX_TEAMMATES = 10;

  public static void main(String[] args) {
    ArrayList<TeamMate> list = new ArrayList<TeamMate>();

    String[] names = { "anaPMD", "anaelDSW", "andersonDC", "gabrielAD", "gabrielDSF", "gabrielVSC",
        "maitheSaldanhaFerrao", "marceloDSDA", "miguelJSDV", "rodrigoAS" };

    Integer i;
    for (i = 0; i < MAX_TEAMMATES; i++) {
      list.add(new TeamMate(i.toString(), names[i]));
      if (i % 2 == 0) {
        list.get(i).setOnline(true);
      }
    }

    System.out.println("\nTeammates:");
    for (i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).getUserID() + " " + list.get(i).getName());
    }

    System.out.println("\nTeammates Online (ID):");
    for (i = 0; i < list.size(); i++) {
      if (list.get(i).getOnline()) {
        System.out.println(list.get(i).getUserID());
      }
    }
    System.out.println("\nRemovendo offlines...\n\nRestantes:");
    i = 0;
    while (i < list.size()) {
      if(list.get(i).getOnline() == false){
        list.remove(list.get(i));
      }else{
        System.out.println(list.get(i).getName());
        i++;
      }
    }
  }
}
