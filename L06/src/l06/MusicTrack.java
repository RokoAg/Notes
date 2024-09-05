package l06;

/**
 * This class has some method to construct, get and set some values to 
 * make a music track.
 * 
 * @author Rakhuzhuwo Sapruna (A00455075)
 */
public class MusicTrack {

    private String artist;
    private String title;
    private double length;
    private int downloadCount;

    /**
     *This method construct a music track together 
     * 
     * @param artistName name of the artist
     * @param songTitle name of the title
     * @param songLength duration of the song
     * @param downloadCount1 number of downloads of the music 
     */ 
    public MusicTrack(String artistName, String songTitle, double songLength,
            int downloadCount1) {
        artist = artistName;
        title = songTitle;

        if (songLength < 0) {
            System.out.println("ERROR: Invalid length " + songLength
                    + ", setting it to 0");
            length = 0;
        } else {
            length = songLength;
        }//end if-else

        if (downloadCount1 < 0) {
            System.out.println("ERROR: Invalid downloadCount " + downloadCount1
                    + ", setting it to 0");
            downloadCount = 0;
        } else {
            downloadCount = downloadCount1;
        }//end if-else

    }

    //getter
    /**
     *This method is used to access the name of the artist.
     * 
     * @return the name of the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * This method is used to access the title
     *  
     * @return the title of the song
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method is used to access the Length duration of a music.
     * 
     * @return length of the song
     */
    public double getLength() {
        return length;
    }

    /**
     * This method is used to access the number of downloads of a music. 
     * 
     * @return return the download count
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
}
