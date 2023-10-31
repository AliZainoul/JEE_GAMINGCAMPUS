package com.ccc.loanlibrary;

public class Main {

    public static void printLine(){
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    public static void print(String _string){
        System.out.println("\n" + _string);
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Creating members
        Member member1 = new Member("Alice Johnson", "alice.johnson@example.com");
        Member member2 = new Member("John Smith", "john.smith@example.com");

        // Creating games with specified quantities
        Game game1 = new Game("Super Mario", "Platform", "Adventure", 10);
        Game game2 = new Game("The Legend of Zelda", "Adventure", "Fantasy", 5);

        // Adding members and games to the library
        library.addMember(member1);
        library.addMember(member2);
        library.addGame(game1);
        library.addGame(game2);

        // Displaying members, games, and loans before lending
        print("------ Displaying members, games, and loans before lending ------");
        printLine();
        print("Members:");
        for (Member member : library.getMembers()) {
            print(member.toString());
        }

        printLine();
        print("Games:");
        for (Game game : library.getGames()) {
            print(game.toString());
        }

        printLine();
        print("Loans:");
        for (Loan loan : library.getLoans()) {
            print(loan.toString());
        }

        // Lending games
        library.lendGame(member1, game1);
        library.lendGame(member1, game2);

        // Displaying members, games, and loans after lending
        print("------ Displaying members, games, and loans after lending ------");
        printLine();
        print("Members:");
        for (Member member : library.getMembers()) {
            print(member.toString());
        }

        printLine();
        print("Games:");
        for (Game game : library.getGames()) {
            print(game.toString());
        }

        printLine();
        print("Loans:");
        for (Loan loan : library.getLoans()) {
            print(loan.toString());
        }

        // Returning a game
        Loan loanToReturn = library.getLoans().get(0); // Get the first loan
        library.returnGame(loanToReturn);

        // Displaying members, games, and loans after returning the first loan
        print("------ Displaying members, games, and loans after returning the loan ------");
        printLine();
        print("Members:");
        for (Member member : library.getMembers()) {
            print(member.toString());
        }

        printLine();
        print("Games:");
        for (Game game : library.getGames()) {
            print(game.toString());
        }

        printLine();
        print("Loans:");
        for (Loan loan : library.getLoans()) {
            print(loan.toString());
        }
    }
}


/* 
 *  Instructions Compilation:
 *      javac -d bin src/com/ccc/loanlibrary/*.java
 * 
 *  Instructions Exécution:
 *      java -cp bin com.ccc.loanlibrary.Main
 * 
 *  Instructions compilation et exécution:
 *      javac -d bin src/com/ccc/loanlibrary/*.java && java -cp bin com.ccc.loanlibrary.Main
 * 
*/


        /* 
            Member member3 = new Member("Emily Davis", "emily.davis@example.com");
            Member member4 = new Member("Michael Wilson", "michael.wilson@example.com");
            Member member5 = new Member("Sarah Brown", "sarah.brown@example.com");
            Member member6 = new Member("David Lee", "david.lee@example.com");
            Member member7 = new Member("Laura Miller", "laura.miller@example.com");
            Member member8 = new Member("James Jones", "james.jones@example.com");
            Member member9 = new Member("Olivia Taylor", "olivia.taylor@example.com");
            Member member10 = new Member("Daniel White", "daniel.white@example.com");
        */