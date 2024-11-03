package software.ulpgc.kata2;

public class Title {

    private final Genre genre;
    private final TitleType titleType;
    private final int id;
    private final String primaryTitle;
    private final String originalTitle;
    private final boolean isAdult;
    private final int startYear;
    private final int endYear;
    private final int runtimeMinutes;

    public Title(Genre genre, TitleType titleType, int id, String primaryTitle, String originalTitle, boolean isAdult, int startYear, int endYear, int runtimeMinutes) {
        this.genre = genre;
        this.titleType = titleType;
        this.id = id;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
        this.isAdult = isAdult;
        this.startYear = startYear;
        this.endYear = endYear;
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public Genre getGenre() {
        return genre;
    }

    public TitleType getTitleType() {
        return titleType;
    }

    public int getId() {
        return id;
    }

    public enum Genre{
        Action, Adult, Adventure, Animation, Biography, Comedy, Crime, Documentary, Drama, Family, Fantasy, FilmNoir, GameShow, genres, History, Horror, Music, Musical, Mystery, News, RealityTV, Romance, SciFi, Short, Sport, TalkShow, Thriller, War, Western
    }

    public enum TitleType{
        VideoGame,
        TvPilot,
        Movie,
        TvSeries,
        TvMiniSeries,
        Short,
        TvSpecial,
        TvShort,
        Video,
        TvMovie,
        TvEpisode
    }

    @Override
    public String toString() {
        return "Title{" +
                "genre=" + genre +
                ", titleType=" + titleType +
                ", id=" + id +
                ", primaryTitle='" + primaryTitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", isAdult=" + isAdult +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", runtimeMinutes=" + runtimeMinutes +
                '}';
    }
}
