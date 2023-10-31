package com.ccc.loanlibrary;


import java.time.LocalDate;

public class Loan {
    private int loanId;
    private static int loanIdCounter = 1;
    private Member member;
    private Game game;
    private LocalDate startDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public Loan(Member member, Game game, LocalDate startDate, LocalDate dueDate) {
        this.loanId = loanIdCounter++;
        this.member = member;
        this.game = game;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.returnDate = null; // Initialisation de returnDate à null car le jeu n'a pas encore été retourné
        this.game.decreaseQuantity();
    }
    

    public int getLoanId() {
        return loanId;
    }

    public Member getMember() {
        return member;
    }

    public Game getGame() {
        return game;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return (returnDate != null);
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return (    (!isReturned()) && (currentDate.isAfter(dueDate))   );
    }

    @Override
    public String toString() {
        return "Loan ID: " + loanId + "\nMember: " + member.getName() + "\nGame: " + game.getTitle() + "\nStart Date: " + startDate + "\nDue Date: " + dueDate;
    }
}
