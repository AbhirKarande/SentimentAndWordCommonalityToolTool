package main.java.com.nlp.app; 

public class SentimentAnalysis{
	public static void main(String[] args) {
		SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
		sentimentAnalyzer.init();
		SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(text);
	     System.out.println("Sentiments Classification:");
	     System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive()+"%");
	     System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
	     System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
	     System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");
	     System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative()+"%");
	     System.out.println("\nSentiments result:");
	     System.out.println("Sentiment Score: " + sentimentResult.getSentimentScore());
	     System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());

	}
}
