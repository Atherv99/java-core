1)
class A
{
}
class B extends A
{
}

2)
class A
{
}
class B
{
}
class C extends A, B
{
}

3) proper
interface A
{
}
class B implements A
{
}

4) proper
interface A
{
}
interface B
{
}
class C implements A,B
{
}

5) proper
interface A
{
}
interface B extends A
{
}

6) Proper
interface A
{
}
interface B
{
}
interface C extends A, B
{
}

7) not proper
class A
{
}
interface B implements A //might have class A can have concrete method which will inherit to interface
{
}

8) not proper
class A
{
}
interface B extends A
{
}