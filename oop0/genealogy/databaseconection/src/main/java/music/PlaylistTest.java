import music.Playlist;
import music.Song;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaylistTest {
    @Test
    public void testEmptyPlaylist(){
        Playlist playlist = new Playlist();
        assertTrue(playlist.isEmpty());
    }
    @Test
    public void testSingleElement(){
        Playlist playlist = new Playlist();
        playlist.add(new Song("Jan Kowalski","Test",183));
        assertEquals(1,playlist.size());
    }
    @Test
    public void testSameElements(){
        Playlist playlist = new Playlist();
        Song song = new Song("Jan Kowalski","Test",183);
        playlist.add(song);
        assertTrue(playlist.contains(song));
    }
    @Test
    public void testEqualElement(){
        Playlist playlist =new Playlist();
        Song song = new Song("Jan Kowalski","Test",183);
        Song samesong = new Song("Jan Kowalski","Test",183);
        playlist.add(song);
        assertTrue(playlist.contains(samesong));
        assertEquals(playlist.get(0),samesong);
    }

    @Test
    public void testAtSecond(){
        Playlist playlist = new Playlist();
        Song song1 = new Song("Lohn Doe", "Tes1", 100);
        Song song2 = new Song("Mary Sue", "Tes2", 150);
        Song song3 = new Song("Marty Sue", "Tes3", 200);

        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);

        assertEquals(song1, playlist.atSecond(0));
        assertEquals(song2, playlist.atSecond(200));
        assertEquals(song3, playlist.atSecond(300));
    }
    private IndexOutOfBoundsException doesThrowExceptionCommon(int seconds){
        Playlist playlist = new Playlist();
        Song song1 = new Song("Lohn Doe", "Tes1", 100);
        Song song2 = new Song("Mary Sue", "Tes2", 150);
        Song song3 = new Song("Marty Sue", "Tes3", 200);

        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);

        return assertThrows(IndexOutOfBoundsException.class, () -> playlist.atSecond((seconds)));
    }
    @Test
    public void testThrowException(){
        assertEquals("Zbyt duzy czas",
                doesThrowExceptionCommon(1500).getMessage());
    }

    @Test
    public void testDoesThrowNegativeException(){
        assertEquals("Ujemny czas", doesThrowExceptionCommon(-1000).getMessage());
    }



}