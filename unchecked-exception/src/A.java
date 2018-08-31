class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10/0;
		System.out.println("main end");

	}
}

 /* while running therre is abnormal condition arrises,and no one there to 
 handel then it will not continue(executing) then method is not removing from stack (stack unvinding).
 At there extra force is require to remove from stack. 
 this arises the vending of statck.then this ducked java command will be 
 send to the java command the fter printing the exeption object and come back. */
