package com.ccc.loanlibrary;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Member> members;
    private List<Game> games;
    private List<Loan> loans;

    public Library() {
        members = new ArrayList<>();
        games = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Game> getGames() {
        return games;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void lendGame(Member member, Game game) {
        if (isMember(member) && isGameAvailable(game)) {
            LocalDate startDate = LocalDate.now(); // Date actuelle
            LocalDate dueDate = startDate.plusDays(30); // Par exemple, le jeu doit être retourné dans 30 jours

            Loan loan = new Loan(member, game, startDate, dueDate);
            loans.add(loan);
        }
    }
    
    public void returnGame(Loan loan) {
        if (loans.contains(loan)) {
            if ( !(loan.isOverdue()) ) {
                loan.getGame().increaseQuantity();
                loans.remove(loan); // Remove the loan from the list
            }
            else {
                System.out.println("Logic of overdue loan return.");
            }
        }
        else {
            System.out.println("Logic of raising an exception.");
        }
    }
    


    
    
    public boolean isMember(Member member) {
        return members.contains(member);
    }

    public boolean isGameAvailable(Game game) {
        return (game.getQuantity() > 0);
    }
    
}
