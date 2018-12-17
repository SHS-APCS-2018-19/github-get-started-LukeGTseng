class tuna {
	public static void main(String[] args) {
		apples person1 = new apples("Luke", "100 140th Ave SE", "Bellevue, WA", 6, 25, 2003);
		apples person2 = new apples("Sammamish High School", "100 140th Ave SE", "Bellevue, WA", 11, 5, 1974);
		System.out.println("There are " + apples.getAddresses() + " addresses");
		/*System.out.println("The person's name is " + person1.getName());
		System.out.println(person1.getName() + "'s address is " + person1.getAddress());
		System.out.println(person1.getName() + "'s birthday is " + person1.getBirthday());*/
	}
}
