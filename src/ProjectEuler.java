
public class ProjectEuler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Find the sum of all multiples of 3 and multiples of 5 less than 1000.
int i=0;
int j=0;
int add;
int iTotal=0;
int jTotal=0;
while ((3*i)<1000){
	add=3*i;
	if(add%5!=0){
		iTotal+=add;
}
	i++;
}
while ((5*j)<1000){
	jTotal+=(5*j);
	j++;
}

System.out.println(iTotal+jTotal);

//Find the sum of the even-valued terms of the Fibonacci sequence less than 4 million.
int x=1;
int y=1;
int fibTotal=0;
while (x<4000000 && y<4000000){
	x+=y;
	y+=x;
	if (x%2==0){
		fibTotal+=x;
	}
	if (y%2==0){
		fibTotal+=y;
	}
}
System.out.println(fibTotal);

//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
int a=0;
int b=0;
int aSum=0;
int aSquare=0;
int bSum=0;
while (a<101){
	aSquare=(a*a);
	aSum+=aSquare;
	a++;
}
while (b<101){
	bSum+=b;
	b++;
}
bSum=(bSum*bSum);
System.out.println(bSum-aSum);

//Find the largest prime factor of 600,851,475,143.
long num=46L;
long factor=0L;
long factor2=0L;
boolean prime=false;

if (num%2!=0){
	factor=(long) ((num/2)+.5);
}
else {
	factor=(long) (num/2);
}
while (prime==false){
	if (num%factor==0){
		factor2=factor-1;
		prime=true;
		while (factor2>1){
			if (factor%factor2==0){
				prime=false;
			}
			factor2--;
		}	
	}
	factor--;
}
factor+=1;
System.out.println(factor);

//Find the largest palindrome made from the product of two 3-digit numbers.
int num1=999;
int num2=999;
int product=0;
int highest=0;
int reverse=0;
int product1=0;

while (num1>100){
	product=num1*num2;
	product1=product;
	 while (product != 0) {
         int remainder = product % 10;
         reverse = reverse * 10 + remainder;
         product = product / 10;
     }
	 System.out.println(reverse);
	if (product1==reverse){
		if (product1>highest){
			highest=product1;
		}
		}
	
	while (num2>100){
		num2--;
	}
	num1--;
}
System.out.println(highest);
	}
}

