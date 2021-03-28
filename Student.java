class Student
{
// the private data members
private double IDnum;
private double hrs;
private double points;
private static int lastStudentID;
 
 
public void showIDnum()
{
System.out.println("ID Num is: " + IDnum);
}
 
public void showHours()
{
System.out.println("Credit Hours: " + hrs);
}
 
public void showPoints()
{
System.out.println("Points Earned: " + points);
}
 
public double getGradePoint()
{
return (double) (points / hrs);
}
 
}
