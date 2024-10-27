package p1.p2;

public class Participant {
    private String participantId;
    private String participantName;
    private String foodType;
    private String foodName;
    private double points;

    Participant(String participantId, String participantName, String foodType, String foodName, double points) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.foodType = foodType;
        this.foodName = foodName;
        this.points = points;
    }

    public double getPoints() {
        return points;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getParticipantId() {
        return participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

}
