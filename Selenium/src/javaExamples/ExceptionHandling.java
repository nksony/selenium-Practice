package javaExamples;

public class ExceptionHandling {
	public static void main(String args[]) {
		try {
			System.out.println("Morning break fast");
			System.out.println("Lunch in Noon Hours");
			System.out.println("Exception occours due to health issue interupts the daily routine");
			int A = 100 / 0;
		} catch (Exception e) { 
			System.out.println(e.getMessage());
		} finally {
			try {
				System.out.println("Afternoon snaks");
				System.out.println("Dinner");
				int A = 100 / 0;
				System.out.println("this is mandatory codde");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				
			}

		}
	}
}
