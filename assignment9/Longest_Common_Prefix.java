package assignment9;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// Eg 1
				String[] arr1 = {"flower", "flow", "flight"};
				System.out.println("Example 1 Output: " + findLCP(arr1));

				// Eg 2
				String[] arr2 = {"dog", "racecar", "car"};
				System.out.println("Example 2 Output: " + findLCP(arr2));

				// Eg 3
				String[] arr3 = {"interview", "internet", "internal", "interval"};
				System.out.println("Example 3 Output: " + findLCP(arr3));
			}
			public static String findLCP(String[] strs) 
			{
				String prefix = strs[0];

				for (int i = 1; i < strs.length; i++) 
				{
					while (strs[i].indexOf(prefix) != 0) 
					{
						prefix = prefix.substring(0, prefix.length() - 1);

						if (prefix.isEmpty()) 
						{
							return "";
						}
					}
				}

				return prefix;
		}
	}


