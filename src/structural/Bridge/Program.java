package structural.Bridge;

public class Program {

    public static void main(String[] args) {
//        TVset sony = new Sony("Sony100H");
        RemoteControl stRemote = new StandartRemoteC(new Sony("Sony100H"));
        
        System.out.println(stRemote.tvSet.getName());
        stRemote.on();
        stRemote.setChannel(1);
        stRemote.off();
    }
}
