public class Player {
	static String country="USA";
	String name;
	String sport;
	int keynum;
	String rank;
	boolean active;
	char gender;
	//add object property
	String skill;
	
	 
	public Player() {}
	
	// show skill
		public void showSkill()
		{
		   System.out.println("skill name :" + this.skill); 
		}
	
	// defining object methods
	public void display(Player p)
	{
	   System.out.println("player name :"+p.name);
	   System.out.println("player rank :"+p.rank);
	   System.out.println("Is the player active :"+p.active);
	   System.out.println();
	  // System.out.println("player country :"+ country); 
	   
	}

	
	
	 public static void country()
	 {
		 System.out.println("Displaying  all the players from :"+ country);
		 System.out.println();
		 
	 }
	
	
	public static void main(String[] args) {
		 
		Player p1 = new Player();
		Player p2 = new Player();
		//one more player object
		Player p3 = new Player();
		
		
		
		p1.name = "Jack";
		p1.sport ="Football";
		p1.keynum = 99;
		p1.rank = "Ex team leader";
		p1.active = false;
		p1.gender = 'M';
		
		p2.name = "Sophie";
		p2.sport ="Soccer";
		p2.keynum = 99;
		p2.rank = "Attacker";
		p2.active = true;
		p2.gender = 'F';
		
		country();
		//question 3
		p3.skill = "Skating";
       p3.showSkill();
       
    
		
	}
	}