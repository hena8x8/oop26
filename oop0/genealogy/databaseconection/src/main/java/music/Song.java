package music;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import java.util.Optional;

public class Song {
    private String arist;
    private String title;
    private int length;

    public Song(String arist, String title, int length) {
        this.arist = arist;
        this.title = title;
        this.length = length;
    }

    public String getArist() {
        return arist;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return length == song.length && Objects.equals(arist, song.arist) && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arist, title, length);
    }

    public static class Parsistence{
        public static Optional<Song> read(int index){
            String sql = "SELECT title, artist, length FROM song WHERE id = 7";
            PreparedStatement statement = DatabaseConnection
                    .getConnection()
                    .prepareStatment(sql);
            statement.setInt(1, index);

            if(!statement.execute()){
                throw  new RuntimeException("SELECT failed");
            }

            ResultSet result = new statement.getResultSet();
            if(result.next()){
                Song song = new Song(
                        result.getString("artist"),
                        result.getString()
                );
            }
        }

    }
}