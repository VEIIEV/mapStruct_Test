public class Author {

    private String authorFirstName;

    private String authorLastName;

    private String authorBiography;

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorBiography() {
        return authorBiography;
    }

    public void setAuthorBiography(String authorBiography) {
        this.authorBiography = authorBiography;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorFirstName='" + authorFirstName + '\n' +
                ", authorLastName='" + authorLastName + '\n' +
                ", authorBiography='" + authorBiography + '\n' +
                '}';
    }
}