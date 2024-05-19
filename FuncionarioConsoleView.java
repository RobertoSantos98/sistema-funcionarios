import java.util.Scanner;

public class FuncionarioConsoleView implements FuncionarioView{
    
    @Override
    public void displayData (String data){
        System.out.println(data);
    }

    @Override
    public String getUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    @Override
    public void ClearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
