//LINEAR SEARCH
/*
Linear Search-Algorithm to find a target element in an array. It goes through each element, that is from i=0 to i=n-1(from start to end) and checks to see if the desired element is found i.e.
if a[i]==x. As soon as we encounter the first x, we can stop iterating. 
Time Complexity: O(n)
*/
public class Main
{
	public static void main(String[] args) {
		int a[]={1,3,5,7,9,11};  //Declaring an array "a" with predefined values and hence mentioning size is optional.
		int n=a.length;  //Assigning the size of the array to the variable "n" using the function a.length.
		System.out.println(6);
		int x=7;   //Target element we want to find
    boolean state=false;  //Making a variable state that would store the state of whether we have printed something on the screen or not. 
                          // False corresponds to we have printed something on the screen and true corresponds to we have not. 
		
		for(int i=0;i<a.length;i++){  //The range of the iteration of the loop is from i=0 to n-1 which are first and last indices of the array of size n.
		    if(a[i]==x){  //Checking if each of the element in the array is equal to x(target element) or not. 
		        System.out.println(i);  //Printing i, the first ocurrence of the target element found while iterating through the for loop.
            state=true;  //Once the target element is found, we make the boolean varible=true
		        break;  //breaking out of the loop as we encounter the appearance of x. 
		    }
		    
		}
    if(state==false){  //Making an if statement outside the for loop for a case such that x cannot be found when iterated through the loop.
		    System.out.println(-1);  //Prining -1 to let us know that x(the target element) was not when iterating through the for loop. 
		}
	}
}

