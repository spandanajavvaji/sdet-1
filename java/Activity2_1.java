package JavaActivityDay2;

abstract class Book
	{
		String  title;
		abstract void setTitle(String s);
		
		String getTitle()
		{
			return title;
		}
		
	}

	class MyBook extends Book
	{
		public void setTitle(String s)
		{
			title = s;
		}
	}
	public class Activity2_1 
	{
		public static void main(String[] args)
		{
			String title = "harry Potter";
			Book newNovel = new MyBook();
			newNovel.setTitle(title);
			System.out.println("title is:" + newNovel.getTitle());
		}
	} 


