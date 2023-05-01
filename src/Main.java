import java.util.Scanner;

public class Main {
    public static void main(String []args){
        ReadXml reader = new ReadXml();
        reader.readFromXml();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Book Id To Get Info");
        String id = sc.nextLine();
        reader.findBookById(id);
    }
}
