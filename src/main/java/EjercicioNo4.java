import java.util.Scanner;


public class EjercicioNo4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Juan escribe tu edad:");
        int ageJuan = scanner.nextInt();

        Juan juan = new Juan(ageJuan);
        System.out.println(juan.sayAge());
        
    }
}

class Juan {
    private int ageJuan;
    private int ageAlberto;
    private int ageAna;
    private int ageMom;
    
    
    public Juan(int ageJuan) {
        this.ageJuan = ageJuan;
        this.ageAlberto = ageJuan * 2/3;
        this.ageAna = ageJuan * 4/3;
        this.ageMom = this.ageJuan + this.ageAlberto + this.ageAna;
    }


    public String sayAge() {
        return "Juan's age: " + ageJuan + "\n" +
               "Alberto's age: " + ageAlberto + "\n" +
               "Ana's age: " + ageAna + "\n" +
               "Mom's age: " + ageMom;
    }
}
