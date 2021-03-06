
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD AZMI FAUZAN
 */
public class Petani {
     public static void main(String[] args) {
    String[] boxOfUnorganizedFruits = {
      "Apel",
      "Pisang",
      "Anggur",
      "Jambu",
      "Pepaya",
      "Duku",
      "Durian",
      "Jeruk",
      "Mangga",
      "Manggis",
    };

    int boxIndex = 0;
    int containerBoxIndex = 0;
    int boxSize = boxOfUnorganizedFruits.length;

    String[] boxOfOrganizedFruits = sortItems(boxOfUnorganizedFruits);
    String[][] boxesOfOrganizedFruits = new String[5][2];
    String pointer = boxOfOrganizedFruits[0];

         for (String boxOfOrganizedFruit : boxOfOrganizedFruits) {
             if (pointer.charAt(0) != boxOfOrganizedFruit.charAt(0)) {
                 pointer = boxOfOrganizedFruit;
                 containerBoxIndex++;
                 boxIndex = 0;
             }
             if (pointer.charAt(0) == boxOfOrganizedFruit.charAt(0)) {
                 boxesOfOrganizedFruits[containerBoxIndex][boxIndex] = boxOfOrganizedFruit;
                 boxIndex += 1;
             }
         }

    System.out.println(Arrays.deepToString(boxesOfOrganizedFruits));
  }

  public static String[] sortItems(String[] items) {
    for (int i = 0; i < items.length; i++) {
      String temp = items[i];
      int position = i;

      while( position >= 1 && items[position - 1].charAt(0) > temp.charAt(0) ) {
        items[position] = items[position - 1];
        position--;
      }

      items[position] = temp;
    }

    return items;
  }
}
