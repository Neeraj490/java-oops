
interface PaymentMethod {
    void payment(double amount);
    void deposit(double amount);
}

class CreditCard implements PaymentMethod {
    double balance = 1000;

    public void payment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " using Credit Card. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Credit Card. New balance: " + balance);
    }
}

class DebitCard implements PaymentMethod {
    double balance = 500;

    public void payment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " using Debit Card. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Debit Card. New balance: " + balance);
    }
}

interface Customer {
    void showDetails();
    void makePayment(PaymentMethod method, double amount);
}

class RegularCustomer implements Customer {
    String name;
    PaymentMethod paymentMethod;

    RegularCustomer(String name, PaymentMethod method) {
        this.name = name;
        this.paymentMethod = method;
    }

    public void showDetails() {
        System.out.println("Regular Customer: " + name);
    }

    public void makePayment(PaymentMethod method, double amount) {
        method.payment(amount);
    }
}

class PremiumCustomer implements Customer {
    String name;
    PaymentMethod paymentMethod;

    PremiumCustomer(String name, PaymentMethod method) {
        this.name = name;
        this.paymentMethod = method;
    }

    public void showDetails() {
        System.out.println("Premium Customer: " + name);
    }

    public void makePayment(PaymentMethod method, double amount) {
        method.payment(amount);
    }
}

class Store {
    Customer[] customers;
    int count;

    Store(int capacity) {
        customers = new Customer[capacity];
        count = 0;
    }

    void addCustomer(Customer customer) {
        if (count < customers.length) {
            customers[count++] = customer;
        } else {
            System.out.println("Store customer limit reached.");
        }
    }

    void showCustomers() {
        for (int i = 0; i < count; i++) {
            customers[i].showDetails();
        }
    }
}

public class Q2_4 {
    public static void main(String[] args) {
        Store store = new Store(3);

        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();

        RegularCustomer customer1 = new RegularCustomer("neeraj", creditCard);
        PremiumCustomer customer2 = new PremiumCustomer("aadi", debitCard);

        store.addCustomer(customer1);
        store.addCustomer(customer2);

        store.showCustomers();

        customer1.makePayment(creditCard, 200);
        creditCard.deposit(100);

        customer2.makePayment(debitCard, 300);
        debitCard.deposit(150);
    }
}