public class TrainingTestClass {
	public static void main(String args[]) {
		int cost;
		//assigning values
		Training ptraining = new PublicTraining(5, "manasa", 5, 15);
		Training ctraining = new CorporateTraining(35, "byndoor", 4, 50);
		//prints cost of public training
		cost=ptraining.getOrderValue();
		System.out.println("cost="  cost);
		//prints cost of corporate training
		ctraining.getOrderValue();
		System.out.println("cost="  ctraining.getCost());
	}

}