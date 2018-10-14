import java.util.Random;

public class TestcaseGenerator {
	public static String randomNameGen(){
		Random r = new Random();
		final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder builder = new StringBuilder();
		int count = r.nextInt(9)+1;
		while (count != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
			count--;
		}
		return "\""+ builder.toString() + "\"";
	}
	
	public static int randomButtonGen(){
		Random r = new Random();
		// return r.nextInt(9)+1;  for strictly valid inputs
		return r.nextInt(9)+1;
	}
	
	
	
	
	public static void main(String[] args) {
		Random r = new Random();
		int MAX_NUMBER= 100;
		int MAX_NUMBER_P= 0;
		int SIZE= 5 *MAX_NUMBER;
		String[] commands= new String[SIZE];
		String[] suffled_commands= new String[SIZE];

		String[] names = new String[2*MAX_NUMBER];
		String[] new_game_commands = new String[MAX_NUMBER];
		for(int i=0;i<MAX_NUMBER;i++){
			names[i]= randomNameGen();
			names[i+1]= randomNameGen();
			new_game_commands[i]="new_game("+names[i] +", "+names[i+1]+")";
			commands[i] = new_game_commands[i]; 
		}
		for(int i=0; i<MAX_NUMBER_P;i++){
			System.out.println(new_game_commands[i]);
		}
		
		
		String[] play_commands = new String[MAX_NUMBER];
		for(int i=0;i<MAX_NUMBER;i++){
			play_commands[i]="play("+names[r.nextInt(MAX_NUMBER)] +", "+randomButtonGen()+")";
			commands[i+MAX_NUMBER] = play_commands[i]; 
		}
		
		for(int i=0; i<MAX_NUMBER_P;i++){
			System.out.println(play_commands[i]);
		}
		
		
		
		String undo="undo";
		String redo="redo";
		String playAgain="play_again";

		for(int i=0;i<MAX_NUMBER;i++){
			commands[i+(MAX_NUMBER*2)]=undo;
		}

		for(int i=0;i<MAX_NUMBER;i++){
			commands[i+(MAX_NUMBER*3)]=redo;
		}
		
		for(int i=0;i<MAX_NUMBER;i++){
			commands[i+(MAX_NUMBER*4)]=playAgain;
		}
		
		
		
		
		for(int i=0; i<5 * MAX_NUMBER_P;i++){
			System.out.println(commands[i]);
		}
		
		for(int i=0;i<SIZE;i++){
			suffled_commands[i]= commands[r.nextInt(SIZE)];

		}
		
		for(int i=0;i<SIZE;i++){
			System.out.println(suffled_commands[i]);
			System.out.println(undo);
			System.out.println(redo);

		}

		

		
	}
}
