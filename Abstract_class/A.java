abstract class A 
{
	void test1()
	{
	}
	
	abstract void test2();  //its declared only.
}

/*
Because of opening brackets, it is consider as a implement method, concrete method.

test2: declared method or undefined method, unimplemented method or abstract method.

if method doesn't have the body then it should end with semicolon,
and it should declared as a abstract method.

method should have the body or abstract keyword, both should not be same method.

abstract means no defined, no body , no concreteness. 
method should have a either body or abstract keyword.

In any of the class if at least one abstract method is there than should be declared as
a abstract class.

because of test2 class A declared as a abstract.

test2 is not developed.

for abstract class we can not create an object because its not fully implemented.
rest all thing we can do with abstract.

we can create a reference variable.

abstract class can be used for derived data type purpose.

compiler generates class file for abstract class also.

variable data type is required.
*/