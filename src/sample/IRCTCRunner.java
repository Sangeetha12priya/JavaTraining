package sample;

public class IRCTCRunner {

	public static void main(String[] args) {
		FirstTrain oFristTrain = new FirstTrain();
		oFristTrain.trainName();
		oFristTrain.trainDate();
		oFristTrain.trainFormPlace();
		oFristTrain.trainToPlace();
		oFristTrain.passengerDetails();
		oFristTrain.passengerDetails("Priya", 26);
		SecondTrain oSecondTrain = new SecondTrain();
		oSecondTrain.trainName();
		oSecondTrain.trainDate();
		oSecondTrain.trainFormPlace();
		oSecondTrain.trainToPlace();
	}

}
