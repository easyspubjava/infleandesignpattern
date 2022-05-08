package state.before;

public class Player {

	public static final int BEGINNER_LEVEL = 1;
	public static final int ADVANCED_LEVEL = 2;
	public static final int SUPER_LEVEL = 3;

	int level;
	
	public Player() {
		level = BEGINNER_LEVEL;
	}
	
	public void jump() {
		
		if(level == BEGINNER_LEVEL) {
			System.out.println("Jump �� �� ������.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("���� jump �մϴ�.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("���� ���� jump �մϴ�.");
		}
	}
	
	public void run() {
		if(level == BEGINNER_LEVEL) {
			System.out.println("õõ�� �޸��ϴ�.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("���� �޸��ϴ�.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("��û ���� �޸��ϴ�.");
		}
		
	}
	
	public void turn() {
		if(level == BEGINNER_LEVEL) {
			System.out.println("Turn �� �� ������.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("Turn �� �� ������.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("�� ���� ���ϴ�.");	
		}
		
	}
	
	public void play(int time) {
				
		run();
		for(int i =0; i<time; i++) {
			jump();	
		}
		turn();
	}

	public void upgradeLevel(int level) {
		this.level = level;
	}
}
