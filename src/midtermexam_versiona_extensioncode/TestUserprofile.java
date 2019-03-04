/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author mphg9
 */
public class TestUserprofile {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your user ID: ");
        String userID = input.nextLine();
        System.out.println("Please choose one of these genres (Comedy, Drama, Action, Mystery)");
        String userGenre = input.nextLine();
        UserProfile user = new UserProfile(userID, userGenre);
        System.out.println("Your user profile was created.");
    }
}
