package l07;
import java.util.Scanner;

/**
 *
 * @author Somayeh Kafaie (A00000000)
 */
public class MusicTrackDriver {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Creating a new record for a music track");
        System.out.println("------------------------\n");
        
        MusicTrack firstTrack = new MusicTrack("Michael Brecker", "Midnight Mood",
                6.38, 2560174);
        System.out.println(firstTrack.getTitle().toUpperCase());
        System.out.println("by "+ firstTrack.getArtist());
        System.out.printf("Length: %.2f minutes\n", firstTrack.getLength());
        System.out.println("Number of downloads: "+ firstTrack.getDownloadCount());
       
        System.out.println("\n---[ Activity 1 ]---");
        System.out.println("The default artist is: "+ MusicTrack.DEF_ARTIST);
        MusicTrack newTrack = new MusicTrack("Coma", 10.27);
        System.out.println(newTrack.getTitle().toUpperCase());
        System.out.println("by "+ newTrack.getArtist());
        System.out.printf("Length: %.2f minutes\n", newTrack.getLength());
        System.out.println("Number of downloads: "+ newTrack.getDownloadCount());

        System.out.println("\n---[ Activity 2 ]---");
        for (int i = 0; i < 10; i ++) {
            MusicTrack track = new MusicTrack("test title", 3.14);
            System.out.println(track.trackID);
        }

        System.out.println("\n---[ Activity 3 ]---");
        MusicTrack famousTrack = new MusicTrack("Queen", "Somebody To Love",
                5.16, 729515997);
        System.out.println(firstTrack + "\n\n" + famousTrack);

        
        
    }

}
