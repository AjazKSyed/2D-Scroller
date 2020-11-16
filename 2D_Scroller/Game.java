import java.awt.Image;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Game
{
	
  private Grid grid; 
  private int userRow; 
  private int msElapsed;// # of milliseconds passed
  private int charges;
  private int timesGet;// total # of times user hits good 
  private int timesAvoid;// total # of time user hits bad 
  private int lives;
  private int userCol;
  private int userCol1;
  private int userCol2;
  private int userCol3;

  private int speed;
  private String [] Img = {"FBLack.png","FFrost.png","FFrieza.png","FGoldfrieza.png","FJiren.png","FJiren.png","FRose.png","Zamasu.png","FFrost.png","Hitchill.png","Zamasu.png"}; //11
  private String [] balls = {"1Star.png","2Star.png","3Star.png","4Star.png","5Star.png","6Star.png","7Star.png"};//7
  private int Supercharge;
  private String [] strength = {"FCharge.png","FSuperCharge.png","FCharge.png","FCharge.png","Sensubean.png"};
  public Game()
  {
	speed=100;
	lives = 5;
	userCol1=2;
	userCol2 =3;
	userCol3 =4;
    grid = new Grid(10, 15); 
    charges = 0;
    userRow = 0;
    msElapsed = 300;
    Supercharge = 0;
    timesGet = 0;
    userCol=0;
    timesAvoid = 0;
    updateTitle();
    grid.setImage(new Location(userRow, 0), "NormGoku.jpg");
    
  }

  

 
 
  public void FinalBlast()
  {

	    Location next1 = new Location(userRow,1);
		Location next2 = new Location(userRow,2);
		Location next3 = new Location(userRow,3);
		Location next4 = new Location(userRow,4);
		Location next5 = new Location(userRow,5);
		Location next6 = new Location(userRow,6);
		Location next7 = new Location(userRow,7);
		Location next8 = new Location(userRow,8);
		Location next9 = new Location(userRow,9);
		Location next10 = new Location(userRow,10);
		Location next11 = new Location(userRow,11);
		Location next12 = new Location(userRow,12);
		Location next13 = new Location(userRow,13);
		Location next14 = new Location(userRow,14);

		

		Location base1 = new Location(userRow,0);
		
			grid.setImage(base1, "FVegetto.png");
			
		//grid.setImage(next1, "won.png");
		grid.setImage(next2, "too.png");
		grid.setImage(next3, "too.png");
		grid.setImage(next4, "too.png");
		grid.setImage(next5, "too.png");
		grid.setImage(next6, "too.png");
		grid.setImage(next7, "too.png");
		grid.setImage(next8, "too.png");
		grid.setImage(next9, "too.png");
		grid.setImage(next10, "too.png");
		grid.setImage(next11, "too.png");
		grid.setImage(next12, "too.png");
		grid.setImage(next13, "too.png");
		grid.setImage(next14, "tewee.png");

		

		
  }
 
		
	
	
		


		

		
  


 //key==space
  //make it like blast
//ask mr.matuni
  public void SpiritBomb()
  {

	  
		Location loc = new Location(userRow+1, userCol);
		Location loc1 = new Location(userRow+1, userCol1);
		Location loc2 = new Location(userRow+1, userCol2);
		Location loc3 = new Location(userRow+1, userCol3);
		
		Location loc4 = new Location(userRow, userCol);
		Location loc5 = new Location(userRow, userCol1);
		Location loc6 = new Location(userRow, userCol2);
		Location loc7 = new Location(userRow, userCol3);
		
		Location loc8 = new Location(userRow-1, userCol);
		Location loc9 = new Location(userRow-1, userCol1);
		Location loc10 = new Location(userRow-1, userCol2);
		Location loc11 = new Location(userRow-1, userCol3);
		
		Location loc12 = new Location(userRow-2, userCol);
		Location loc13= new Location(userRow-2, userCol1);
		Location loc14 = new Location(userRow-2, userCol2);
		Location loc15 = new Location(userRow-2, userCol3);

	  



		
		Location base1 = new Location(userRow,0);
		
			grid.setImage(base1, "FSpiritHold.png");
			
		for(int a = 0; a<9; a++) {
		if(userCol>0 && userCol3 !=15 && userCol2!=15 && userCol1!=15 && userCol!=15 && userRow>0)
		{
	
			  Location next101 = new Location(userRow+1,userCol);
			    Location next102 = new Location(userRow+1,userCol1);
			    Location next103 = new Location(userRow+1,userCol2);
			    Location next104 = new Location(userRow+1,userCol3);

				Location next201 = new Location(userRow,userCol);
				Location next202 = new Location(userRow,userCol1);
				Location next203 = new Location(userRow,userCol2);
				Location next204 = new Location(userRow,userCol3);
				
				Location next301 = new Location(userRow-1,userCol);
				Location next302 = new Location(userRow-1,userCol1);
				Location next303 = new Location(userRow-1,userCol2);
				Location next304 = new Location(userRow-1,userCol3);
				
			    Location next401 = new Location(userRow-2,userCol);
			    Location next402 = new Location(userRow-2,userCol1);
			    Location next403 = new Location(userRow-2,userCol2);
			    Location next404 = new Location(userRow-2,userCol3);
			    userCol+=1;
			    userCol1+=1;
				userCol2+=1;
				userCol3+=1;
			    grid.setImage(next101, "SB401.png");
			    grid.setImage(loc1, null);

			    
				grid.setImage(next102, "SB402.png");
			    grid.setImage(loc2, null);

			    
				grid.setImage(next103, "SB403.png");
			    grid.setImage(loc2, null);

			    
				grid.setImage(next104, "SB404.png");
			    grid.setImage(loc3, null);

				
				grid.setImage(next201, "SB301.png");
			    grid.setImage(loc4, null);

			    
				grid.setImage(next202, "SB302.png");
			    grid.setImage(loc5, null);

			    
				grid.setImage(next203, "SB303.png");
			    grid.setImage(loc6,  null);

			    
				grid.setImage(next204, "SB304.png");
			    grid.setImage(loc7, null);

				
				grid.setImage(next301, "SB201.png");
			    grid.setImage(loc8, null);

			    
				grid.setImage(next302, "SB202.png");
			    grid.setImage(loc9, null);

			    
				grid.setImage(next303, "SB203.png");
			    grid.setImage(loc10, null);

			    
				grid.setImage(next304, "SB204.png");
			    grid.setImage(loc11, null);

				
				grid.setImage(next401, "SB101.png");
			    grid.setImage(loc12, null);

			    
				grid.setImage(next402, "SB102.png");
			    grid.setImage(loc13, null);

			    
				grid.setImage(next403, "SB103.png");
			    grid.setImage(loc14, null);

			    
				grid.setImage(next404, "SB104.png");
			    grid.setImage(loc15, null);

				
				
			
			    

		}
		
		
		
  }
  }
  //g}

  //d
  
  
  public void dragonfist()
  {
	    Location next1 = new Location(userRow,1);
		Location next2 = new Location(userRow,2);
		Location next3 = new Location(userRow,3);
		Location next4 = new Location(userRow,4);
		Location next5 = new Location(userRow,5);
		Location next6 = new Location(userRow,6);
		Location next7 = new Location(userRow,7);
		Location next8 = new Location(userRow,8);
		Location base1 = new Location(userRow,0);
		
			grid.setImage(base1, "FDragss3.png");
			
		grid.setImage(next1, "Drag1.jpg");
		grid.setImage(next2, "Drag2.jpg");
		grid.setImage(next3, "Drag3.jpg");
		grid.setImage(next4, "Drag3.jpg");
		grid.setImage(next5, "Drag3.jpg");
		grid.setImage(next6, "Drag3.jpg");
		grid.setImage(next7, "Drag3.jpg");
		grid.setImage(next8, "Drag4.jpg");
		

		
  }
  // key == f
  public void Kwave ()
  {
		Location next1 = new Location(userRow,1);
		Location next2 = new Location(userRow,2);
		Location next3 = new Location(userRow,3);
		Location next4 = new Location(userRow,4);
		Location next5 = new Location(userRow,5);
		Location next6 = new Location(userRow,6);
		Location next7 = new Location(userRow,7);
		Location next8 = new Location(userRow,8);
		Location next9 = new Location(userRow,9);
		Location next10 = new Location(userRow,10);
		Location next11 = new Location(userRow,11);
		Location next12 = new Location(userRow,12);
		
		Location base1 = new Location(userRow,0);
		

			
			if(timesGet<30)
				grid.setImage(base1, "NormKame1.png");
			else if(timesGet<50)
				grid.setImage(base1, "RedKame1.png");
			else 
				grid.setImage(base1, "FKame1.png");
			
			
		grid.setImage(next1, "FKame2.png");
			grid.setImage(next2, "FKame2.png");
			grid.setImage(next3, "FKame2.png");
			grid.setImage(next4, "FKame2.png");
			grid.setImage(next5, "FKame2.png");
			grid.setImage(next6, "FKame2.png");
			grid.setImage(next7, "FKame2.png");
			grid.setImage(next8, "FKame2.png");
			grid.setImage(next9, "FKame2.png");
			grid.setImage(next10, "FKame2.png");

			grid.setImage(next11, "FKame2.png");
			grid.setImage(next12, "FKame3.png");
			
			
	
  }
  
  public void handleKeyPress()
  {
	  int key = grid.checkLastKeyPressed();
		
		Location loc = new Location(userRow, 0);

		if (key == 38) 
		{ 
			if(userRow >0)
			{
			userRow-=1;
			
			
			Location next = new Location(userRow, 0);
			handleCollision(loc);
			grid.setImage(next, "NormGoku.jpg");
			grid.setImage(loc, null);
			if(timesGet > 10 && timesGet <20)
			{
				grid.setImage(next, "Fkiogoku.jpg");
			}
			if(timesGet >19 && timesGet< 30)
			{
				
				grid.setImage(next,  "FSS1G.png");
			}
			if(timesGet > 29 && timesGet< 40)
			{
				
				grid.setImage(next,  "FSS2.png");
			}
			if(timesGet > 39 && timesGet<50)
			{
				
				grid.setImage(next,  "FSS3.png");
			}
			if(timesGet >= 49 && timesGet<60)
			{
				
				grid.setImage(next,  "FRedgoku.gif");
			}
			if(timesGet > 59 && timesGet<70)
			{
				
				grid.setImage(next,  "FBlue.gif");
			}
			if(timesGet >69 && timesGet<80)
			{
				
				grid.setImage(next,  "Fkioken.png");
			}
			if(timesGet >79 && timesGet<90)
			{
				
				grid.setImage(next,  "Fkiokenx5.png");
			}
			if(timesGet >89 && timesGet<100)
			{
				
				grid.setImage(next,  "Fkiokenx10.png");
			}
			if(timesGet >99 )
			{
				grid.setImage(next,  "FLimit.png");
			}
			if(Supercharge>=5 && lives >2)
			  {
				  grid.setImage(next,"Ffusion.gif");
				  Supercharge = 15;
				  Supercharge --;
				  
				  
				  
			  }
		
			}
		}
		
			
		 
		 if (key == 40) { 
			if(userRow < 9) {
			userRow+=1;
			
			Location next2 = new Location(userRow, 0);
			handleCollision(loc);

			grid.setImage(next2, "NormGoku.jpg");
			grid.setImage(loc, null);
			if(timesGet > 10 && timesGet <20)
			{
				grid.setImage(next2, "Fkiogoku.jpg");
			}
			if(timesGet >19 && timesGet< 30)
			{
				
				grid.setImage(next2,  "FSS1G.png");
			}
			if(timesGet > 29 && timesGet< 40)
			{
				
				grid.setImage(next2,  "FSS2.png");
			}
			if(timesGet > 39 && timesGet<50)
			{
				
				grid.setImage(next2,  "FSS3.png");
			}
			if(timesGet >= 49 && timesGet<60)
			{
				
				grid.setImage(next2,  "FRedgoku.gif");
			}
			if(timesGet > 59 && timesGet<70)
			{
				
				grid.setImage(next2,  "FBlue.gif");
			}
			if(timesGet >69 && timesGet<80)
			{
				
				grid.setImage(next2,  "Fkioken.png");
			}
			if(timesGet >79 && timesGet<90)
			{
				
				grid.setImage(next2,  "FKiokenx5.png");
			}
			if(timesGet >89 && timesGet<100)
			{
				
				grid.setImage(next2,  "Fkiokenx10.png");
			}
			if(timesGet >99)
			{
				
				grid.setImage(next2,  "FLimit.png");
			}
			if(Supercharge>=5 && lives>2)
			  {
				  grid.setImage(next2,"Ffusion.gif");
				  
				  Supercharge = 15;
				  Supercharge--;;
				  
				  
				  
			  }
			}
		
			
			
		 }
		  
		  

		  if(key==70) //f
			{
			  if(charges >= 18  && charges%2==0)
			  {
				Kwave();
				charges = charges -20;
			  }
			}
		 
		  if(key==68) //d
		  {
			  if(charges >= 14 && charges %2 == 0)
			  {
				  dragonfist();
				  charges = charges -14;
			  }
		  }
		  if(key==71)//g
		  {
			  Location next3 = new Location(userRow, 0);
			  if(grid.getImage(next3) == "Ffusion.gif" && charges > 5)
				  FinalBlast();
			  
		  }
		  if(key==32)// space
		  {
			  if(charges >= 24 && charges %2 == 0 && userRow!=0 && userRow !=13& userRow!=14)
			  {
				  SpiritBomb();
				  charges = charges + charges;
			  }
		  }
	
		   
			
}
	  
  
  
  public void populateRightEdge()
  {
	  Location spot = new Location(((int)(Math.random()*10)),14);
	  Location spot3 = new Location(((int)(Math.random()*10)),14);


	  Location multi = new Location (((int)(Math.random()*10)),14);
	  Location beans = new Location (((int)(Math.random()*10)),14);

	  int rand = (int)(Math.random()*8);
	  for(int i=0; i<10; i++)
	  {
		  if(rand % 2 !=0 && rand !=1 && rand!=7 || rand==6) 
		  {
			  for(int a =0 ; a<11; a++)
			  {
				  int p = (int)(Math.random()*11);
				  grid.setImage(spot, Img[p]);
			  }
			 
				  
			
		  }
		  else if(rand == 2 || rand == 4)
		  {
			  for(int m = 0;m<7;m++)
			  {
				  int r = (int)(Math.random()*7);
				  grid.setImage(beans, balls[r]);
			  }
		  }
		  
		  else if(rand == 8 )
		  {
			  
				  grid.setImage(multi, "Sensubean.png");
			  
		  }
		  else if (rand ==7)
		  {
			  for(int b =0; b<4; b++)
			  {
				  int ch = (int)(Math.random()*5);
				  grid.setImage(spot3, strength[ch]);
			  }
		  }
		  else if(rand ==1)
		  {
			  grid.setImage(spot, null);
	
		  }
		
	  }
	  
	
  }
  
  public void scrollLeft()
  {
		Location user = new Location(userRow, 0);
		
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 15; j++) 
			{
				Location curr = new Location(i, j);
			
		
				if (!(curr.equals(user))) 
				{
					int place = j-1;
					
					Location rep = new Location(i, place);
					if (place < 0)
					{
						grid.setImage(curr, null);
						} 
					else if (!(curr.equals(new Location(userRow, 1)))) 
					{
						grid.setImage(rep, grid.getImage(curr));
					}
					if (j == 15- 1) 
					{
						grid.setImage(curr, null);
					}
				}
				if (curr.equals(new Location(userRow, 1)))
				{
					handleCollision(curr);
				
				}
				
			}
			}
		}
	 
  
  public void handleCollision(Location loc)
  {
	  
	  if (grid.getImage(loc) == null) 
	  {
		  timesGet+=0;
		  timesAvoid+=0;
		} 
	  else 
	  {
		if (grid.getImage(loc) == "1Star.png")
		{
				timesGet += 1;
			} 
		else if (grid.getImage(loc) == "2Star.png")
			timesGet+=2;
		else if (grid.getImage(loc) == "3Star.png")
			timesGet+=3;
		else if (grid.getImage(loc) == "4Star.png")
			timesGet+=4;
		else if (grid.getImage(loc) == "5Star.png")
			timesGet+=4;
		else if (grid.getImage(loc) == "6Star.png")
			timesGet+=2;
		else if (grid.getImage(loc) == "7Star.png")
			timesGet+=5;
		else if(grid.getImage(loc)=="Sensubean.png")
		{
			lives+=1;
		}
		else if(grid.getImage(loc)=="FSuperCharge.png")
		{
			Supercharge+=1;
		}
		else if(grid.getImage(loc)=="FCharge.png")
		{
			charges+=2;
		}
		for(int i = 0; i<Img.length;i++)
		{
		 if (grid.getImage(loc) == Img[i]) 
		{
				timesAvoid +=1;
				lives-=1;
				
			}
		 if(grid.getImage(loc)=="FJiren.png" && grid.getImage(loc)!= "Ffusion.gif")
		 {
			 lives =0;
		 }
		}
		grid.setImage(loc, null);
		
	  
	  }
  }
  
  
  
  
  public int getScore()
  {
    return (timesGet);
  }
  
  
  public void updateTitle()
  {
	if(isGameOver() == false)
	
		grid.setTitle("Dragon Ball Super Fun Rush" +"                                                             Score:  " + getScore() + "            Lives: " + lives+"                 Energy: " + charges + "                    Super Charge: " +Supercharge);	 
	}
  
  public boolean isGameOver()
  {
	  boolean game = false;
	  if(lives <=0 ) 
		  game = true;
    return game;
  }
  
  public void play()
  {
	  System.out.println("Controls: ");
      System.out.println("Up: Up Arrow Key");
      System.out.println("Down: Down Arrow Key");
      System.out.println("Specials: Once your get enough charges (14,18,24), then you can access a special power.");
      System.out.println("Power-Ups: Once your score reaches a multiple of 10, Goku Powers Up");
      System.out.println("Fusion: Once you collect 5 Super charges, you will fuse into Vegetto");
      
      System.out.println("Special 1: Kamehameha Wave (Key f) Charge = 18");
      System.out.println("Special 2: Dragon Fist (Key d) Charge = 14");
     // System.out.println("Special 3: Spirit Bomb (Key Space) Charge = 24");
      System.out.println("Special 4: Final Kamehameha (Key g) Charge = 20");

    while (!isGameOver())
    {

       
      grid.pause(100);
      handleKeyPress();
      if (msElapsed % 150 == 0)
      {
        scrollLeft();
        populateRightEdge();
       


      
       
      }
      updateTitle();
     
    }
    
    
  }
  public static void test()
  {
    Game game = new Game();
    game.play();
    Game g = new Game();
    g.populateRightEdge();
    
    
  }
  
  public static void main(String[] args)
  {
    Game.test();
  }
}