package Album;

public final class Song {

    private String title;
    private String album;
    private String artist;
    private int songLength;

    public Song() {
        this.title = "";
        this.album = "";
        this.artist = "";
        this.songLength = 0;
    }

    public Song(final String title, final String album, final String artist, final int songLength) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.songLength = songLength;
    }

    // Accessors
    public String getTitle() { return this.title; }
    public String getAlbum() { return this.album; }
    public String getArtist() { return this.artist; }
    public int getLength() { return this.songLength; }

    // Modifiers
    public void setTitle(final String title) { this.title = title; }
    public void setAlbum(final String album) { this.album = album; }
    public void setArtist(final String artist) { this.artist = artist; }
    public void setLength(final int songLength) { this.songLength = songLength; }

    public boolean equals(final Song s) {
        return (this.title == s.getTitle()) && (this.album == s.getAlbum()) 
            && (this.artist == s.getArtist()) && (this.songLength == s.getLength());
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s(%d)", this.title, this.album, this.artist, this.songLength);
    }
}