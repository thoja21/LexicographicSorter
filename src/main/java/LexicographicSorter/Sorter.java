package LexicographicSorter;

/**
 * @version 1.0.0
 * @author James
 */
public class Sorter {
    public static String[] sort(String[] words) {
	long len = words.length;
	
	for(int i = 0; i < len - 1; ++i) {
	    for (int x = i + 1; x < len; ++x) {
		if (words[i].compareTo(words[x]) > 0) {
		    String temp = words[i];
		    words[i] = words[x];
		    words[x] = temp;
		}
	    }
	}
	
	return words;
    }
}
