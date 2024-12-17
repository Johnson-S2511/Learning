package quizProj;

import java.util.Scanner;

public class QuestionService {
	String[] s=new String[5]; // store userAnswer
	Question[] questions =new Question[5]; 
	// This is only for declare the array not create any object if we run without obj give as NUllpointer exception
	public QuestionService() {
	questions[0]=new Question(1,"What's your Name ","John","Son","Jack","Johnson","Johnson");
	questions[1]=new Question(2,"What's your Name ","Amir","Velu","Abarna","Amirtha","Amirtha");
	questions[2]=new Question(3,"What's your Name ","Dhivin","Pandian","Dhivin p","Dhivin Pandian","Dhivin p");
	questions[3]=new Question(4,"What's your Name ","Vicky","Sappy","Dommer","Vignesh","Vignesh");
	questions[4]=new Question(5,"What's your Name ","Kevin","Kavin","Keevin","kalvin","Kevin");
	}
	public void display() {
		int i=0;
		for(Question q:questions) {
			System.out.println("No: "+q.getId());
			System.out.println("Question: "+q.getQues());
			System.out.println("Opt1: "+q.getOpt1());
			System.out.println("Opt2: "+q.getOpt2());
			System.out.println("Opt3: "+q.getOpt3());
			System.out.println("Opt4: "+q.getOpt4());
			//System.out.println("Ans: "+q.getAns());
			Scanner sc=new Scanner(System.in);
			s[i]=sc.nextLine();
			i++;
			
		}
	}
	public void yourScore() {int score=0;
		for(int i=0;i<questions.length;i++) {
			
			
			String orgAns= questions[i].getAns();
			String userAns=s[i];
			if(orgAns.equals(userAns)) {
				score++;
			}
		}
		System.out.println(score);
	}

}
