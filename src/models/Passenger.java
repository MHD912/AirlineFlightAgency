/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author husse
 */
public class Passenger {

    private String fullName;
    private String password;
    private float balance;
    private String passportID;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public Passenger() {
        this.fullName = "";
        this.password = "";
        this.balance = 0;
        this.passportID = "";
    }

    public Passenger(Passenger passenger) {
        this.fullName = passenger.fullName;
        this.password = passenger.password;
        this.balance = passenger.balance;
        this.passportID = passenger.passportID;
    }

    public Passenger(String fullName, String password, float balance, String passportID) {
        this.fullName = fullName;
        this.password = password;
        this.balance = balance;
        this.passportID = passportID;
    }

    public void writeToFile(String filePath, String oldString, String newString) {
        File fileToBeModified = new File("C:\\Users\\acc\\Desktop\\alaa.txt");
        String oldContent = "";
        BufferedReader reader;
        FileWriter writer;
        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));

//           Reading all the lines of input text file into oldContent
            String line = reader.readLine();
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }

//           Replacing oldString with newString in the oldContent
            String newContent = oldContent.replaceAll(oldString, newString);

//           Rewriting the input text file with newContent
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void readFromFile() {
        try {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\file.txt"));

//            Read lines from file.
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
//            Split line on comma
                String[] parts = line.split(";");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        } catch (FileNotFoundException notFoundEx) {
            System.err.println(notFoundEx);
        } catch (IOException ioEx) {
            System.err.println(ioEx);
        }
    }
}
