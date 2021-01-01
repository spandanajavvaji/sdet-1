package GroovyProject1;


class Activity1b {

	public static void main(def args) {	
		
		
		File file = new File("src/input.txt")
		file.createNewFile();
		def inputText = 'A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nTh1$ 1$ v3ry c0nfus1ng\n'
		file.write(inputText);
		
		file.eachLine { line ->
			if(line ==~ /^A.*Cow$/) {
				println " Line that end with 'Cow' is: $line"
			}
		}
		
		file.eachLine { line ->
			if(line ==~ /^J.*/) {
				println " Line that starts with J is: $line"
			}
		}
		file.eachLine { line ->
			if(line ==~ /.*\d\d.*/) {
				println " Line that has two adjacent numbers: $line"
			}
		}
		
		//to print the strings that match with the pattern 'S+er'
		def match1 = file.getText() =~ /\S+er/
		println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
		
		
		//to print the strings that match with the pattern '\s*\d\W'
		def match2 = file.getText() =~ /\s*\d\W/
		println "String(s) matching '/\\s*\\d\\W/' are: are ${match2.findAll()}"
		
	}

}
