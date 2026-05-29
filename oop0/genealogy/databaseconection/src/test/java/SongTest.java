import com.sun.jdi.connect.Connector;
import music.Song;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import java.sql.SQLException;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SongTest {
    @Test
    public void testRead() throws SQLException {
        DatabaseConnection.connect("song.db");

        Optional<Song> song = Song.Parsistence.read(5);
        Song expected =
                new Song("Queen", "Bohemian Rhapsody", 355);
        assertTrue(song.isPresent());
        assertEquals(expected, song.get());
    }

    @Test
    public void testReadFail() throws SQLException{
        DatabaseConnection.connect("song.db");
        Optional<Song> song = Song.Parsistence.read(68);

        assertTrue(song.isEmpty());
    }

    private  static Stream<Connector.Argument> args(){
        return Stream.of(
                arguments(40, "The Beatles", "Help!", 138),
                arguments(41, "The Beach Boys", "California Girls", 165),
                arguments(42, "The Temptation", "Ain't Too Proud to Bag", 154)
        );
    }
    @ParameterizedTest
    @MethodSource("args")
    public void testReadMany(int id, String artist, String title){}






}
