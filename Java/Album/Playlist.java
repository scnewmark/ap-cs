package Album;

import java.util.*;

public final class Playlist {
    private Song[] list;

    // Constructors
    public Playlist() { this.list = new Song[]{ new Song() }; }
    public Playlist(final int size) { this.list = new Song[size]; }

    // Accessors
    public Song[] getList() { return this.list; }
    public Song getSong(final int x) { return this.list[x]; } 

    // Modifiers
    public void setList(final int size) { this.list = new Song[size]; }

    public void addSong(int x, Song s) {
        if (x < this.list.length && this.list[x] == null) this.list[x] = s;
        else {
            final Song[] list = new Song[this.list.length + 1];
            for (int i = 0; i < list.length; i++) {
                if (i < x) {
                    list[i] = this.list[i];
                } else if (i == x) {
                    list[i] = s;
                } else {
                    list[i] = this.list[i - 1];
                }
            }
            this.list = list;
        }
    }

    public int numSongs() {
        int res = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) res++;
        }
        return res;
    }

    public int totalLength() {
        int res = 0;
        for (int i = 0; i < this.list.length && this.list[i] != null; i++) {
            res += this.list[i].getLength();
        }
        return res;
    }

    public void removeArtist(final String artist) {
        for (int i = 0; i < this.list.length && this.list[i] != null; i++) {
            if (this.list[i].getArtist().equals(artist)) {
                this.list[i] = null;
            }
        }
        this.shiftAll();
    }

    public void removeLength(final int length) {
        for (int i = 0; i < this.list.length && this.list[i] != null; i++) {
            if (this.list[i].getLength() > length) {
                this.list[i] = null;
            }
        }
       this.shiftAll();
    }

    private void shiftAll() {
        final Song[] list = new Song[this.numSongs()];
        int index = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                list[index] = this.list[i];
            }
        }
        this.list = list;
    }

    public void shuffle() {
        final Song[] list = new Song[this.list.length];
        final Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < this.list.length && this.list[i] != null; i++) {
            int rand = 0 + (int)(Math.random() * (((this.list.length - 1) - 0) + 1));
            while (map.get(rand) != null) {
                rand = 0 + (int)(Math.random() * (((this.list.length - 1) - 0) + 1));
            }
            map.put(rand, true);
            list[i] = this.list[rand];
        }
    }

    @Override
    public boolean equals(Object o) {
        Playlist p = (Playlist) o;
        if (!Arrays.equals(this.list, p.getList())) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() { return Arrays.toString(this.list); }
}
