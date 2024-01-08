/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Student
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MClient {

    public static void main(String[] args) {

        String serverHostname = "127.0.0.1";

        System.out.printf("Attemping to connect to host %s on port 10008.\n", serverHostname);

        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket(serverHostname, 10008);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream()));

        } catch (IOException e) {
            System.err.println(e);
        }
        BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in));
        String userInput;

        System.out.println("Type Message (\"Bye.\" to quit)");
        try {
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("server sends the following message: " + in.readLine());

                // end loop
                if (userInput.equals("Bye.")) {
                    break;
                }

            }
        } catch (IOException r) {
            System.err.println(r);
        }
        try {
            out.close();
            in.close();
            stdIn.close();
            echoSocket.close();
        } catch (IOException r) {
        }

    }
}
