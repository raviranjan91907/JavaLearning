package ConditionalStatement.SwitchStatment;

public class SwitchStatement {
    public static void main(String[] arg){
        char n='a';
        switch(n){
            case 'a':
                System.out.println(n);
                break;
            case 'b':
                System.out.println(n);
            default:
                System.out.println("enter a valid alphabet");
        }
    }
}
