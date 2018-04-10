
public class IfElse{
	
public static void main(String[] args){
	
	int number[]={50,65,56,71,81};
	int even=0,odd=0;
	for(int i=0;i<number.length;i++)
	{
		//try{
		if((number[i]%2)==0)
			
		{
			even+=1;
		}
		else
		{
			odd+=1;
		}//}
		//catch(Exception e)
		System.out.println(number[i]);
		}
	//System.out.println(number[i]); //this statement should be inside the for loop only or else it an error
	
	System.out.println("even numbers are "+even +" odd numbers are "+odd);
//}
//}
}
}
