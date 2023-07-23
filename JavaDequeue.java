// Question 9: Java Dequeue

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-dequeue/problem




package assessment;
import java.util.*;

public class JavaDequeue {




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashMap<Integer,Integer>hm= new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int uc=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if(hm.containsKey(num)){
                int t=hm.get(num);
                hm.put(num, t+1);

            }else{hm.put(num, 1);}

            if(deque.size()==m){
                if(hm.size()>=uc){
                    uc=hm.size();
                }
                int t=(int)deque.poll();
                if(hm.get(t)==1){
                    hm.remove(t);
                }
                else{
                    int t1=hm.get(t);
                    hm.put(t, t1-1);   
                }   
            }    
            }
            System.out.println(uc);

        }





}


