package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_13;

public class Movie {

    private String title;
    private String director;
    private int duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMovieDetails () {
        return "Title: " + title + " Director: " + director + " Duration: " + duration;
    }
}

