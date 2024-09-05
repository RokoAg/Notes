package l06;

/**
 * This class tests methods in MusicTrack.<br><br>
 *
 * <strong>DO NOT CHANGE ANYTHING IN THIS CLASS!!</estrong
 *
 * @author yasushi akiyama
 */
public class MusicTrackDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Testing the default constructor ===");
        MusicTrack m1 = new MusicTrack("Michael Brecker", "Midnight Mood",
                6.38, 2560174);
        MusicTrack m2 = new MusicTrack("Beatles", "Come Together",
                4.32, 579091111);
        System.out.println("(If you don't see any errors above, good!)");
        pause();

        System.out.println("\n--- now those with errors ---");
        System.out.println("\nYou should see the error message for 'length'"
                + " with -2.0 below");
        MusicTrack m3 = new MusicTrack("Queen", "Somebody To Love",
                -2, 729515997);
        System.out.println("\nYou should see the error message for 'length'"
                + " with -5.0 below");
        m3 = new MusicTrack("Queen", "Somebody To Love",
                -5, 729515997);
        System.out.println("\nYou should see the error message for 'length'"
                + " with -7.0 below");
        m3 = new MusicTrack("Queen", "Somebody To Love",
                -7, 729515997);
        System.out.println("\nYou should see the error message for "
                + "'downloadCount'" + " with -58");
        MusicTrack m4 = new MusicTrack("Thelonious Monk", "Blue Monk",
                7.6, -58);
        System.out.println("\nYou should see the error message for "
                + "'downloadCount'" + " with -240");
        m4 = new MusicTrack("Thelonious Monk", "Blue Monk",
                7.6, -240);

        pause();

        System.out.println("\n\n=== Testing getters ===");
        System.out.println("Should print Michael Brecker: " + m1.getArtist());
        System.out.println("Should print Midnight Mood: " + m1.getTitle());
        System.out.println("Should print 6.38: " + m1.getLength());
        System.out.println("Should print 2560174: " + m1.getDownloadCount());
        pause();

        System.out.println("\n--- now those with errors ---\n"
                + "(They should have been set to zeros "
                + "in the default constructor)\n");

        System.out.println("Should print 0.0: " + m3.getLength());
        System.out.println("Should print 0: " + m4.getDownloadCount());

        pause();

        System.out.println("\n\n=== Testing setters ===");
        m2.setTitle("Something");
        m2.setLength(3.03);
        m2.setDownloadCount(235959475);
        System.out.println("Should (literally!!) print Something: " 
                + m2.getTitle());
        System.out.println("Should print 3.03: " + m2.getLength());
        System.out.println("Should print 235959475: " + m2.getDownloadCount());
        pause();

        System.out.println("\n--- now those with errors ---");
        System.out.println("Should see the error for length (-1.0) "
                + "but no change");
        m2.setLength(-1);
        System.out.println("\nShould see the error for length (-20.0) "
                + "but no change");
        m2.setLength(-20);
        System.out.println("\nShould still print 3.03: " + m2.getLength());
        System.out.println("\nShould see the error for downloadCount (-100) "
                + "but no change");
        m2.setDownloadCount(-100);
        System.out.println("\nShould see the error for downloadCount (-50) "
                + "but no change");
        m2.setDownloadCount(-50);
        System.out.println("\nShould print 235959475: " + m2.getDownloadCount());
        pause();

    }//end main()

    /**
     * This method pauses the program, waiting for the enter key to be pressed.
     */
    public static void pause() {
        System.out.print("\n... Press Enter to continue");
        java.util.Scanner k = new java.util.Scanner(System.in);
        k.nextLine();
    }//end pause()

}//end class
