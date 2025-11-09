class Solution{
//EUCLEDIAN ALGORITHM
    public int countOperations(int num1, int num2) {
        if(num1==0 && num2==0){
            return 0;
        }
        int operations=0;
        while(num1>0 && num2>0){
            operations+=num1/num2;
            num1=num1%num2;
/* swap num1 and num2 manually ,In Java, all primitive types (like int, double, char, etc.) are passed by value, not by reference. Java copies the values of num1 and num2 into the parameters of swap().
Inside swap(), you’re only swapping those local copies, not the actual variables from the caller (countOperations).*/
            int temp=num1;
            num1=num2;
            num2=temp;

        }
         
        return operations;

        //BY RECURSION
      /*  if(num1==0 || num2==0){
            return 0;
        }
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        return (num1/num2) + countOperations(num1%num2 , num2);*/
    }
}    
    