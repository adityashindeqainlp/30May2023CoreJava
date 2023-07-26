package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 4:51:43 pm
 **/
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * **** **** **** ****
		 */

//		System.out.println("****");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");

		int n = 4;
		int m = 4;

//		  for (int i = 1; i <= n; i++) {
//		  
//		  for (int j = 1; j <= m; j++) {
//		  
//		  System.out.print("*"); } System.out.println("");
//		  
//		  }

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= m; j++) {
//
//				if (i == 1 || j == 1 || i == n || j == m) {
//
//					System.out.print("*");
//				} else {
//
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//           for(int i=n ; i>=1 ; i--) {
//        	   
//        	   for(int j=1; j<=i ; j++ ) {
//        		   
//        		   System.out.print("*");
//        	   }
//        	   System.out.println();
//           }

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int i = n-1; i >= 1; i--) {
//
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n - i; j++) {
//
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = n; i >= 1; i--) {
//
//			for (int j = 1; j <= n - i; j++) {
//				
//				System.out.print("");
//			}
//		for(int j=1 ; j<=i ; j++) {
//			
//			System.out.print("*");
//		}
//		
//		System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n - i; j++) {
//
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		
//		for(int i=n-1 ; i>=1 ;i--) {
//			
//			for(int j=1 ; j<=n-i ; j++) {
//				
//				System.out.print(" ");
//			}
//		
//		
//			for(int j=1 ; j<=i ; j++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for(int i=1; i<=n ; i++) {
//			
//			for(int j=1 ; j<=i ; j++) {
//				
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		for(int i=n ; i>=1 ; i--) {
//			
//			for(int j =1 ; j<=i ; j++) {
//				
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		for(int i=1; i<=n ; i++) {
//			
//			for(int j=1; j<=i ;j++) {
//				
//				System.out.print(j+" ");
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i=n-1; i>=1; i--) {
//			
//			for(int j=1; j<=i ;j++) {
//				
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n - i; j++) {
//				
//				System.out.print(" ");
//			}
//		
//		    for(int j =1; j<=i ; j++) {
//		    	
//		    	System.out.print(j);
//		    }
//		
//		    System.out.println();
//		}

//		for(int i=n; i>=1; i--) {
//			
//			for(int j=1 ; j<=n-i;j++) {
//				
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		for(int i=1; i<=n ; i++) {
//			
//			for(int j=1 ; j<=n-i ; j++) {
//				
//				System.out.print(" ");
//			}
//		     
//			for(int j=1; j<=i ; j++) {
//				
//				System.out.print(j);
//			}
//		
//			System.out.println();
//		}
//		
//		
//		for(int i=n-1 ; i>=1 ; i--) {
//			
//			for(int j= 1; j<=n-i ;j++) {
//				
//				System.out.print(" ");
//			}
//			
//			for(int j=1 ; j<=i ; j++) {
//				
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}

		int number = 1;

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print(number+" ");
//				number++;
//			}
//			System.out.println();
//		}
		

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i; j++) {
//
//				int sum = i + j;
//				if (sum % 2 == 0) {
//
//					System.out.print("1");
//				} else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=n; i++)	{
			
			for(int j=1; j<=(n-i);j++) {
				
				System.out.print(" ");
			}
			for(int j=1; j<=m; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
