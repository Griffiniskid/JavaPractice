import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {

    private List<Song> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(int index) {
        songs.remove(index);
    }

    public void playRandomSong() {
        Random random = new Random();
        int index = random.nextInt(songs.size());
        Song song = songs.get(index);
        System.out.println("Playing song: " + song.getTitle());
    }
}

class Song {

    private String title;
    private String artist;
    private int year;

    public Song(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        library.addSong(new Song("Bohemian Rhapsody", "Queen", 1975));
        library.addSong(new Song("Imagine", "John Lennon", 1971));
        library.addSong(new Song("Hey Jude", "The Beatles", 1968));

        library.playRandomSong();
    }
}
