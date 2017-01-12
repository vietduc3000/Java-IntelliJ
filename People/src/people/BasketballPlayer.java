
package people;


public class BasketballPlayer extends Person implements iDisplayable{
    
    private String teamName;
    private String number;
    private String position;

    public BasketballPlayer(int i, String s, String s1, String s2, int i1) {
       
    }

    public BasketballPlayer(String teamName, String number, String position, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.teamName = teamName;
        this.number = number;
        this.position = position;
    }
    
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public void toPrint(){
    System.out.println("First Name:     \t"+ super.getFirstName());
    System.out.println("Last Name:     \t"+ super.getLastName());
    System.out.println("Age:    \t"+super.getAge());
    System.out.println("Team:   \t"+this.teamName);
    System.out.println("Number: \t"+this.number);
    System.out.println("Position:    \t"+this.position);
    
    
    }
    
    
}
