package p1.p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of participants");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the placement Enter the participant details");
        List<Participant> participants=new ArrayList<>();
        Stream stream=participants.stream();
        String record=null;
        ParticipantUtil participantUtil=new ParticipantUtil();
        Participant participant=null;
        for (int i = 0; i <n ; i++) {
            record = sc.nextLine();
            String []s=record.split(":");
            participant=new Participant(s[0],s[1],s[2],s[3],Float.parseFloat(s[4]));
            participants.add(participant);
        }

        System.out.println("Enter the participant ID");
        String participantID=sc.nextLine();

        Participant participant1= participantUtil.retrieveParticipantDetailsByParticipantId(stream,participantID);
        System.out.println(participant1.getParticipantId()+" "+participant1.getParticipantName()+" "+
                participant1.getFoodType()+" "+participant1.getFoodName()+" "+participant1.getPoints());
    }
}
