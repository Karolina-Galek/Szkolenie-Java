package homework;

public class Zadanie {

	public static void main(String[] args) {
		Training tarining = new Training("Test automation in java");
		tarining.addParticipantEmail("mail1@example.com");
		tarining.addParticipantEmail("mail2.example.com");
		tarining.addParticipantEmail("mail3@example.com");
		tarining.addParticipantEmail("mail4@example.com");
		tarining.addParticipantEmail("mail5@example.com");

		System.out.println(tarining.getNumberOfParticipants());
		System.out.println(tarining.getParticipantEmails());
		System.out.println(tarining.toString());

		tarining.start();
	}
// wymagana liczba uczestników to 4, u mnie jest 5 więc szkolenie może się zacząć

}
