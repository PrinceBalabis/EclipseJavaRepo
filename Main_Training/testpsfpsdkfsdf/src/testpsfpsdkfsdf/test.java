package testpsfpsdkfsdf;

public class test {

	public static void main(String[] args){

		int lsb = 0;
		int mid = 0;
		int msb = 0;
		int state = 0;



		for(state=0;state<8;state++){

			switch(state){
			case 0: 
				lsb = 0;
				mid = 0;
				msb = 0;
				break;
			case 1: 
				lsb = 1;
				mid = 0;
				msb = 0;
				break;
			case 2: 
				lsb = 0;
				mid = 1;
				msb = 0;
				break;
			case 3: 
				lsb = 1;
				mid = 1;
				msb = 0;
				break;
			case 4: 
				lsb = 0;
				mid = 0;
				msb = 1;
				break;
			case 5: 
				lsb = 1;
				mid = 0;
				msb = 1;
				break;
			case 6: 
				lsb = 0;
				mid = 1;
				msb = 1;
				break;
			case 7: 
				lsb = 1;
				mid = 1;
				msb = 1;
				break;
			}
			System.out.println(msb+"-"+mid+"-"+lsb);

		}


	}
}