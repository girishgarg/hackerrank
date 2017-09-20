import java.util.*;
import java.io.*;

public class DictionariesandMaps {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> dictionary = new HashMap<String,Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
             dictionary.put(name, phone);
            
        }
       
        while(in.hasNext()){
            
            String s = in.next();
             int j = 0;
             Set keys = dictionary.keySet();
            // Write code herex	
            //System.out.println(s);
            for(Iterator i = keys.iterator(); i.hasNext();){
           // System.out.println(key);
            	String key = (String) i.next();
            if(s.equals(key)){
                int value = dictionary.get(s);
                System.out.println(key+"="+value);
            	//System.out.println();
            }else{
               j++;
            }
            }
            if(j==n){
                System.out.println("Not found");
            }
        }
        in.close();
    }
}


/*int n;
string name;
long num;
cin >> n;
cin.ignore();
map <string, long> pBook;
for (int i = 0; i < n; i++) {
    cin >> name;
    cin >> num;
    pBook[name] = num;
}
while(cin >> name) {
    if (pBook.find(name) != pBook.end()) {
        cout << name << "=" << pBook.find(name)->second << endl;
    } else {
        cout << "Not found" << endl;
    }
}
 */