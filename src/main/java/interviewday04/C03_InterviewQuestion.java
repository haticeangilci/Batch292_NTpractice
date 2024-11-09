package interviewday04;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C03_InterviewQuestion {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 3, -2, 8, 0, 1, -1, 6);
        ikiKatinaCikar(numbers);
    }
    public static  void ikiKatinaCikar(List<Integer> numbers){
        List<Integer> newNumbers= numbers.stream().filter(t->t>0).map(t->t*2).sorted().toList();
        System.out.println("newNumbers = " + newNumbers);

    }
}