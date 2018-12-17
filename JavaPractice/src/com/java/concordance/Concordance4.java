/**
 * 
 */
package com.java.concordance;

/**
 * @author saich
 *
 */
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Concordance4 {

	private Locale locale;
	private Map<String, List<Integer>> concordanceMap;  // Key = Word, Value = list of sentence numbers in which word appears

	public Concordance4(Locale locale) {
		this.locale = locale;
		this.concordanceMap = new TreeMap<String, List<Integer>>();
	}

	public void build(String text) {
		BreakIterator sentenceIterator = BreakIterator.getSentenceInstance(this.locale);
		BreakIterator wordIterator = BreakIterator.getWordInstance(this.locale);

		int sentenceCounter = 0;

		int sentenceIdx = 0;
		sentenceIterator.setText(text);

		// Go through sentences
		while (BreakIterator.DONE != sentenceIterator.next()) {
			String sentence = text.substring(sentenceIdx, sentenceIterator.current());
			sentenceCounter++;

			int wordIdx = 0;
			wordIterator.setText(sentence);

			// Go through words
			while (BreakIterator.DONE != wordIterator.next()) {
				String word = sentence.substring(wordIdx, wordIterator.current()).toLowerCase();

				if (Character.isLetterOrDigit(word.charAt(0))) {
					if (this.concordanceMap.containsKey(word)) {
						this.concordanceMap.get(word).add(sentenceCounter);
					} else {
						List<Integer> sentenceNumbers = new ArrayList<Integer>();
						sentenceNumbers.add(sentenceCounter);
						this.concordanceMap.put(word, sentenceNumbers);
					}
				}
				wordIdx = wordIterator.current();
			}
			sentenceIdx = sentenceIterator.current();
		}
	}

	public void print() {
		for (String word : this.concordanceMap.keySet()) {
			List<Integer> sentenceNumbers = this.concordanceMap.get(word);
			System.out.println(word + " {" + sentenceNumbers.size() + ":" + sentenceNumbers.toString() + "}");
		}
	}

	public static void main(String[] args) {
		String fileName = "C:\\Users\\saich\\eclipse-workspace\\JavaPractice\\heroqst1.txt";
		Charset inputEncoding = StandardCharsets.UTF_8;

		try {
			String text = new String(Files.readAllBytes(Paths.get(fileName)), inputEncoding);

			if (null != text && !text.trim().isEmpty()) {
				Concordance4 solution = new Concordance4(Locale.US);
				// Build concordance Map
				solution.build(text);
				// Print Result
				solution.print();
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IOException e) {
			System.out.println("Error: Could not load file " + fileName);
		} catch (IllegalArgumentException e) {
			System.out.println("Text file '" + fileName + "' is empty!");
		}
	}
}