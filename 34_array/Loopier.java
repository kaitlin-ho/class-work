public class Loopier {


static int[] test = new int [10];
static int[] test2 = new int [1,2,3,30];
	//A static method to populate an existing array with randomly generated ints
	public static int[] popInt(int[] A) {
		for(int i = 0; i < A.length; i++){
			A[i] = (int)(Math.random()*100);
		}
		return A;
	}		
	//A static method to return a String version of an array of ints
	public static String sVer(int[] A) {
		String result = "";
		for(int i = 0; i < A.length; i++){
			result = result + A[i];
		}
		return result;
	}
	public static void main(String[] args){
		System.out.println(popInt(test));
		System.out.println(sVer(test2));
	}

}
