package GroovyProject1

import java.awt.event.InputMethodListener

class Activity1a {

	public static void main(def args)
	{
		def inputList = [12, 3, 56, 90, "Apple", "Banana", "Mango"]
		
		def strList = inputList.minus([12, 3, 56, 90])

		def intList = inputList.minus(["Mango", "Apple", "Banana"])
		
		println strList.sort()
		println intList.sort()
	}

}
