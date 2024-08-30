package com.linkshortner;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class LinkShortner {

    static Scanner scanner = new Scanner(System.in);
    Map<String, String> urlMap = new HashMap<>();
    Map<String, String> shortToLongURL = new HashMap<>();

    /**
     * The following method generates a short URL by randomizing characters,
     * and returns a shortened version of the provided long URL.
     */
    private String generateShortenUrl(String theLongUrl) {
        String character_set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String TheURL= "https://motioncut.shop/";
        int URL_LENGTH = 6;
        StringBuilder theShortUrl;
        do {
            theShortUrl = new StringBuilder(TheURL);
            for (int i = 0; i < URL_LENGTH; i++) {
                int randomText = (int) (Math.random() * character_set.length());
                theShortUrl.append(character_set.charAt(randomText));
            }
        } while (shortToLongURL.containsKey(theShortUrl.toString()));
        return theShortUrl.toString();
    }

    //This method shortens the URL and handles potential collisions
    private String shortenUrl(String theLongUrl) {
        if (urlMap.containsKey(theLongUrl)) {
            System.out.println("URL is already shortened: " + urlMap.get(theLongUrl));
            return urlMap.get(theLongUrl);
        }
        String theShortUrl = generateShortenUrl(theLongUrl);
        urlMap.put(theLongUrl, theShortUrl);
        shortToLongURL.put(theShortUrl, theLongUrl);
        return theShortUrl;
    }

    // This method returns the original long URL from the provided short URL
    private String expandUrl(String theShortUrl) {
        if (!shortToLongURL.containsKey(theShortUrl)) {
            return "Error: Short URL does not exist.";
        }
        return shortToLongURL.get(theShortUrl);
    }

    // Handles user input for generating a short URL
    private String userchoice1(){
        System.out.print("Enter the long URL: ");
        String theLongUrl = scanner.nextLine();
        String theShortUrl = shortenUrl(theLongUrl);
        System.out.println("Shortened URL: " + theShortUrl);
        return theShortUrl;
    }

    // Handles user input for retrieving the original URL from a short URL
    private String userchoice2(){
        System.out.print("Enter the short URL: ");
        String theShortUrlToExpand = scanner.nextLine();
        String originalUrl = expandUrl(theShortUrlToExpand);
        System.out.println("Original URL: " + originalUrl);
        return originalUrl;
    }

    public static void main(String[] args) {
        LinkShortner link = new LinkShortner();
        while (true) {
            System.out.println("\nLink Shortener Application");
            System.out.println("1. Shorten URL\n2. Expand a Link\n3. Exit");
            System.out.print("Choose an option: ");
            int userchoice = scanner.nextInt();
            scanner.nextLine();
            
            switch(userchoice) {
                case 1 -> link.userchoice1();
                case 2 -> link.userchoice2();
                case 3 -> {
                    System.out.println("Exiting the Application...");
                    scanner.close(); // Closes the scanner
                    return; // Exits the application without errors
                }
                default -> System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
