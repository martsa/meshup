package project01.meshup.domain;

public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private String image;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getImage() {
        return image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
