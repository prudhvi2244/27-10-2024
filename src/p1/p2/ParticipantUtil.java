package p1.p2;

import java.util.List;
import java.util.stream.Stream;

public class ParticipantUtil {
    public Participant retrieveParticipantDetailsByParticipantId(Stream<Participant> participantStream, String participantId)
    {
        return participantStream.filter(participant ->participant.getParticipantId()
                .equals(participantId)).
                findFirst().orElse(null);
    }
    public List<Participant> retrieveParticipantDetailsByFoodType(Stream<Participant> participantStream, String foodType)
    {
        return participantStream.filter(participant -> participant.getFoodType().equals(foodType)).toList();
    }
    public Stream<Participant> retrieveTopParticipantIdsByPoints(Stream<Participant> participantStream,
                                                                 int topCount){
     return participantStream.sorted((p1,p2)->p1.getPoints()>=p2.getPoints()?1:-1).limit(topCount);
    }
}
