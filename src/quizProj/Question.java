/**
 * 
 */
package quizProj;

/**
 * 
 */
public class Question {

	public Question(int id, String ques, String opt1, String opt2, String opt3, String opt4, String ans) {
		super();
		this.id = id;
		this.ques = ques;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
	}
	
	
		private int id;
		private String ques;
		private String opt1;
		private String opt2;
		private String opt3;
		private String opt4;
		private String ans;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQues() {
			return ques;
		}
		public void setQues(String ques) {
			this.ques = ques;
		}
		public String getOpt1() {
			return opt1;
		}
		public void setOpt1(String opt1) {
			this.opt1 = opt1;
		}
		public String getOpt2() {
			return opt2;
		}
		public void setOpt2(String opt2) {
			this.opt2 = opt2;
		}
		public String getOpt3() {
			return opt3;
		}
		public void setOpt3(String opt3) {
			this.opt3 = opt3;
		}
		public String getOpt4() {
			return opt4;
		}
		public void setOpt4(String opt4) {
			this.opt4 = opt4;
		}
		public String getAns() {
			return ans;
		}
		public void setAns(String ans) {
			this.ans = ans;
		}
		
		
		

	

}
