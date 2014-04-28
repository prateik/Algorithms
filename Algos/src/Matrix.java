
public class Matrix {

	
	public void check_pattern(int matrix [][],int index){
		int row_index;
		int column_index;
		
		
		for(int i=0;i < index;i++){
			
			if(check_array(matrix[i]){
				
				
			}
		}
		
		
		
	}
	
	public boolean check_array(int matrix []){
		
		int number = 0;
		
		for(int i=0;i< matrix.length ;i++){
	
			if(matrix[i] == 1){
				number++;
			}
		
			
			if(number > 1){
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String args[]){}
	
	int [][] test_matrix = new int[10][10];
	
	
	
}
