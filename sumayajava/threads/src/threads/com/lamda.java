package threads.com;
interface Admin{
	void login(int password,String name);
}
public class lamda {

public static void main(String[] args) {
	Admin a=(password,name)->
	{
		System.out.println("admin login is done by "+name);
	};
	a.login(123,"vijay");
}
}
