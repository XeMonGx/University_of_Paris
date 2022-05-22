public class Calendar {
    /* EXERCICE 3 */
	// EXERCICE 3 QUESTION 1 
	public static int diffCounter (int start, int end) {
		// Modifier le code ci-dessous
		return end - start;
	}

	// EXERCICE 3 QUESTION 2
	public static int weekdayOfCounter(int date) {
		// Modifier le code ci-dessous
		return date % 7;
	}
    
	/* EXERCICE 4 */
	// EXERCICE 4 QUESTION 1
	public static boolean isLeapYearJulian(int year) {
		// Modifier le code ci-dessous
		if(year >= 0 && year % 4 == 0){
			return true;
		}
		return false;
	}

	// EXERCICE 4 QUESTION 2
	public static int daysInYearJulian(int year) {
		// Modifier le code ci-dessous
		if(isLeapYearJulian(year)){
			return 366;
		}
		return 365;
	}

	/* EXERCICE 5 */
	public static int daysInMonth(int month, boolean inLeapYear) {
		// Modifier le code ci-dessous
		if(inLeapYear){
			if(month == 2){
				return 29;
			}
		}else{
			if(month == 2){
				return 28;
			}
		}
		if(month <= 7){
			if(month % 2 == 0){
				return 30;
			}
			return 31;
		}
		if(month % 2 == 0){
			return 31;
		}
		return 30;
	}

	/*EXERCICE 6*/
	// Declarez la fonction julianToCounter prenant en paramètre l'année, le mois, et le jour et renvoyant la date correspondante au format "compteur"

	public static int julianToCounter(int year, int month, int days){
		int count = 0;
		for (int i=1;i<year;i++){
			count += daysInYearJulian(i);
		}
		for (int i=1;i<month;i++){
			count += daysInMonth(i,isLeapYearJulian(year));
		}
		return count+days-2;
	}

	/*EXERCICE 7*/
	// A completer

	public static boolean isLeapYearGregorian(int year){
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

	public static int daysInYearGregorian(int year){
		if(isLeapYearGregorian(year)){
			return 366;
		}
		return 365;
	}

	/*EXERCICE 9*/
	//A completer

	public static int gregorianToCounter(int year, int month, int days){
		int count = 0;
		for (int i=1;i<year;i++){
			count += daysInYearGregorian(i);
		}
		for (int i=1;i<month;i++){
			count += daysInMonth(i,isLeapYearGregorian(year));
		}
		return count+days;
	}

	/*EXERCICE 10*/
	//A completer

    public static int weekdayOfGregorian(int year, int month, int days){
		return gregorianToCounter(year,month,days)%7;
	}

	public static int dayOfSummertime(int year){
		for(int i=31;i>=1;i--){
			if(gregorianToCounter(year,3,i)%7 == 0){
				return i;
			}
		}
		return 0;
	}

	public static void main (String[] args) {

		// ENLEVEZ LES COMMENTAIRES AU FUR ET A MESURE POUR TESTER VOS FONCTIONS
		System.out.println("====Ex3Q1====");
		testInt("diffCounter(582,584)", diffCounter(582,584), 2);

		System.out.println("====Ex3Q2====");
		testInt("weekdayOfCounter(1)", weekdayOfCounter(1), 1);
		testInt("weekdayOfCounter(7)", weekdayOfCounter(7), 0);
		testInt("weekdayOfCounter(11)", weekdayOfCounter(11), 4);

		System.out.println("====Ex4Q1====");
		testBoolean("isLeapYearJulian(1900)", isLeapYearJulian(1900), true);
		testBoolean("isLeapYearJulian(1901)", isLeapYearJulian(1901), false);
		testBoolean("isLeapYearJulian(2000)", isLeapYearJulian(2000), true);

		System.out.println("====Ex4Q2====");
		testInt("daysInYearJulian(1900)", daysInYearJulian(1900), 366);
		testInt("daysInYearJulian(2000)", daysInYearJulian(2000), 366);

		System.out.println("====Ex5====");
		testInt("daysInMonth(1,false)", daysInMonth(1,false), 31);
		testInt("daysInMonth(2,false)", daysInMonth(2,false), 28);
		testInt("daysInMonth(2,true)", daysInMonth(2,true), 29);
		testInt("daysInMonth(11,true)", daysInMonth(11,true), 30);
		
		System.out.println("====Ex6====");
		testInt("julianToCounter(1,1,1)", julianToCounter(1,1,1), -1);
		testInt("julianToCounter(2,2,2)", julianToCounter(2,2,2), 396);
		testInt("julianToCounter(101,1,1)", julianToCounter(101,1,1), 36524);
		testInt("julianToCounter(2016,9,14)", julianToCounter(2016,9,14), 736234);
		
		System.out.println("====Ex7Q1====");
		testBoolean("isLeapYearGregorian(1900)", isLeapYearGregorian(1900), false);
		testBoolean("isLeapYearGregorian(1901)", isLeapYearGregorian(1901), false);
		testBoolean(      "isLeapYearGregorian(2000)", isLeapYearGregorian(2000), true);

		System.out.println("====Ex7Q2====");
		testInt("daysInYearGregorian(1900)", daysInYearGregorian(1900), 365);
		testInt("daysInYearGregorian(2000)", daysInYearGregorian(2000), 366);

		System.out.println("====Ex9====");
		testInt("gregorianToCounter(1,1,1)", gregorianToCounter(1,1,1), 1);
		testInt("gregorianToCounter(2,2,2)", gregorianToCounter(2,2,2), 398);
		testInt("gregorianToCounter(101,1,1)", gregorianToCounter(101,1,1), 36525);
		testInt("gregorianToCounter(2016,9,14)", gregorianToCounter(2016,9,14), 736221);

		System.out.println("====Ex10Q1====");
		testInt("weekdayOfGregorian(2016,9,14)", weekdayOfGregorian(2016,9,14), 3);
		System.out.println("====Ex9Q2====");
		// Ecrire le test
		if(gregorianToCounter(1582,10,15) == julianToCounter(1582,10,4)+1){
			System.out.println(true);
		}else{
			System.out.println(false);
		}

		System.out.println("====Ex10Q3====");
		testInt("dayOfSummertime(2017)", dayOfSummertime(2017), 26);
	}


	/*************************************************************/
	/*                        NE PAS MODIFIER                    */
	/*************************************************************/

	public static void testInt(String cmd, int exp, int val) {
		System.out.println(cmd + " == " + exp);
		if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
		}
	}

	public static void testBoolean(String cmd, boolean exp, boolean val) {
		System.out.println(cmd + " == " + exp);
		if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
		}
	}

}
