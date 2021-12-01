/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling (Edited By Oliver Richardson)
 * @version 2016.02.29 (Edited 13/10/21)
 */
public class TicketMachine
{
    private int price;
    private int balance;
    private int total;
    private boolean valid;

    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    //getters
    public int getPrice()
    {
        return price;
    }

    public int getTotal()
    {
        return total;
    }
    
    public int getBalance()
    {
        return balance;
    }
    //setters
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
    //calculators
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    //printers
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
    }
    
    public void showPrice()
    {
        System.out.println("The price of a ticket is "+price+" cents.");
    }
    //compound
    public void printTicket()
    {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
    
        total = total + balance;
        balance = 0;
    }
}

