//package Encapsulation;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (borrower != null) {
            System.out.println("Borrower: " + borrower);
        } else {
            System.out.println("Currently available");
        }
    }
}

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrower);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrower);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrower);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B101", "Java Programming", "John Doe"),
            new Magazine("M202", "Tech Monthly", "Editorial Board"),
            new DVD("D303", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                if (r.checkAvailability()) {
                    r.reserveItem("Alice");
                    System.out.println("Reserved by Alice");
                } else {
                    System.out.println("Not available for reservation");
                }
            }

            System.out.println("---------------------------");
        }
    }
}
