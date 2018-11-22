package bdj;

import java.util.Scanner;

public class character_stats_calculator {
    
    public static void main(String[] args) {
        Scanner keybrd = new Scanner(System.in);
        System.out.print("Enter your character name: ");
        String name=keybrd.next();
        System.out.print("Enter character level: ");
        int level=keybrd.nextInt();
        character_stat stats = new character_stat(name,level);
        System.out.println();
        System.out.println(stats.getStats());
    }
    
}
