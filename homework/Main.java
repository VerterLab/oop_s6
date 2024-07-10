package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Reporter report = new Reporter(user);
        Persister persis = new Persister(user);
        report.report();
        persis.save();
    }
}
