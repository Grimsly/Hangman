
public class ValidList {
	private boolean listChecked;
	public boolean listCheck(String [] guesses, int size) {
		listChecked = true;
		for (int index = 0; index<size; index++){
			if (guesses[index] != "*"){
				listChecked = false;
			}
		}
		
		return listChecked;
	}
}
