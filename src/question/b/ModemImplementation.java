package question.b;

public class ModemImplementation implements DataChannel, Connection{
    private String myPhoneNum;
    public void send(char c){
        System.out.println("Sent message "+c+" from "+myPhoneNum);
    }
    public char receive(){
        System.out.println("Received message for "+myPhoneNum);
        return '0';
    }
    public void dial(String phoneNumber){
        System.out.println("Calling phone number:"+phoneNumber+" from "+myPhoneNum);
    }
    public void hangup(){
        System.out.println("Hanging up call from "+myPhoneNum);
    }
    public ModemImplementation(String phoneNum){
        myPhoneNum = phoneNum;
    }
}
// 1 field, 5 methods,
// field uses:5
// LCOM= 1 - 5/5 =0