public class Author {
    private String authorName;
    private String genre;
    private int numberOfBooksPublished;
    private boolean expert;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfBooksPublished() {
        return numberOfBooksPublished;
    }

    public void setNumberOfBooksPublished(int numberOfBooksPublished) {
        this.numberOfBooksPublished = numberOfBooksPublished;
    }

    public boolean isExpert() {
        return expert;
    }

    public void setExpert(boolean expert) {
        this.expert = expert;
    }

    public Author(String authorName, String genre,
                  int numberOfBooksPublished, boolean expert) {
        this.authorName = authorName;
        this.genre = genre;
        this.numberOfBooksPublished = numberOfBooksPublished;
        this.expert = expert;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(getAuthorName());
        if (isExpert()) {
            result.append(" is an accomplished writer.");
        }
        result.append(" of the " + getGenre() + " genre with over " +
                getNumberOfBooksPublished() + " books published.");
        return result.toString();
    }
}



