package com.example.liamc.lecturetrack;

/**
 * Abstract class that enables creation of User object.
 * Created when user wishes to register with application in order to use it.
 * @author Liam Cassidy
 */
public abstract class User {

    private String name;
    private String emailAddress;
    private String UID;

    public User(String name, String emailAddress, String UID) {
        this.setName(name);
        this.setEmailAddress(emailAddress);
        this.setUID(UID);

    }

    /**
     * Default Constructor
     */
    public User() {
    }

    /**
     * Getter for firstName of User
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for firstName of User
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * Getter for emailAddress
     * @return emailAddress String
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for emailAddress
     * @param emailAddress String
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for UID.
     * UID will be generated by FirebaseAuth process.
     *
     * @return UID String
     */
    public String getUID() {
        return UID;
    }

    /**
     * Setter for UID.
     * UID is generated by FirebaseAuth process.
     * Used to determine if user can change database values etc.
     * @param UID String
     */
    public void setUID(String UID) {
        this.UID = UID;
    }
}
