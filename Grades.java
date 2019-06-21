/**
	Mr. Miyagi's class has turned in their finals and the scores are
	2.9, 2.9, 3.8, 3.1, 3.4, 2.7, 2.1, 2.8, 3.2, 3.3, 3.8, 2.6
	Mr. Miyagi wants to know the highest and lowest scores and the
	average student score.
*/
public class Grades {
	public static void main(String[] args) {
		double[] grades =
		{2.9, 2.9, 3.8, 3.1, 3.4, 2.7, 2.1, 2.8, 3.2, 3.3, 3.8, 2.6};
		
		double max = grades[0]; 
		double min = grades[0]; 
		double ave = 0.0;
		
		for (double grade : grades) {
			if (grade > max)
				max = grade;
			if (grade < min)
				min = grade;
			ave += grade;
		}
		ave /= grades.length;
		
		System.out.printf("The minimum grade is %.1f\n", min);
		System.out.printf("The maximum grade is %.1f\n", max);
		System.out.printf("The average grade is %.1f\n", ave);
	}
}