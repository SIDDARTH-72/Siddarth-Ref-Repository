// #include <stdio.h>

// int main()
// {
// }
//                 TYPES OF TRIANGLES:

// int main()
//  {
//      int a, b, c;
//      int type;
//      printf("Enter three sides of the triangle: \n");
//      scanf("%d%d%d", &a, &b, &c);

//      type = types_trinagle(a, b, c);

//      return 0;
//  }
//  int types_trinagle(int a, int b, int c)
//  {
//      if (a == b && b == c && c == a)
//      {
//          printf("Equilateral triangle \n");
//      }
//      else if (a == b || b == c || c == a)
//      {
//          printf("Isoceles triangle \n");
//      }
//      else
//      {
//          printf("Scalene triangle \n");
//      }

//      return 0;
//  }

//                 GREATEST NUMBER PROBLEM:

//  #include <stdio.h>
//  int nums(int a, int b, int c);

//  int main()
//  {
//      int a, b, c;
//      int type;
//      printf("Enter three numbers: \n");
//      scanf("%d%d%d", &a, &b, &c);
//      type = nums(a, b, c);
//      return 0;
//  }
//  int nums(int a, int b, int c)
//  {
//      if (a > b && a > c)
//      {
//          printf("%d is greater than %d and %d", a, b, c);
//      }
//      else if (b > a && b > c)
//      {
//          printf("%d is greater than %d and %d", b, a, c);
//      }
//      else if (c > a && c > b)
//      {
//          printf("%d is greater than %d and %d", c, b, a);
//      }
//      return 0;
//  }

//                 QUADRATIC EQUATIONS:

//  #include <stdio.h>
// int main()
// {
//     int a, b, c;
//     int d;

//     printf("Enter the co-efficients of the quadratic equtions: \n");
//     printf("a = ");
//     scanf("%d", &a);
//     printf("b = ");
//     scanf("%d", &b);
//     printf("c = ");
//     scanf("%d", &c);

//     d = (b * b - (4 * a * c));

//     if (d > 0)
//     {
//         printf("The roots are real and distict \n");
//     }
//     else if (d = 0)
//     {
//         printf("The roots are real ant eqaul");
//     }
//     else
//     {
//         printf("The roots are imaginary");
//     }

//     return 0;
// }
// #include <stdio.h>
// float circle(float r); // function declaration should be done after defining the function after main
// of the function other than main is typed before main function than no need to declare
// that function here.

// ----------------------------------------------------------------
/*   int a,b;
    printf("ENTER TWO NUMBERS: \n");
    scanf("%d%d",&a,&b);
    printf("a= %d\n",a);
    printf("b= %d\n",b);
    printf("sum = %d\n", a+b);
    printf("sub = %d\n", a-b);
    printf("multi = %d\n", a*b);
    printf("div = %f\n", (float)a/b);

    int a=5, b=5, c=10;

    printf("%d == %d is %d\n", a,b,a==b);
    printf("%d == %d is %d\n", a,c,a==c);
    printf("%d == %d is %d\n", c,b,c==b);
    printf("%d > %d is %d\n", a,c,a>c);
    printf("%d < %d is %d\n", b,c,b<c);

    int a,b,c;
    int result;
    scanf("%d%d%d \n", &a,&b,&c);
    printf("a = %d\n",a);
    printf("b = %d\n",b);
    printf("c = %d\n",c);
    result = (a==b)&& (c>b);
    printf("(a==b)&& (c>b) is %d \n", result);
    result = (a==b)&& (c<b);
    printf("(a==b)&& (c<b) is %d \n", result);
    result = (a!=b)&& (c<b);
    printf("(a!=b)&& (c<b) is %d \n", result);
    result = (a!=b)&& (c==b);
    printf("(a!=b)&& (c==b) is %d \n", result);
    result = (a>b)&& (c==b);
    printf("(a>b)&& (c==b) is %d \n", result);
    result = (a>b)&& (c!=b);
    printf("(a>b)&& (c!=b) is %d \n", result);
    */
//"return" keyword returns- variable/constant/expression and can take 1 value at once.

// -------------------------------

// int main()
// {
//     float r, aoc;
//     printf("Radius = \n");
//     scanf("%f", &r);
//     aoc = circle(r);
//     printf("Area of the circle = %f\n", aoc);
// }

// float circle(float r)
// {
//     float area;
//     area = 3.14 * r * r;
//     return area;
// }

// -----------------------------------------------
// if-else statement:-

// #include <stdio.h>
// int main()
// {
//     int x;
//     printf("Enter the number: \n");
//     scanf("%d", &x);
//     if (x % 2 == 0)
//     {
//         printf("The number is even\n");
//     }
//     else
//     {
//         printf("The number is odd\n");
//     }
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//     int age;
//     printf("Enter tour age here: \n");
//     scanf("%d", &age);
//     if (age >= 18)
//     {
//         printf("You are eligible to vote \n");
//     }
//     else
//     {
//         printf("You are not eligible to vote\n");
//     }
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//      int num;
//     printf("Enter the integer: \n");
//     scanf("%d", &num);
//     if (num >= 0)
//     {
//         printf("The number is positive \n");
//     }
//     else if (num = 0)
//     {
//         printf("The number is neither positive nor negative \n");
//     }
//     else
//     {
//         printf("The number is negative \n");
//     }
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//     int a, b;
//     printf("Enter two numbers: \n");
//     scanf("%d%d", &a, &b);
//     if (a > b)
//     {
//         printf("%d is greater than %d", a, b);
//     }
//     else if (a == b)
//     {
//         printf("%d is equal to %d", a, b);
//     }
//     else
//     {
//         printf("%d is less than %d", a, b);
//     }
//     return 0;
// }

// #include <stdio.h>
// int types_trinagle(int a, int b, int c);

// int main()
// {
//     int a, b, c;
//     int type;
//     printf("Enter three sides of the triangle: \n");
//     scanf("%d%d%d", &a, &b, &c);

//     type = types_trinagle(a, b, c);

//     return 0;
// }

//   TYPES OF TRIANGLE PROBLEM:

// int types_trinagle(int a, int b, int c)
// {
//     if (a == b && b == c && c == a)
//     {
//         printf("Equilateral triangle \n");
//     }
//     else if (a == b || b == c || c == a)
//     {
//         printf("Isoceles triangle \n");
//     }
//     else
//     {
//         printf("Scalene triangle \n");
//     }

//     return 0;
// }

//  GREATEST NUMBER PROBLEM:

// #include <stdio.h>
// int nums(int a, int b, int c);

// int main()
// {
//     int a, b, c;
//     int type;
//     printf("Enter three numbers: \n");
//     scanf("%d%d%d", &a, &b, &c);
//     type = nums(a, b, c);
//     return 0;
// }
// int nums(int a, int b, int c)
// {
//     if (a > b && a > c)
//     {
//         printf("%d is greater than %d and %d", a, b, c);
//     }
//     else if (b > a && b > c)
//     {
//         printf("%d is greater than %d and %d", b, a, c);
//     }
//     else if (c > a && c > b)
//     {
//         printf("%d is greater than %d and %d", c, b, a);
//     }
//     return 0;
// }