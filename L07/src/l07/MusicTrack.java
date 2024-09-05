package l07;

/**
 * This class has some method to construct, get and set some values to make a
 * MusicTrack data type
 *
 * @author Rakhuzhuwo Sapruna (A00455075)
 */
public class MusicTrack {

    //instance constant
    public static final String DEF_ARTIST = "unknown";

    //instance variable
    private String artist;
    private String title;
    private double length;
    private int downloadCount = 0;
    public int trackID = 0;

    // first track will have a trackID of 1
    private static int trackIDGenerator = 1;

    /**
     * Primary Constructor This constructor assign the variable
     *
     * @param artist is the name of the artist
     * @param title is the song title
     * @param length is the length of the song
     * @param downloadCount is the download count
     */
    public MusicTrack(String artist, String title, double length,
            int downloadCount) {
        this.artist = artist;
        this.title = title;
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("ERROR: Invalid length " + length
                    + ", setting it to 0");
            this.length = 0;
        }//end if-else
        if (downloadCount >= 0) {
            this.downloadCount = downloadCount;
        } else {
            System.out.println("ERROR: Invalid length " + downloadCount
                    + ", setting it to 0");
            this.downloadCount = 0;
        }//end if-else
        trackID = trackIDGenerator;
        trackIDGenerator++;
    }

    /**
     * Secondary Constructor This constructor assign two variable title and
     * length
     *
     * @param title is the song title
     * @param length is the song length
     */
    public MusicTrack(String title, double length) {
        this(DEF_ARTIST, title, length, 0);
    }

    //getter
    /**
     * This method is a getter that is used to get the artist name
     *
     * @return artist name
     */
    public String getArtist() {
        return artist;
    }

    /**
     * This method is a getter that is used to get the song title
     *
     * @return song title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method is a getter that is used to get the length of the song
     *
     * @return length of the song
     */
    public double getLength() {
        return length;
    }

    /**
     * This method is a getter that is used to get the download count
     *
     * @return the download count
     */
    public int getDownloadCount() {
        return downloadCount;
    }

    //setter
    /**
     * This method is used to set the name of the artist of a music.
     *
     * @param artist is the updated artist name
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * This method is used to set the title of a music track.
     *
     * @param songTitle is the updated Title
     */
    public void setTitle(String songTitle) {
        title = songTitle;
    }

    /**
     * This method is used to set the length of a music.
     *
     * @param songLength is the updated the Length of the song
     */
    public void setLength(double songLength) {
        length = songLength;
        if (songLength < 0) {
            System.out.println("ERROR: Invalid length " + songLength
                    + ", the value is unchanged");
        } else {
            length = songLength;
        }//end if-else
    }

    /**
     * This method is used to set the download count of a music.
     *
     * @param downloadCount1 is updated the download count
     */
    public void setDownloadCount(int downloadCount1) {
        downloadCount = downloadCount1;
        if (downloadCount1 < 0) {
            System.out.println("ERROR: Invalid downloadCount " + downloadCount1
                    + ", the value is unchanged");
        } else {
            downloadCount = downloadCount1;
        }//end if-else
    }

    /**
     * This method prints the TrackID, title, artist, length and download count
     *
     * @return the TrackID, title, artist, length and download count
     */
    @Override
    public String toString() {
        return String.format("%06d - %s\nby %s\nLength: %.2f minutes"
                + "\nNumber of downloads: %d\n", trackID,
                title.toUpperCase(), artist, length,
                downloadCount);
    }
}
