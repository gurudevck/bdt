import scala.io.Source
object scalaWordCount{
	def main(args: Array[String]){
		val text = Source.fromFile("./word.txt").getLines.mkString
		val wordcount = scala.collection.mutable.Map[String,Int]()
		for(word<-text.split(","))
			wordcount(word)=if(wordcount.contains(word)) wordcount(word)+1 else 1
		println(wordcount)
	}
}