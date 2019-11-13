import java.util.*;

class TestArray
{
static boolean subset_arrays(int arr1[], int arr2[])
{
int i = 0;
int j = 0;
for (i = 0; i < arr2.length; i++)
{
	for (j = 0; j < arr1.length; j++)
		{
			if(arr2[i] == arr1[j])
				break;
		}
		if (j == arr1.length)
			return false;
	}
	return true;
}

public static void main (String[] args)
{
int arr1[] = new int[10];
int arr2[] = new int[10];
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of array 1 : ");
int m = sc.nextInt();
System.out.print("Enter the size of array 2 : ");
int n = sc.nextInt();
System.out.print("Input the array 1 elements : ");
for(int i=0;i<m;i++)
{
arr1[i] = sc.nextInt();
}
System.out.print("Input the array 2 elements : ");
for(int i=0;i<n;i++)
{
arr2[i] = sc.nextInt();
}

if(subset_arrays(arr1,arr2))
System.out.print("Array2 is a subset of array1");
else
System.out.print("Array2 is not a subset of array1");
}
}