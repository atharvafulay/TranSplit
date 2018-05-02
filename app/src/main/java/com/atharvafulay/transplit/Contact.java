package com.atharvafulay.transplit;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    private String password; // no getter for this
    private String username;
    private boolean isOwner;

    /**
        The two below have not been set up yet.
     */
    //  private Array<Integer> // IDs
    // private ArrayList<Transactions> prevTransactions // what transactions this contact is involved in.

    private boolean isInCurrentMeet;
    private String preferredPaymentMethod;
    private String mostRecentActivity;
    private ArrayList<Integer> itemNumbers;
    private float requestAmount;
    private boolean notAssigned;
    private boolean isTemp;

    /**
     * ----------------------------------------Constructors-----------------------------------------
     */

    /**
     * This is for the most basic contact. All we need is their Name, Email and Phone from the Contacts list.
     *
     * @param firstName
     * @param lastName
     * @param email
     * @param phoneNumber
     */
    public Contact(String firstName, String lastName, String email, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * This is for the most basic contact. All we need is their Name, Phone from the Contacts list.
     *
     * @param firstName
     * @param lastName
     * @param phoneNumber
     */
    public Contact(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param email
     */
    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        
    }


    public Contact(String firstName, String lastName, String email, int phoneNumber, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.isOwner = true; // this will always be true for owner
        this.isTemp = false; // this will always be false for owner
        this.isInCurrentMeet = true; // this will always be true for owner
    }



    /**
     * ----------------------------------------Getters----------------------------------------------
     */


    /**
     * Returns the first name of the Contact
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Returns the last name of the Contact
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the Contact's email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns Contact's mobile phone number
     * @return phonenumber
     */
    public int getPhonenumber() {
        return phoneNumber;
    }

    /**
     * Returns Contact's username (should only be present for owner -- IsOwner = 1)
     * @return username
     */
    public String getUsername() {
        if (isOwner) {
            return username;
        } else {
            return null;
        }
    }

    /**
     * Returns if Contact is the owner of the app
     * @return isOwner
     */
    public boolean getIsOwner() {
        return isOwner;
    }

    /**
     * Returns if the Contact is in current meet.
     * @return isInCurrentMeet
     */
    public boolean isInCurrentMeet() {
        return isInCurrentMeet;
    }

    /**
     * Returns contact's preferred Payment Method
     * @return preferredPaymentMethod
     */
    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    /**
     * Returns Contact's most recent activity
     * @return preferredPaymentMethod
     */
    public String getMostRecentActivity() {
        return mostRecentActivity;
    }

    /**
     * Returns what item numbers are associated with this contact for the current transaction
     * @return itemNumbers
     */
    public ArrayList<Integer> getItemNumbers() {
        return itemNumbers;
    }

    /**
     * Returns the request amount for the current transaction
     * @return requestAmount
     */
    public float getRequestAmount() {
        return requestAmount;
    }

    /**
     * Returns if the Contact has not been assigned to any item in the transaction
     * @return isNotAssigned
     */
    public boolean isNotAssigned() {
        return notAssigned;
    }

    /**
     * Returns if the Contact is temporary
     * @return isTemp
     */
    public boolean getIsTemp() {
        return isTemp;
    }

    /**
     * ----------------------------------------Setters----------------------------------------------
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        if (isOwner) {
            this.username = username;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    public void isInCurrentMeet(boolean isInCurrentMeet) {
        this.isInCurrentMeet = isInCurrentMeet;
    }

    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void setMostRecentActivity(String mostRecentActivity) {
        this.mostRecentActivity = mostRecentActivity;
    }

    public void setItemNumbers(ArrayList<Integer> itemNumbers) {
        this.itemNumbers = itemNumbers;
    }

    public void setRequestAmount(float requestAmount) {
        this.requestAmount = requestAmount;
    }

    public void isNotAssigned(boolean notAssigned) {
        this.notAssigned = notAssigned;
    }

    public void setIsTemp(boolean isTemp) {
        this.isTemp = isTemp;
    }


}
