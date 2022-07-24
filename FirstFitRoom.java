package java_examples;

public class FirstFitRoom {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=a.length;
	     System.out.println(solves(a,n));

	}
	public static int solves(int[] rooms, int target) {
        int num=0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] >= target){
                num=rooms[i];
                break;
            }else
                num=-1;
        }
        return num;
    }
}
