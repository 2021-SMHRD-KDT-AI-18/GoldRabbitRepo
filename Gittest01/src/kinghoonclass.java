import java.util.Random;
import java.util.Scanner;

public class kinghoonclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran=new Random();
        
		int blobFishHP=30000;
		
		int cnt=0;
		while(blobFishHP>0){
			int axpower=ran.nextInt(50);
			System.out.println("으차"+axpower+"만큼 피해를 입혔다");
		 blobFishHP=blobFishHP-axpower;
		 
		 if(axpower>30) {
			 System.out.println("데미지"+axpower+"치명적인 피해를 입혔다!!");
		 }
		  cnt++;
		}System.out.println(cnt+"번만에 블롭피쉬를 쓰러트렸다");
		}
	}


		
		
	


