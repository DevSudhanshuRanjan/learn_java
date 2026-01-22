
public class oops_learn {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a Pen object called p1
        p1.setColor("Red");
        p1.setTipSize(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        BankAccount user1 = new BankAccount();
        user1.name = "Sudhanshu";
        // user1.password = "abcd"; // This will throw an error as password is private (The field BankAccount.password is not visible)
        user1.setPassword("abcd"); // This is the correct way to set the password
    }
}

/*
 Objects are the entities in the real world that have some properties. 
 Classes are the group of these entities having similar attributes and behaviors.
 Class is a blueprint or template from which objects are created.
 A class have different attributes (properties) and functions (behaviors).
*/
class Pen{
    String  color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTipSize(int newTip){
        tip = newTip;
    }
} 


/*
 Access Modifiers: Access modifiers are the keywords which are used to define the access scope of a class, constructor, variable, method or data member.
 ┌──────────────────┬──────────────┬──────────────────┬──────────────────────────────────┬──────────────────┐
 │ Access Modifier  │ Within Class │ Within Package   │ Outside Package by Subclass Only │ Outside Package  │
 ├──────────────────┼──────────────┼──────────────────┼──────────────────────────────────┼──────────────────┤
 │ Private          │      Y       │        N         │                N                 │        N         │
 ├──────────────────┼──────────────┼──────────────────┼──────────────────────────────────┼──────────────────┤
 │ Default          │      Y       │        Y         │                N                 │        N         │
 ├──────────────────┼──────────────┼──────────────────┼──────────────────────────────────┼──────────────────┤
 │ Protected        │      Y       │        Y         │                Y                 │        N         │
 ├──────────────────┼──────────────┼──────────────────┼──────────────────────────────────┼──────────────────┤
 │ Public           │      Y       │        Y         │                Y                 │        Y         │
 └──────────────────┴──────────────┴──────────────────┴──────────────────────────────────┴──────────────────┘
 */

 class BankAccount{
    public String name;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
 }