package com.ccc.loanlibrary;


public class Game {
    private int gameId;
    private static int gameIdCounter = 1;
    private String title;
    private String platform;
    private String genre;
    private int quantity;

    public Game(String title, String platform, String genre, int quantity) {
        this.gameId = gameIdCounter++;
        this.title = title;
        this.platform = platform;
        this.genre = genre;
        this.quantity = quantity;
    }

    public int getGameId() {
        return gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }
    
    public void increaseQuantity() {
        quantity++;
    }
    

    @Override
    public String toString() {
        return "Game ID: " + gameId + "\nTitle: " + title + "\nPlatform: " + platform + "\nGenre: " + genre + "\nQuantity: " + quantity;
    }
}
